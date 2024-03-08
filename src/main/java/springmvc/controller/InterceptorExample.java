package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorExample {

	@RequestMapping("/interceptForm")
	public String filtering() {
		return "form";
	}
	
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("userName") String userName, Model model) {
		System.out.println(userName);
		model.addAttribute("userName",userName);
		return "welcome";
	}
}
