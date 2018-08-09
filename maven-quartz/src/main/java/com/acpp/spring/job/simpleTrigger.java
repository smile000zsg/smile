package com.acpp.spring.job;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class simpleTrigger {
	public static void main(String[] args) throws SchedulerException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.err.println(sdf.format(date));
		//创建一个JobDetail实例，将该实例与HelloJob Class绑定
		JobDetail jobDetail =JobBuilder.newJob(quartzSmile.class)
		.withIdentity("MyJob").build();
		//获取当前时间4秒钟之后的具体时间
		date.setTime(date.getTime()+4000);
		//距离当前时间4秒钟之后执行且仅执行一次任务
		SimpleTrigger  trigger =(SimpleTrigger)TriggerBuilder
		.newTrigger().withIdentity("myTrigger","group1")
		.startAt(date)
		.withSchedule(SimpleScheduleBuilder
				.simpleSchedule()
				.withIntervalInSeconds(2)
				.withRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY))
			.build();
		//创建Scheduler实例
		SchedulerFactory sfact= new StdSchedulerFactory();
		Scheduler scheduler = sfact.getScheduler();
		scheduler.start();
		scheduler.scheduleJob(jobDetail, trigger);
	}
}
