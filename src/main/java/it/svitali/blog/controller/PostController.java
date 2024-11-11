package it.svitali.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/home")
public class PostController {
	
	@GetMapping()
	public String index() {
		return "/post/index";
	}	
	
	
//fine classe
}