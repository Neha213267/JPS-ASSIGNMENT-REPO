package MVCQ2;


	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.servlet.ModelAndView;

	@Controller
	public class SimpleIntrestController {
		
		@RequestMapping(value="/simpleIntrestCalculator",method = RequestMethod.GET)
		public ModelAndView simpleIntrest() {
			ModelAndView modelAndView = new ModelAndView("simpleInterest");
			return modelAndView;
		}
		
		@RequestMapping(value="/calculateSI",method=RequestMethod.POST)
		public ModelAndView calculateSI(@ModelAttribute("SI")SICalc SI) {
			ModelAndView modelAndView = new ModelAndView("view");
			double msg = SI.ROICal();
			modelAndView.addObject("msg",msg);
			return modelAndView;
			
		}

}
