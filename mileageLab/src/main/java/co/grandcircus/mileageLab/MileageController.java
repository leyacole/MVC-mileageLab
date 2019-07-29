package co.grandcircus.mileageLab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/")
public class MileageController {
	
	@RequestMapping("/")
	public ModelAndView showHome() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/getmileage-form")
	public ModelAndView showMileageForm() {
		return new ModelAndView("mileage-form");
	}
	
	@RequestMapping("/get-result")
	public ModelAndView showMileageResult(
			@RequestParam("mpg") int mpg,
			@RequestParam("gallons") int gallons) {
			int result = gallons * mpg;
		
			ModelAndView mav = new ModelAndView ("mileage-result");
		
			mav.addObject("mpg", mpg);
			mav.addObject("gallons", gallons);
			mav.addObject("result", result);
			return mav;
	}
	
	@RequestMapping("/addnumb-form")
	public ModelAndView showAddForm() {
		return new ModelAndView("addnumber-form");
	}
	
	@RequestMapping("/add-result")
	public ModelAndView showAddResult(
			@RequestParam("num1") int num1,
			@RequestParam("num2") int num2) {
		
		int result = num1 + num2;
		
		ModelAndView mav = new ModelAndView("add-result");
//		mav.setViewName("addition-result"); - or can do it this way
		mav.addObject("num1", num1);
		mav.addObject("num2", num2);
		mav.addObject("result", result);
		return mav;
	}
	
	@RequestMapping("/subnumb-form")
	public ModelAndView showSubForm() {
		return new ModelAndView("subnumber-form");
	}
	
	@RequestMapping("/sub-result")
	public ModelAndView showSubResult(
			@RequestParam("num1") int num1,
			@RequestParam("num2") int num2) {
		
		int result = num1 - num2;
		
		ModelAndView mav = new ModelAndView("sub-result");
//		mav.setViewName("addition-result"); - or can do it this way
		mav.addObject("num1", num1);
		mav.addObject("num2", num2);
		mav.addObject("result", result);
		return mav;
	}
	
	@RequestMapping("/multinumb-form")
	public ModelAndView showMultiForm() {
		return new ModelAndView("multinumber-form");
	}
	
	@RequestMapping("/multi-result")
	public ModelAndView showMultiResult(
			@RequestParam("num1") int num1,
			@RequestParam("num2") int num2) {
		
		int result = num1 * num2;
		
		ModelAndView mav = new ModelAndView("multi-result");
//		mav.setViewName("addition-result"); - or can do it this way
		mav.addObject("num1", num1);
		mav.addObject("num2", num2);
		mav.addObject("result", result);
		return mav;
	}
	
	@RequestMapping("/divnumb-form")
	public ModelAndView showDivForm() {
		return new ModelAndView("divnumber-form");
	}
	
	@RequestMapping("div-result")
	public ModelAndView showDivResult(
			@RequestParam("num1") int num1,
			@RequestParam("num2") int num2) {
		
		int result1 = num1 / num2;
		int result2 = num1 % num2;
		
		ModelAndView mav = new ModelAndView("div-result");
//		mav.setViewName("addition-result"); - or can do it this way
		mav.addObject("num1", num1);
		mav.addObject("num2", num2);
		mav.addObject("result1", result1);
		mav.addObject("result2", result2);
		return mav;
	}





}
