package com.conpany.poly;

import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		System.out.println("==== AppleSpeaker 객체 생성");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("==== AppleSpeaker Volume Up");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("==== AppleSpeaker Volume Down");
	}

}
