package com.org.collektions;

public class Project implements Comparable<Project> {

    private int projectId;
    private String projectName;

    public Project(int projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
    }

    public int getProjectId() {
        return this.projectId;
    }

    public String getProjectName() {
        return this.projectName;
    }

    @Override
    public int compareTo(Project project) {

        return this.getProjectId() - project.getProjectId();
    }
}
