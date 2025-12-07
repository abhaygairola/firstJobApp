package com.roctar.firstJobApp;

import com.roctar.firstJobApp.Service.JobAppService;
import com.roctar.firstJobApp.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobAppController {
    @Autowired
    JobAppService js;

    @GetMapping({"/home", "/"})
    public String home(){
        return "home";
    }

    @GetMapping("/addjob")
    public String addjob(){
        return "addjob";
    }
    @PostMapping("/handleForm")
    public String handleForm(JobPost jobPost){
        js.addjob(jobPost);
        System.out.println(js.getalljobs());
        return "success";
    }
    @GetMapping("/viewalljobs")
    public String viewalljobs(Model m ){
        m.addAttribute("jobPosts",js.getalljobs());
        return "viewalljobs";
    }

}
