package gr.hua.dit.ds.springmvcdemo1.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gr.hua.dit.ds.springmvcdemo1.dao.ContractsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.ds.springmvcdemo1.entity.Contracts;

@Controller
@RequestMapping("/simbolaiografos")
public class SimbolaiografosController {

	@Autowired
	private ContractsDAO ContractsDAO;

	@GetMapping("/requests")
	public String GetRequests(Model model) {

		List<Contracts> subjects = ContractsDAO.getContracts();

		model.addAttribute("reqlist",subjects);

		return "getrequests";
	}

	@PostMapping("/status")
	public String AcceptRequests(HttpServletRequest request, HttpServletResponse response, Model model) {

		int id = Integer.parseInt(request.getParameter("id"));

		System.out.println(id);

		model.addAttribute("Subject", ContractsDAO.getContracts());

		String button = request.getParameter("decline");

		if (button != null) {

			ContractsDAO.UpdateContract_2(id, "There is not an agreement");

		} else {

			ContractsDAO.UpdateContract_2(id, "End of Marriage");


		}

		return "redirect:/simbolaiografos/requests";
	}

	@GetMapping("/update")
	public String updateDayoffs() {


		// System.out.println("In progress");
		return "redirect:/simbolaiografos/requests";
	}
}
