package com.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {

	@Scheduled(cron = "0 0/1 * * * ?")
	public void cronRun() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("### Cron Run 1 Minutes = " + simpleDateFormat.format(new Date()));
	}
}
