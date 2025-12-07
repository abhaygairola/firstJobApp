package com.roctar.firstJobApp.Service;

import com.roctar.firstJobApp.Repo.JobAppRepo;
import com.roctar.firstJobApp.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAppService {

    @Autowired
    JobAppRepo repo;

    public void addjob(JobPost job){
        repo.addJob(job);
    }
   public List<JobPost> getalljobs(){
        return repo.getJobs();
   }

}
