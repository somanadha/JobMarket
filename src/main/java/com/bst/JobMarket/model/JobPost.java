package com.bst.JobMarket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {
    private int id;
    private String profile;
    private String description;
    private byte experience;
    private ArrayList<String> techStack;
}
