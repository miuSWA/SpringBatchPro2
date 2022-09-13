package com.sumayya.project.spring.batch.pro2.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

public class Pro2 {
	
	
	private JobBuilderFactory jobBuilderFactory;
	private StepBuilderFactory stepBuilderFactory;
    
	@Qualifier(value = "pro2")
	@Bean
	public Job Pro2Job() throws Exception{
		
		return this.jobBuilderFactory.get("pro2")
				.start(step1Pro2())
				.build();
	}
	@Bean
	public Step step1Pro2() throws Exception{
		return (Step) this.stepBuilderFactory.get("step1");
	}

}
