package com.rvdv.cross.abac.security.sampleattributeprotection.service;

import java.util.List;

import com.rvdv.cross.abac.security.sampleattributeprotection.model.Project;

public interface ProjectService {
	public List<Project> getProjects();
	public Project getProject(Integer id);
	public void createProject(Project project);
	public void updateProject(Project project);
	public void deleteProject(Project project);
}
