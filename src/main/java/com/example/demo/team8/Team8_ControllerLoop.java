package com.example.demo.team8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class Team8_ControllerLoop {
//	@GetMapping("/team8_kekka")
//	public String index() {
////		System.out.println("indexメソッド実行");
//		log.info("[診断結果画面]getメソッドのinfoログ");
//		return "team8/team8_kekka";
//	}
	
	@PostMapping("/team8_kekka")
	public String send(@RequestParam String restart, Model model) {
		model.addAttribute("restart", restart);
//		System.out.println("sendメソッド実行");
		log.info("[診断結果画面]postメソッドのinfoログ");
		return "team8/team8_start";
	}
}
