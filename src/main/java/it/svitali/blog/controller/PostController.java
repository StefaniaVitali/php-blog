package it.svitali.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.svitali.blog.model.Post;
import it.svitali.blog.repository.PostRepository;

@Controller
@RequestMapping ("/home")
public class PostController {
	
	@Autowired
	private PostRepository postRepository;
	
	@GetMapping()
	public String index(Model model) {
		
		List<Post> listaPost = postRepository.findAll();
		model.addAttribute("listaPost", listaPost);
		return "/post/index";
		
	}	
	
	
//fine classe
}
