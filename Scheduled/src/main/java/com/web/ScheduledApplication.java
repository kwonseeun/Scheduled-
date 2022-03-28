package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * cron: cron 표현식을 지원한다. “초 분 시 일 월 주 (년)”으로 표현한다.
fixedDelay: milliseconds 단위로, 이전 작업이 끝난 시점으로부터 고정된 시간을 설정한다.
fixedDelayString: fixedDelay와 같은데 property의 value만 문자열로 넣는 것이다.
fixedRate: milliseconds 단위로, 이전 작업이 수행되기 시작한 시점으로부터 고정된 시간을 설정한다.
fixedRateString: fixedDelay와 같은데 property의 value만 문자열로 넣는 것이다.
initialDelay: 스케쥴러에서 메서드가 등록되자마자 수행하는 것이 아닌 초기 지연시간을 설정하는 것이다.
initialDelayString: 위와 마찬가지로 문자열로 값을 표현하겠다는 의미다.
zone: cron 표현식을 사용했을 때 사용할 time zone으로 따로 설정하지 않으면 기본적으로 서버의 time zone이다.*/
@SpringBootApplication
@EnableScheduling
public class ScheduledApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduledApplication.class, args);
	}

}
