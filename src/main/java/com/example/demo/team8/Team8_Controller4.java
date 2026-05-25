package com.example.demo.team8;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class Team8_Controller4 {
	private final Team8_Service service;
	
	@GetMapping("/team8_3-1")
	public String index(@ModelAttribute("empForm") Team8_EmpForm3_1 empForm) {
//		System.out.println("indexメソッド実行");
		return "team8/team8_question3-1";
	}
	
	@PostMapping(value = "/team8_3-1", params = "next")
	public String send1(@ModelAttribute("empForm") @Validated Team8_EmpForm3_1 empForm, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			return "team8/team8_question3-1";
		}
		
		if (empForm.getQuestion3_1().equals("S1")) {
//			System.out.println(empForm.getQuestion3_1());
			List<Team8_Snack> data = service.findBySnackCd(empForm.getQuestion3_1());
			model.addAttribute("data", data);
			return "team8/team8_kekka";
		} else if (empForm.getQuestion3_1().equals("S2")) {
//			System.out.println(empForm.getQuestion3_1());
			List<Team8_Snack> data = service.findBySnackCd(empForm.getQuestion3_1());
			model.addAttribute("data", data);
			return "team8/team8_kekka";
		}
		
		return "team8/team8_question3-3";
	}
	
	
	@PostMapping(value = "/team8_3-1", params = "back")
	public String send3(@ModelAttribute("empForm") Team8_EmpForm empForm) {
//		System.out.println("send3実行");
		return "redirect:/team8_2-1";
	}
}
