package com.rvdv.cross.abac.security.sampleattributeprotection.service;

import java.util.List;

import com.rvdv.cross.abac.security.sampleattributeprotection.model.ProjectUser;

public interface UserService {
	ProjectUser findUserByName(String name);
	List<ProjectUser> findUserByProject(Integer projectId);
}
