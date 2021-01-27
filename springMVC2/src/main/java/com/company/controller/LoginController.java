package com.company.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.domain.LoginVO;

import lombok.extern.log4j.Log4j2;

@Log4j2 //로그처리 하기위해 사용
@Controller
public class LoginController {	

	// get => login.jsp
	// post => 사용자가 입력한 데이터를 가져와서 db작업
	@GetMapping("/login") //경로가 http://localhost:8080/이면 login메소드호출
	public void loginGet() {
		log.info("login get...."); // login => view 리졸버로 전송
	}

	/* 1) 기존방법대로 사용자 입력값 가져오기(사용빈도 낮음)
	 * 
	 * @PostMapping("/login") //경로가 http://localhost:8080/이면 login메소드호출 public void
	 * public void loginPost(HttpServletRequest request) { log.info("login post...."); // login
	 * 
	 * log.info("userid"+request.getParameter("userid"));
	 * log.info("password"+request.getParameter("password")); }
	 */


	//2) 파라메터 처리(단, jsp의 name 맞추기)
	//단점 => 받아올 인자가 많아지면 번거러움

	@PostMapping("/login") 
	public void loginPost(String userid, String password) {

		log.info("login post...."); // login log.info("login post....");
		log.info("userid : "+userid); log.info("password : "+password); }


	/*
	 * @PostMapping("/login") public void loginPost(LoginVO vo) {
	 * 
	 * log.info("login post...."); // login => view 리졸버
	 * log.info("userid : "+vo.getUserid());
	 * log.info("password : "+vo.getPassword()); }
	 */
}




