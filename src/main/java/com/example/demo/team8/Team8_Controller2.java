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
public class Team8_Controller2 {
	private final Team8_Service service;
	
	@GetMapping("/team8_3-3")
	public String index(@ModelAttribute("empForm3_3") Team8_EmpForm3_3 empForm) {
		
		try {
//			System.out.println("getメソッド実行");
			log.info("[質問画面3-3]getメソッドのinfoログ");
			return "team8/team8_question3-3";

		} catch(Exception e) {
			log.error("エラー発生");
			return "team8/team8_error";
		}
	}
	
	
	@PostMapping(value = "/team8_3-3", params = "next")
	public String send1(@ModelAttribute("empForm3_3") @Validated Team8_EmpForm3_3 empForm, BindingResult result, Model model) {
		
		try {
//			System.out.println("send1メソッド実行");
			
			if(result.hasErrors()) {
				log.info("[質問画面3-3]postメソッドのinfoログ");
				return "team8/team8_question3-3";
			}
		
			if(empForm.getQuestion3_3().equals("S5")) {
//				System.out.println(empForm.getQuestion3_3());
				List<Team8_Snack> data = service.findBySnackCd(empForm.getQuestion3_3());
				model.addAttribute("data", data);
				log.info("[質問画面3-3]postメソッドのinfoログ");
				return "team8/team8_kekka";
			}else if(empForm.getQuestion3_3().equals("S6")) {
				List<Team8_Snack> data = service.findBySnackCd(empForm.getQuestion3_3());
				model.addAttribute("data", data);
				log.info("[質問画面3-3]postメソッドのinfoログ");
				return "team8/team8_kekka";
			}
		} catch(Exception e) {
			log.error("エラー発生");
			return "team8/team8_error";
		}
		return null;
	}
	
	@PostMapping(value = "/team8_3-3", params = "back")
	public String send2(@ModelAttribute("empForm") Team8_EmpForm empForm) {
		
		try {
			log.info("[質問画面3-3]postメソッドのinfoログ");
			return "redirect:/team8_2-2";
		} catch(Exception e) {
			log.error("エラー発生");
			return "team8/team8_error";
		}
		
	}
	
}
