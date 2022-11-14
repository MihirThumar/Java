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
	public String home(Model model)
	{
		System.out.println("this is home url");
		 
		model.addAttribute("name","Mihir Thumar");
		model.addAttribute("id",121);
		
		List<String> abc = new ArrayList<String>();
		abc.add("Rakesh\n");
		abc.add("Tapan");
		abc.add("Ramesh");
		
		model.addAttribute("ab",abc);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about controller");
		return"about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("this is help controller");
		// Creating model and view object 
		ModelAndView mav = new ModelAndView();
		
		// Setting the data
		mav.addObject("name","Itachi");
		mav.addObject("ID", 16);
		LocalDateTime now = LocalDateTime.now();
		mav.addObject("time", now);
		
		//marks
		List<Integer> list =new ArrayList<Integer>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(99);
		
		mav.addObject("marks",list); 
		
		// Seeting the view name
		mav.setViewName("help");
		return mav;
	}
	
}
