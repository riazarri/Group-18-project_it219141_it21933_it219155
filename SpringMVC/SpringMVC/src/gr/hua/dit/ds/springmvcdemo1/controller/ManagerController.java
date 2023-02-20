package gr.hua.dit.ds.springmvcdemo1.controller;


import gr.hua.dit.ds.springmvcdemo1.dao.ContractsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
public class ManagerController {

	@Autowired
	private ContractsDAO ContractsDAO;

	@GetMapping(value = { "/", "" })
	public String viewRequests(Model model) {

		model.addAttribute("reqlist", ContractsDAO.getContracts()); //

		return "getrequests";
	}

}
