package gr.hua.dit.ds.restdemo.controller;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import gr.hua.dit.ds.restdemo.entity.Contracts;
import gr.hua.dit.ds.restdemo.repositiry.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import org.springframework.http.MediaType;


import gr.hua.dit.ds.restdemo.entity.User;
import gr.hua.dit.ds.restdemo.repositiry.AdminRepository;


@RestController
public class UserController {

	private final List<String> type = Arrays.asList("onoma_simvoleografou","onoma_sizigou_1", " onoma_sizigou_2",  "onomadikigorou2",  "imerominia",  "topos_katoikias",  "patronymo", "mitronimo", "dieuthinsi", "AT", "AFM", "patronymo2", "mitronimo2","dieuthinsi2", "AT2", "AFM2", "gamos", "tekna", "epimelia");

	@Autowired
	private SubjectsRepository subjectsRepository;

	@Autowired AdminRepository AdminRepository;

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(value = "/User",produces =MediaType.APPLICATION_JSON_VALUE)
	public List<Contracts> getSubjects(Authentication authentication) {
		User user=new User();
		user.setUsername(authentication.getName());
		List<Contracts> subjects=subjectsRepository.findByUsername(user);
		if(!subjects.isEmpty()) {
			System.out.println(subjects.get(0).getUser().getUsername());
		}
		return subjects;
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping(value = "/User",consumes =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> createDayoff(@RequestBody Contracts contracts, Authentication authentication){
		//System.out.println(dayoffs.getStartdate());


		// Milliseconds


		contracts.setState("Pending");
		contracts.setState2("Wait for checks...");

		User user=AdminRepository.getOne(authentication.getName());

		contracts.setUser(user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(contracts.getUser().getUsername()).toUri();

		subjectsRepository.save(contracts);

		return ResponseEntity.created(location).build();

	}

}

