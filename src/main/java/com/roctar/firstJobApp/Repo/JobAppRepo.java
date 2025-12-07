package com.roctar.firstJobApp.Repo;

import com.roctar.firstJobApp.model.JobPost;
import org.springframework.stereotype.Repository;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobAppRepo {

    private List <JobPost> jobs = new ArrayList<>(Arrays.asList( new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
                    List.of("HTML", "CSS", "JavaScript", "React")),
            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                    List.of("Python", "Machine Learning", "Data Analysis"))));

    public void addJob(JobPost jb){
        jobs.add(jb);
    }

    public List<JobPost> getJobs(){
        return jobs;
    }

}
