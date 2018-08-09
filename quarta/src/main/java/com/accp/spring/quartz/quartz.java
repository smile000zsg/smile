package com.accp.spring.quartz;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class quartz {
	public static void main(String[] args) throws SchedulerException {
		JobDetail jobDetail = JobBuilder.newJob(helloquartz.class)
				.withIdentity("myJob","123").build();
		Trigger trigger = TriggerBuilder.
				newTrigger()
				.withIdentity("myTrigger","group1")
			//	.startAt(date)
				//.endAt(endDate)
				.withSchedule(
						SimpleScheduleBuilder.simpleSchedule()
						.withIntervalInSeconds(2).repeatForever())
				.build();
				 
		//创建scheduler
		SchedulerFactory sft = new StdSchedulerFactory();
		Scheduler scheduler = sft.getScheduler();
		scheduler.scheduleJob(jobDetail,trigger);
	}
}
