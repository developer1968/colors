package it.javaboss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.javaboss.service.ColorsService;

@Controller
public class ColorsController {
	
	 @Autowired
	 private ColorsService colorsService;
	
	@GetMapping("/colors")
	public String chooseColor() {
		System.out.println("scegli il colore");
		
		
		String msgWelcome = System.getenv("msg.welcome");
		System.out.println("ColorsController.chooseColor msgWelcome: "+msgWelcome);
		//String colorDB = colorsService.getColor();
		return "choose_colors";
	}
	
	@PostMapping("/postColor") 
	public String mostraColore(@RequestParam("color") String color, Model model) {
		System.out.println("color scelto:"+color);
		
		//call the BE for saving the choosed color
		colorsService.saveColor(color);
		
		
		model.addAttribute("color", color);
		return "color";
	}

}
