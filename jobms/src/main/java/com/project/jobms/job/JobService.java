package com.project.jobms.job;

import java.util.List;

import com.project.jobms.job.dto.JobCompanyDto;

public interface JobService {
	
	List<JobCompanyDto> findAll();
	void createJob(Job job);
	Job findJobById(Long id);
	boolean deleteJobById(Long id);
	boolean updateJob(Long id, Job updatedJob);

}
