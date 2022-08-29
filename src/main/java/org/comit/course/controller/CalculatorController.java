package org.comit.course.controller;

import java.math.BigDecimal;

import org.comit.course.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class CalculatorController {
@Autowired
	UserService userService;

	@GetMapping({ "/", "/calculate" })
	public String init() {
		System.out.println("Initcalculator");
		return "calculator";
	}

	@PostMapping("/calculate")
	public ModelAndView show(@RequestParam BigDecimal num1, @RequestParam BigDecimal num2,
			@RequestParam String operation) {
		System.out.println(num1 + " " + num2 + " " + operation);
		BigDecimal result = userService.doLogic(num1, num2, operation);

		System.out.printf("calculation completed!  ");
		System.out.println(result);
		return new ModelAndView("calculator", "res", result);
	}

}
