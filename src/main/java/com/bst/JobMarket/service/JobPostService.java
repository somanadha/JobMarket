package com.bst.JobMarket.service;

import com.bst.JobMarket.model.JobPost;
import com.bst.JobMarket.repository.JobPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("singleton")
public class JobPostService {
    @Autowired
    private JobPostRepository repository;

    public void saveJobPost(JobPost jobPost) {
        repository.save(jobPost);
    }

    public List<JobPost> getAllJobPosts() {
        return repository.findAll();
    }
}
