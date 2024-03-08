package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
    @Autowired
	private UserService userService;
    
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	//handling form using @RequestParam
//	@RequestMapping(path = "/processform",method = RequestMethod.POST)
//	public ModelAndView handleForm(
//			@RequestParam("email") String email,
//			@RequestParam("userName") String userName,
//			@RequestParam("password") String password) {
//		System.out.println("user email is "+email);
//		System.out.println("user name is "+userName);
//		System.out.println("user password is "+password);
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("email",email);
//		modelAndView.addObject("userName",userName);
//		modelAndView.addObject("password",password);
//		modelAndView.setViewName("success");
//		return modelAndView;
//	}
	
	//handling form using @ModelAttribute
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public ModelAndView handleForm(@ModelAttribute User user) {
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		if(user.getUserName().isBlank()) {
			modelAndView.setViewName("contact");
			return modelAndView;
		}
		int createdUser = this.userService.createUser(user);
		modelAndView.addObject("msg","User created with id "+createdUser);
		modelAndView.setViewName("success");
		return modelAndView;
	}
	
	/* 
	 * @ModelAttribute can also be use on method, method on which we are setting a data that need to be set on each
	 * handler call and fetch on its view.For example below we are setting a data that is set on both contact and
	 * processForm call and fetch on its view*/
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Spring MVC");
		m.addAttribute("desc", "Handling Form in Spring MVC");
	}
	
	
}
