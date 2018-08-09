package com.acpp.spring.job;



import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

 

public class CronTrigger {
	public static void main(String[] args) throws SchedulerException, InterruptedException {
		
		JobDetail jobDedail = JobBuilder.newJob(quartzJob.class)
				.withIdentity("myJob").usingJobData("message",123).build();
		//每秒钟触发一次任务
		Trigger trigger =  TriggerBuilder
			.newTrigger()
			.withIdentity("myTrigger","group1")
			.withSchedule(CronScheduleBuilder.cronSchedule("* * * * * ?")).build();
			//创建Scheduler实例
			//秒 分 时 日 周 月 年
			//0/5 * * * * *
			SchedulerFactory sfact =new StdSchedulerFactory();
			Scheduler scheduler = sfact.getScheduler();
			scheduler.start();
			scheduler.scheduleJob(jobDedail,(Trigger) trigger);
			//scheduler执行两秒后挂起
			Thread.sleep(2000L);
			scheduler.standby();
			//scheduler挂起三秒后继续执行
			Thread.sleep(3000L);
			scheduler.start();
	}
}
