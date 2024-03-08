package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
    
	@RequestMapping("/redirectPrefix")
	public String redirectPrefix() {
		System.out.println("This is redirectPrefix handler");
		return "redirect:/two";  //"redirect:/url"
	}
	
	
	@RequestMapping("/redirected")
	public String redirected() {
		System.out.println("This is redirected handler");
		return "contact";
	}
	
	@RequestMapping("/redirectView")
	public RedirectView redirectView() {
		System.out.println("This is redirectView handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("redirected");  // '/' to be removed from url to make it relative url
		return redirectView;  //RedirectView
	}
}
