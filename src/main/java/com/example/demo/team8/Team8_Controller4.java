package com.example.demo.team8;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@SessionAttributes({"empFormN", "empForm"})
@Slf4j
@RequiredArgsConstructor
@Controller
public class Team8_Controller4 {
	private final Team8_Service service;
	
	@GetMapping("/team8_3-1")
	public String index(@ModelAttribute("empForm3-1") Team8_EmpForm3_1 empForm) {
		try {
//			System.out.println("indexメソッド実行");
			log.info("[質問画面3-1]getメソッドのinfoログ");
			return "team8/team8_question3-1";
		} catch(Exception e) {
			log.error("エラー発生");
			return "team8/team8_error";
		}
	}
	
	@PostMapping(value = "/team8_3-1", params = "next")
	public String send1(@ModelAttribute("empForm3-1") @Validated Team8_EmpForm3_1 empForm, BindingResult result,
			@ModelAttribute("empFormN") Team8_EmpFormName empFormN, Model model) {
		try {
			if (result.hasErrors()) {
				log.info("[質問画面3-1]postメソッドのinfoログ");
				return "team8/team8_question3-1";
			}
			
			if (empForm.getQuestion3_1().equals("S1")) {
//				System.out.println(empForm.getQuestion3_1());
				List<Team8_Snack> data = service.findBySnackCd(empForm.getQuestion3_1());
				model.addAttribute("data", data);
				log.info("[質問画面3-1]postメソッドのinfoログ");
				return "team8/team8_kekka";
			} else if (empForm.getQuestion3_1().equals("S2")) {
//				System.out.println(empForm.getQuestion3_1());
				List<Team8_Snack> data = service.findBySnackCd(empForm.getQuestion3_1());
				model.addAttribute("data", data);
				log.info("[質問画面3-1]postメソッドのinfoログ");
				return "team8/team8_kekka";
			}
		} catch(Exception e) {
			log.error("エラー発生");
			return "team8/team8_error";
		}
		return null;
	}
	
	
	@PostMapping(value = "/team8_3-1", params = "back")
	public String send3(@ModelAttribute("empForm3-1") Team8_EmpForm3_1 empForm) {
		try {
//			System.out.println("send3実行");
			log.info("[質問画面3-1]postメソッドのinfoログ");
			return "redirect:/team8_2-1";
		} catch(Exception e) {
			log.error("エラー発生");
			return "team8/team8_error";
		}
	}
}
