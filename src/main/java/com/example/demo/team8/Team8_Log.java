package com.example.demo.team8;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Team8_Log {
	@After("execution(* com.example.demo.team8.Team8_Controller3.index(..))")
	public void afterLog(JoinPoint jp) {
		System.out.println("[質問2つ目]GET処理完了：" + jp.getSignature());
	}
}
