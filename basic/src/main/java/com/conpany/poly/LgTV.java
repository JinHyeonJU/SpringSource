package com.conpany.poly;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv") //객체 생성 자동
				 // = <bean id="tv" class="com.conpany.poly.LgTV" />
public class LgTV implements TV{
	
	//적절한 시점에 생성된 객체 주입 -@Autowired, @Inject
	//이름 구별용 - @Qualifier
	//객체 주입 + 이름 구별 - @Resource 
	
	//@Autowired
	@Inject
	@Qualifier("apple") //단독사용 불가(주입대상이 여러개인 경우 //특정 객체 지정시 사용) 
	private Speaker speaker; //멤버변수로 선언
	/*
	 * private int price;
	 * 
	 * 
	 * public void setPrice(int price) { this.price = price; } public void
	 * setSpeaker(Speaker speker) { this.speaker = speaker; }
	 */
	/*
	 * public LgTV() { speaker = new SonySpeaker(); }
	 */
	/*
	 * public LgTV(Speaker speaker) { this.speaker = speaker; }
	 */
	
	public void turnOn() {
		System.out.println("LGTN - 전원 On, 가격 : "+price);
	}
	public void turnOff() {
		System.out.println("LGTV - 전원 Off");
	}
	public void soundUp() {
		/*  System.out.println("LGTV - 볼륨 Up"); */
		speaker.volumeUp(); //생성한 객체 사용
		}
	public void soundDown() {
		/* System.out.println("LGTV - 볼륨 Down"); */
		speaker.volumeDown();
	}
}
