package com.rvdv.cross.abac.security.sampleattributeprotection.service;

import java.util.List;

import com.rvdv.cross.abac.security.sampleattributeprotection.model.Issue;
import com.rvdv.cross.abac.security.sampleattributeprotection.model.Project;

public interface IssueService {
	public List<Issue> getIssues(Project project);
	public Issue getIssue(Integer id);
	public void createIssue(Issue issue);
	public void updateIssue(Issue issue);
	public void deleteIssue(Issue issue);
}
