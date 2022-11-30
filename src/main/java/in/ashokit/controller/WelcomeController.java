package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController 
{
	@GetMapping("/weclome")
	public String getWelcomeMsg(Model model)
	{
		model.addAttribute("msg","KL CHAMP Welcome to RCB");
		return "index";
	}

}
