package it.javaboss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ColorsController {

	
	@GetMapping("/colors")
	public String chooseColor() {
		System.out.println("scegli il colore";
		return "choose_colors";
	}
	
	@PostMapping("/postColor") 
	public String mostraColore(@RequestParam("color") String color, Model model) {
		System.out.println("color scelto:"+color);
		model.addAttribute("color", color);
		return "color";
	}

}
