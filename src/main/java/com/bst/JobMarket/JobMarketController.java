package com.bst.JobMarket;

import com.bst.JobMarket.model.JobPost;
import com.bst.JobMarket.service.JobPostService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
public class JobMarketController {
    @Autowired
    private JobPostService service;

    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }

    @GetMapping("addjob")
    public String addJob() {
        return "addjob";
    }

    @GetMapping("viewalljobs")
    public String viewAllJobs(Model model) {
        model.addAttribute("jobPosts", service.getAllJobPosts());
        return "viewalljobs";
    }

    @PostMapping("handleForm")
    public String success(JobPost jobPost) {
        service.saveJobPost(jobPost);
        return "success";
    }
}
