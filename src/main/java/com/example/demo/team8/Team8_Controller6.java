package com.example.demo.team8;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Team8_Controller6 {
	@GetMapping("/team8_3-4")
	public String index(@ModelAttribute("empForm") Team8_EmpForm3_4 empForm) {
		System.out.println("indexメソッド実行");
		return "team8/team8_question3-4";
	}
	
	@PostMapping(value = "/team8_3-4", params = "next")
	public String send1(@ModelAttribute("empForm") @Validated Team8_EmpForm3_4 empForm, BindingResult result) {
		
		if (result.hasErrors()) {
			return "team8/team8_question3-4";
		}
		
		if (empForm.getQuestion3_4().equals("answer1")) {
			System.out.println(empForm.getQuestion3_4());
			return "team8/team8_kekka";
		} else if (empForm.getQuestion3_4().equals("answer2")) {
			return "team8/team8_kekka";
		}
		
		return "team8/team8_kekka";
	}
	
	
	@PostMapping(value = "/team8_3-4", params = "back")
	public String send3() {
		System.out.println("send3実行");
		return "team8/team8_question2-2";
	}
}
