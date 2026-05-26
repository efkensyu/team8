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
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class Team8_Controller5 {
	private final Team8_Service service;
	
	@GetMapping("/team8_3-2")
	public String index(@ModelAttribute("empForm") Team8_EmpForm3_2 empForm) {
//		System.out.println("indexメソッド実行");
		log.info("[質問画面3-2]getメソッドのinfoログ");
		return "team8/team8_question3-2";
	}
	
	@PostMapping(value = "/team8_3-2", params = "next")
	public String send1(@ModelAttribute("empForm") @Validated Team8_EmpForm3_2 empForm, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			log.info("[質問画面3-2]postメソッドのinfoログ");
			return "team8/team8_question3-2";
		}
		
		if (empForm.getQuestion3_2().equals("S3")) {
//			System.out.println(empForm.getQuestion3_2());
			List<Team8_Snack> data = service.findBySnackCd(empForm.getQuestion3_2());
			model.addAttribute("data", data);
			log.info("[質問画面3-2]postメソッドのinfoログ");
			return "team8/team8_kekka";
		} else if (empForm.getQuestion3_2().equals("S4")) {
			List<Team8_Snack> data = service.findBySnackCd(empForm.getQuestion3_2());
			model.addAttribute("data", data);
			log.info("[質問画面3-2]postメソッドのinfoログ");
			return "team8/team8_kekka";
		}
		
		return "team8/team8_kekka";
	}
	
	
	@PostMapping(value = "/team8_3-2", params = "back")
	public String send3() {
//		System.out.println("send3実行");
		log.info("[質問画面3-2]postメソッドのinfoログ");
		return "redirect:/team8_2-1";
	}
}
