package com.project.jobms.job.dto;

import com.project.jobms.job.Job;
import com.project.jobms.job.external.Company;

import lombok.Data;

@Data
public class JobCompanyDto {
	
	private Job job;
	private Company company;

}
