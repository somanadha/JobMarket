package com.bst.JobMarket.repository;

import com.bst.JobMarket.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Scope("singleton")
public class JobPostRepository {
    private final List<JobPost> jobPostList = new ArrayList<JobPost>();

    public void save(JobPost jobPost) {
        jobPostList.add(jobPost);
    }

    public List<JobPost> findAll() {
        return jobPostList;
    }
}
