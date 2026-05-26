package com.example.demo.team8;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class Team8_Controller3 {
	@GetMapping("/team8_2-2")
	public String index(@ModelAttribute("empForm") Team8_EmpForm2_2 empForm) {
//		System.out.println("indexメソッド実行");
		log.info("[質問画面2-2]getメソッドのinfoログ");
		return "team8/team8_question2-2";
	}
	
	@PostMapping(value = "/team8_2-2", params = "next")
	public String send1(@ModelAttribute("empForm") @Validated Team8_EmpForm2_2 empForm, BindingResult result) {
//		System.out.println(result.hasErrors());
		if (result.hasErrors()) {
			log.info("[質問画面2-2]postメソッドのinfoログ");
			return "team8/team8_question2-2";
		}
		
		if (empForm.getQuestion2_2().equals("answer1")) {
//			System.out.println(empForm.getQuestion2_2());
			log.info("[質問画面2-2]postメソッドのinfoログ");
			return "redirect:/team8_3-3";
		} else if (empForm.getQuestion2_2().equals("answer2")) {
//			System.out.println(empForm.getQuestion2_2());
			log.info("[質問画面2-2]postメソッドのinfoログ");
			return "redirect:/team8_3-4";
		}
		
		return "team8/team8_kekka";
	}
	
	
	@PostMapping(value = "/team8_2-2", params = "back")
	public String send2(@ModelAttribute("empForm") Team8_EmpForm empForm) {
//		System.out.println("send3実行");
		log.info("[質問画面2-2]postメソッドのinfoログ");
		return "redirect:/team8_1";
	}
}
