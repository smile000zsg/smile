package com.acpp.spring.job;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class quartzSchedulder {
	public static void main(String[] args) throws SchedulerException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.err.println(sdf.format(date));
		//创建一个JobDetail 实例，将该实例与quartzJob  Class绑定
		JobDetail jobDetail = JobBuilder.newJob(quartzJob.class)
				.withIdentity("myJon").usingJobData("message","hello myJob1")
				.usingJobData("FloatJobValue",3.14F).build();
		//System.err.println("jobDatels name"+jobDetail.getKey().getName());
		//System.err.println("jobDatels name"+jobDetail.getKey().getGroup());
		//System.err.println("jobDatels name"+jobDetail.getJobClass().getName());
		//可以提前知道
		//创建一个Trigger实例， 定义该job立即执行，并且每隔两秒钟重新执行一遍，直到永远
		//假如key是一样的，会优先执行这个key 并且会被覆盖(同意的key)
		Trigger trigger = TriggerBuilder
				.newTrigger().
				withIdentity("myJob")
				// withIdentity("myTrigger","group1")
			//	.usingJobData("message","hello myTrigger1")传参
				//.usingJobData("DoubleTriggerValue",2.0D)
				//.startNow()
				//CronTrigger 表达式
				.withSchedule(CronScheduleBuilder.cronSchedule("30 13 11 * * ? *"))
				.build();
//				.withSchedule(
//						SimpleScheduleBuilder.simpleSchedule()
//						.withIntervalInSeconds(2).repeatForever())
				//.build();
				
		//创建Scheduler实例
		
		SchedulerFactory sfact = new StdSchedulerFactory();
		Scheduler scheduler =sfact.getScheduler();
		scheduler.start();
		//打印当前时间，格式为2018-8-6-00：00：00
		scheduler.scheduleJob(jobDetail,trigger);
		//scheduler.pauseJob(jobDetail,trigger);
	}
}
