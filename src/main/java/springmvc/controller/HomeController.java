package springmvc.controller;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/home")
	public String home(Model model) {
    	/*
    	  sending data from controller to view using Model
    	  addAttribute(String key , Object value);
    	  to get it in view
    	  Object value = (Object)request.getAttribute("key");
    	  
    	 */
    	
    	System.out.println("this is home url");
    	model.addAttribute("name","mayuresh");
    	List<String> friends = new ArrayList<String>();
    	friends.add("f1");
    	friends.add("f2");
    	model.addAttribute("f", friends);
		return "index";
	}
    @RequestMapping("/about")
  	public String about() {
      	System.out.println("this is about url");
  		return "about";
  	}
    @RequestMapping("/help")
  	public ModelAndView help() {
     /*
  	  sending data from controller to view using ModelAndView
  	  addObject(String key , Object value);
  	  to get it in view
  	  Object value = (Object)request.getAttribute("key");
  	  
  	 */
      	System.out.println("this is help url");
      	ModelAndView modelAndView = new ModelAndView();
      	
      	//setting data
      	modelAndView.addObject("name","mayuresh");
      	LocalDateTime now = LocalDateTime.now();
      	modelAndView.addObject("time", now);
      	
      //setting view name
      	modelAndView.setViewName("help");
      	
      	List <Integer> marksList = new ArrayList<Integer>();
      	marksList.add(12);
      	marksList.add(25);
      	modelAndView.addObject("marks", marksList);
  		return modelAndView;
  	}
}
