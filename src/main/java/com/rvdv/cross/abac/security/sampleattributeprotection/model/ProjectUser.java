package com.rvdv.cross.abac.security.sampleattributeprotection.model;

public interface ProjectUser {
	public String getName();

	public Project getProject();

	public void setProject(Project project);

	public UserRole getRole();

	public void setRole(UserRole role);
}
