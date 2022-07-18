package com.server.api.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.api.Service.CiteService;

@Controller
@RequestMapping("/Hello")
public class CiteWebController {
	
	@Autowired
	private CiteService citeService;
	
	
	@GetMapping()
	public String HelloWorld(Model model) {
		
		model.addAttribute("listeCite", citeService.getAllCite());
		
		return "index";
	}

}
