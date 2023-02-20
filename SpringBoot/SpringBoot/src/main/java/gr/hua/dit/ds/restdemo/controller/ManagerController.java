package gr.hua.dit.ds.restdemo.controller;

import java.util.List;

import gr.hua.dit.ds.restdemo.entity.Contracts;
import gr.hua.dit.ds.restdemo.repositiry.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerController {
	// Parameters
	
	@Autowired
	private SubjectsRepository ManagerRepository;
	
	//Mappings

	@GetMapping("/Manager")
	public List<Contracts> retrieveAllSubjects() {
		return ManagerRepository.findAll();
	}
	
	//Retrive a list of all subjects with id parameter
	@GetMapping("/Manager/{state}")
	public List<Contracts> retreiveByUsername(@PathVariable String state) {
		
		List<Contracts> subjs = ManagerRepository.findByState(state);
		
		if (subjs.isEmpty())
			throw new AttributeNotFoundException("state-" + state);
		
		
		return subjs;
	}
	
	
}
