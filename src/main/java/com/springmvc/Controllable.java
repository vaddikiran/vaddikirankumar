package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controllable {
	@RequestMapping("/cup")
	public ModelAndView display(@RequestParam("name") String name) {
		ModelAndView view=new ModelAndView();
		view.addObject("name", name);
		view.setViewName("dispaly.jsp");
		return view;
}

}
