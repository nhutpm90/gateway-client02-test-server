package core.mircoservices.gateway.client02.dto;

import core.mircoservices.gateway.client02.ProjectConfig;

public class ProjectConfigDto extends ProjectConfig {

	public ProjectConfigDto(ProjectConfig projectConfig) {
		this.setTitle(projectConfig.getTitle());
		this.setLastUpdated(projectConfig.getLastUpdated());
		this.setContacts(projectConfig.getContacts());
		this.setPhones(projectConfig.getPhones());
	}
}
