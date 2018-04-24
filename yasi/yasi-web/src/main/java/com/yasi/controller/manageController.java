package com.yasi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Sys")
public class manageController {
	@RequestMapping("/home")
	public String Syshome(String SysNo,Model model){
		model.addAttribute("mNO",SysNo);
		return "Syshome";
		
	}
}
