package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller //@Service, @Repository
@RequestMapping("/sample/*") //http://localhost:8080/sample/*
public class SampleController {	
	
	 // = cmd.equals("list.do)
	@RequestMapping("/basic") // Annotation 괄호안에 경로지정	
	public void basic() { //http://localhost:8080/sample/basic
		log.info("basic...."); // /sample/basic => view 리졸버
	}
	
	@RequestMapping("/test")
	public String test() { ///http://localhost:8080/sample/test
		log.info("test....");
		return "default"; // defalut => view 리졸버
	}
}
