package com.katte.galaxe;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		String[] myxmlfiles = {
								"springconfig/context.xml",
								"springconfig/database.xml",
								"springconfig/jobreport.xml"
								};
		ApplicationContext context = new ClassPathXmlApplicationContext(myxmlfiles);
		JobLauncher launcher = context.getBean("jobLauncher", JobLauncher.class);
		Job myjob = context.getBean("reportJob", Job.class);
		try
		{
			JobExecution jobexe = launcher.run(myjob, new JobParameters());
			System.out.println("Job Execution status:"+jobexe.getStatus());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("==========DONE==========");
	}
}
