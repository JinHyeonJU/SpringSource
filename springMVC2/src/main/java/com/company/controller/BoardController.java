package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
@RequestMapping("/board/*") // http://localhost:8080/board/
public class BoardController {
	
	@GetMapping("/insert") // http://localhost:8080/board/insert
	public void insertForm() {
		log.info("insert form 요청...."); // board/insert
	}
	
	@GetMapping("/select") // http://localhost:8080/board/select
	public void selectForm() { 
		log.info("select form 요청...."); // board/select
	}
}
