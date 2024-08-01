package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	//@RequestMapping(value= "/helloPage", method= RequestMethod.GET)
	@GetMapping("/helloPage")
	public ModelAndView openHelloPage()
	{
		System.out.println("openhellopage() method executed");
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("hello");
		
		return mav;
	}

	@GetMapping("/aboutUs")
	public String openAboutUsPage()
	{
		return "about-us";
	}
}
