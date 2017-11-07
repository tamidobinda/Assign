package edu.iss.model;

import java.util.List;

public class Project {

    private Integer id;
    private String name;
    private String description;
    private Integer quota;
    private List<Integer> requiredSkills;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public List<Integer> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(List<Integer> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }
}
