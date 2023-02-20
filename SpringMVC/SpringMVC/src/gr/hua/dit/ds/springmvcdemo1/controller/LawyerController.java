package gr.hua.dit.ds.springmvcdemo1.controller;

import gr.hua.dit.ds.springmvcdemo1.dao.ContractsDAO;
import gr.hua.dit.ds.springmvcdemo1.entity.Contracts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/lawyerController")
public class LawyerController {

	@Autowired
	private ContractsDAO ContractsDAO;

	@GetMapping("/req")
	public String GetRequests(Model model) {

		List<Contracts> subjects = ContractsDAO.getContracts();

		model.addAttribute("reqlist",subjects);

		return "getreq";
	}



	@PostMapping("/status")
	public String AcceptRequests(HttpServletRequest request, HttpServletResponse response, Model model) {

		int id = Integer.parseInt(request.getParameter("id")); // Gets selected user's id from getrequests.jsp

		System.out.println(id);

		model.addAttribute("Contract", ContractsDAO.getContracts());
		// System.out.println(doffs.toString());
		String button = request.getParameter("decline");

		if (button != null) {

		ContractsDAO.UpdateContract(id, "Declined");

		} else {

			ContractsDAO.UpdateContract(id, " Contract Accepted");

		}

		
		return "redirect:/lawyerController/req";
	}
	@GetMapping("/classification")
	public void GetClassification(HttpServletRequest request)

	{
		int id = Integer.parseInt(request.getParameter("id")); // Gets selected user's id from getrequests.jsp
		ContractsDAO.ReturnClassification(id);
	}

}
