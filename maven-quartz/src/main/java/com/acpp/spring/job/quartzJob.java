package com.acpp.spring.job;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.javassist.compiler.SyntaxError;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.quartz.Trigger;
import org.quartz.TriggerKey;

public class quartzJob implements Job{
//	private String message;
//	private Float FloatJobValue;
//	private Double DoubleTriggerValue;
//	public String getMessage() {
//		return message;
//	}
//
//	public void setMessage(String message) {
//		this.message = message;
//	}
//
//	public Float getFloatJobValue() {
//		return FloatJobValue;
//	}
//
//	public void setFloatJobValue(Float floatJobValue) {
//		FloatJobValue = floatJobValue;
//	}
//
//	public Double getDoubleTriggerValue() {
//		return DoubleTriggerValue;
//	}
//
//	public void setDoubleTriggerValue(Double doubleTriggerValue) {
//		DoubleTriggerValue = doubleTriggerValue;
//	}
	//给来编辑业务逻辑
	public void execute(JobExecutionContext context) throws JobExecutionException {
		//打印当前的执行时间，格式为2018-8-6-00：00：00
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.err.println(sdf.format(date));
		//JobDataMap dataMap = context.getMergedJobDataMap();
		//String myJob = dataMap.getString("myTrigger");
		JobDataMap dataMap=  context.getMergedJobDataMap();
		int mess = dataMap.getInt("message");
		System.err.println(mess);
		//JobKey key = context.getJobDetailj().getKey();
		//System.err.println(key.getName()); '
		//TriggerKey trkey = context.getTrigger().getKey();
		//String myJob = trkey.getGroup();
		//System.err.println("===========:"+myJob);
		//System.err.println("执行前时间:"+sdf.format(date));
		//编写具体的业务逻辑
		//System.err.println("Hello World!");
//		JobKey key = context.getJobDetail().getKey();
//		System.err.println(key.getName()+":"+key.getGroup());
//		TriggerKey trkey = context.getTrigger().getKey();
//		System.err.println(trkey.getName()+":"+trkey.getGroup());
		//JobDataMap dataMap=  context.getMergedJobDataMap();
		//JobDataMap tdataMap = context.getTrigger().getJobDataMap();
		//String msg =dataMap.getString("message");
		//Float jobFloatValue = dataMap.getFloat("FloatJobValue");
		//Double triggerDoubleValue = tdataMap.getDouble("DoubleTriggerValue");
//		System.err.println("jobFloatValue is:"+FloatJobValue);
//		System.err.println("msg is:"+message);
//		System.err.println("triggerDoubleValue is:"+DoubleTriggerValue);
//		Trigger currentTrigger =context.getTrigger();
//		System.err.println("Start Time Is:"+sdf.format(currentTrigger.getStartTime()));
//		System.err.println("End Time Is:"+sdf.format(currentTrigger.getEndTime()));
//		JobKey jobkey = currentTrigger.getJobKey();
//		System.err.println("JobKey info----"+"jobName:"
//		+jobkey.getName()+"jobGroup:"+jobkey.getGroup());
	}
}
