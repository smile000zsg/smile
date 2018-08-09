package com.accp.spring.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class helloquartz implements Job{

	public void execute(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.err.println(sdf.format(date));
		JobDataMap  dataMap = context.getMergedJobDataMap();
		String myJob = dataMap.getString("myJob");
		System.err.println("12321");
		System.err.println(myJob);
	}
		
}
