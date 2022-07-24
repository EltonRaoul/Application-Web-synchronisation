package com.server.api.Controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.server.api.Models.Cites;

@Controller
@RequestMapping("/view")
public class templapleControlle {
	
	@GetMapping("indexPage")
	String indexPage() {
	return  "index";	
	}
	
	
	@GetMapping("cite")
	String citePage() {
	return  "cite";	
	}
	
	@GetMapping("batiment")
	String buildingPage() {
	return  "batiment";	
	}
	
	@GetMapping("logement")
	String homePage() {
	return  "logement";	
	}
	
	@PostMapping("/addCite")
	public String addPerson(@Valid Cites cite, BindingResult result, Model model) {
	  if (result.hasErrors()) {
	    return "add-person";
	  }
	  System.out.print("ok");
	  return "redirect:/index";
	}
}
