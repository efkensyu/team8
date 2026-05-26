package com.example.demo.team8;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class Team8_Log {
//	Controller1-------------------------------------------------------
	
	//スタート画面表示
	@After("execution(* com.example.demo.team8.Team8_Controller1.index(..))")
	public void afterLog1(JoinPoint jp) {
		System.out.println("[スタート画面]GET処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
	//スタート画面から質問画面１
	@After("execution(* com.example.demo.team8.Team8_Controller1.send1(..))")
	public void afterLo2(JoinPoint jp) {
		System.out.println("[スタート画面]POST処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
	//質問画面１表示
	@After("execution(* com.example.demo.team8.Team8_Controller1.index1(..))")
	public void afterLog3(JoinPoint jp) {
		System.out.println("[質問画面1]GET処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
	//質問画面１から質問画面２
	@After("execution(* com.example.demo.team8.Team8_Controller1.send2(..))")
	public void afterLog4(JoinPoint jp) {
		System.out.println("[質問画面1]POST処理完了：" + jp.getSignature());
	}
	
	//質問画面１からスタート画面に戻る処理
	@After("execution(* com.example.demo.team8.Team8_Controller1.send3(..))")
	public void afterLog5(JoinPoint jp) {
		System.out.println("[質問画面1(戻る)]POST処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}

//	Controller7-------------------------------------------------------	
	//質問画面２－１
	@After("execution(* com.example.demo.team8.Team8_Controller7.index(..))")
	public void afterLog6(JoinPoint jp) {
		System.out.println("[質問画面2-1]GET処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
	//質問画面２ー１から質問画面３
	@After("execution(* com.example.demo.team8.Team8_Controller7.send1(..))")
	public void afterLog7(JoinPoint jp) {
		System.out.println("[質問画面2-1]POST処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
	//質問画面２－１から質問画面１
	@After("execution(* com.example.demo.team8.Team8_Controller7.send3(..))")
	public void afterLog8(JoinPoint jp) {
		System.out.println("[質問画面2-1(戻る)]POST処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
//	Controller4-------------------------------------------------------	
	//質問画面３ー１表示
	@After("execution(* com.example.demo.team8.Team8_Controller4.index(..))")
	public void afterLog9(JoinPoint jp) {
		System.out.println("[質問画面3-1]GET処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
	//質問画面３から診断結果
	@After("execution(* com.example.demo.team8.Team8_Controller4.send1(..))")
	public void afterLog10(JoinPoint jp) {
		System.out.println("[質問画面3-1]POST処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
	//質問画面３ー１から質問画面２ー１
	@After("execution(* com.example.demo.team8.Team8_Controller4.send3(..))")
	public void afterLog11(JoinPoint jp) {
		System.out.println("[質問画面3-1(戻る)]POST処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
//	Controller5-------------------------------------------------------	
	//質問画面３ー２表示
	@After("execution(* com.example.demo.team8.Team8_Controller5.index(..))")
	public void afterLog12(JoinPoint jp) {
		System.out.println("[質問画面3-2]GET処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
	//質問画面３ー２から診断結果
	@After("execution(* com.example.demo.team8.Team8_Controller5.send1(..))")
	public void afterLog13(JoinPoint jp) {
		System.out.println("[質問画面3-2]POST処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
	//質問画面３ー２から質問画面２－１
	@After("execution(* com.example.demo.team8.Team8_Controller5.send3(..))")
	public void afterLog14(JoinPoint jp) {
		System.out.println("[質問画面3-2(戻る)]POST処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
//	Controller3-------------------------------------------------------
	//質問画面２－２表示
	@After("execution(* com.example.demo.team8.Team8_Controller3.index(..))")
	public void afterLog15(JoinPoint jp) {
		System.out.println("[質問画面2-2]GET処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
	//質問画面２－２から質問画面３
	@After("execution(* com.example.demo.team8.Team8_Controller3.send1(..))")
	public void afterLog16(JoinPoint jp) {
		System.out.println("[質問画面2-2]POST処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
	//質問画面２－２から質問画面１
	@After("execution(* com.example.demo.team8.Team8_Controller3.send2(..))")
	public void afterLog17(JoinPoint jp) {
		System.out.println("[質問画面2-2(戻る)]POST処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
//	Controller2-------------------------------------------------------
	//質問画面３－３表示
	@After("execution(* com.example.demo.team8.Team8_Controller2.index(..))")
	public void afterLog18(JoinPoint jp) {
		System.out.println("[質問画面3-3]GET処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
	//質問画面３－３から診断結果
	@After("execution(* com.example.demo.team8.Team8_Controller2.send1(..))")
	public void afterLog19(JoinPoint jp) {
		System.out.println("[質問画面3-3]POST処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
	//質問画面３－３から質問画面２－２
	@After("execution(* com.example.demo.team8.Team8_Controller2.send2(..))")
	public void afterLog20(JoinPoint jp) {
		System.out.println("[質問画面3-3(戻る)]POST処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
//	Controller6-------------------------------------------------------
	//質問画面３－４表示
	@After("execution(* com.example.demo.team8.Team8_Controller6.index(..))")
	public void afterLog21(JoinPoint jp) {
		System.out.println("[質問画面3-4]GET処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
	//質問画面３－４から診断結果
	@After("execution(* com.example.demo.team8.Team8_Controller6.send1(..))")
	public void afterLog22(JoinPoint jp) {
		System.out.println("[質問画面3-4]POST処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
	//質問画面３－４から質問画面２－２
	@After("execution(* com.example.demo.team8.Team8_Controller6.send2(..))")
	public void afterLog23(JoinPoint jp) {
		System.out.println("[質問画面3-4(戻る)]POST処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
//	ControllerLoop-------------------------------------------------------
	//診断結果画面表示
	@After("execution(* com.example.demo.team8.Team8_ControllerLoop.index(..))")
	public void afterLog24(JoinPoint jp) {
		System.out.println("[診断結果画面]GET処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
	//診断結果からスタート画面
	@After("execution(* com.example.demo.team8.Team8_ControllerLoop.send(..))")
	public void afterLog25(JoinPoint jp) {
		System.out.println("[診断結果画面]POST処理完了：" + jp.getSignature());
		System.out.println("送ったデータ：" + Arrays.toString(jp.getArgs()));
	}
	
	
//	エラー処理-------------------------------------------------------
	@AfterThrowing("execution(* com.example.demo.team8.*.*(..))")
	public void afterThrowing1(JoinPoint jp) {
		log.error("エラー発生。[引数] = {}", Arrays.toString(jp.getArgs()));
	}
}
