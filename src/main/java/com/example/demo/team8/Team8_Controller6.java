package com.example.demo.team8;

import java.util.List;
import java.util.UUID;

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
public class Team8_Controller6 {
	private final Team8_Service service;
	private final Team8_RankingRepository rankingRepository;
	
	@GetMapping("/team8_3-4")
	public String index(@ModelAttribute("empForm3_4") Team8_EmpForm3_4 empForm) {
		try {
//			System.out.println("indexメソッド実行");
			log.info("[質問画面3-4]getメソッドのinfoログ");
			return "team8/team8_question3-4";
		} catch(Exception e) {
			log.error("エラー発生");
			return "team8/team8_error";
		}
	}
	
	@PostMapping(value = "/team8_3-4", params = "next")
	public String send1(@ModelAttribute("empForm3_4") @Validated Team8_EmpForm3_4 empForm, BindingResult result,
			@ModelAttribute("empFormN") Team8_EmpFormName empFormN, Model model) {
		try {
			if (result.hasErrors()) {
				log.info("[質問画面3-4]postメソッドのinfoログ");
				return "team8/team8_question3-4";
			}
			
			if (empForm.getQuestion3_4().equals("S7")) {
//				System.out.println(empForm.getQuestion3_4());
				List<Team8_Snack> data = service.findBySnackCd(empForm.getQuestion3_4());
				model.addAttribute("data", data);
				
				//ランキング
				Team8_Ranking ranking = new Team8_Ranking();
				ranking.setResultCd(UUID.randomUUID().toString());
				ranking.setUserNm(empFormN.getName());
				ranking.setSnackCd(empForm.getQuestion3_4());
				rankingRepository.save(ranking);
				
				List<Object[]> ranking1 = rankingRepository.getRanking();
				model.addAttribute("ranking", ranking1);
				System.out.println(ranking);
				
				log.info("[質問画面3-4]postメソッドのinfoログ");
				return "team8/team8_kekka";
			} else if (empForm.getQuestion3_4().equals("S8")) {
				List<Team8_Snack> data = service.findBySnackCd(empForm.getQuestion3_4());
				model.addAttribute("data", data);
				
				//ランキング
				Team8_Ranking ranking = new Team8_Ranking();
				ranking.setResultCd(UUID.randomUUID().toString());
				ranking.setUserNm(empFormN.getName());
				ranking.setSnackCd(empForm.getQuestion3_4());
				rankingRepository.save(ranking);
				
				List<Object[]> ranking1 = rankingRepository.getRanking();
				model.addAttribute("ranking", ranking1);
				System.out.println(ranking);
				
				log.info("[質問画面3-4]postメソッドのinfoログ");
				return "team8/team8_kekka";
			}
		} catch(Exception e) {
			log.error("エラー発生");
			return "team8/team8_error";
		}
		return "team8/team8_kekka";
	}
	
	
	@PostMapping(value = "/team8_3-4", params = "back")
	public String send2() {
		try {
//			System.out.println("send2実行");
			log.info("[質問画面3-4]postメソッドのinfoログ");
			return "redirect:/team8_2-2";
		} catch(Exception e) {
			log.error("エラー発生");
			return "team8/team8_error";
		}
	}
}
