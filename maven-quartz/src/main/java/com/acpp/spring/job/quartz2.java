package com.acpp.spring.job;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class quartz2 {
	public static void main(String[] args) throws SchedulerException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.err.println("执行前时间:"+sdf.format(date));
		//创建一个JobDetail实例，将该实例与quartzJob Class绑定
		JobDetail jobDetail = JobBuilder.newJob(quartzJob.class)
		.withIdentity("MyJob").build();
		//获取距离当前时间3秒后的时间
		date.setTime(date.getTime()+3000);
		//获取距离当前时间6秒后的时间
		Date endDate = new Date();
		endDate.setTime(endDate.getTime()+6000);
		//创建一个Trigger实例，定义该job立即执行
		Trigger trigger  =TriggerBuilder.
				newTrigger()
				.withIdentity("myTrigger","group1")
				.startAt(date)
				.endAt(endDate)
				.withSchedule(
						SimpleScheduleBuilder.simpleSchedule()
						.withIntervalInSeconds(2).repeatForever())
				.build();
		//创建Scheduler实例
		SchedulerFactory sfact = new StdSchedulerFactory();
		Scheduler scheduler =sfact.getScheduler();
		scheduler.start();
		scheduler.scheduleJob(jobDetail,trigger);
	}
}
