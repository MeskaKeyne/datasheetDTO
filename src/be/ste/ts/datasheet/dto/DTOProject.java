package be.ste.ts.datasheet.dto;

import be.steformations.java_data.timesheets.entities.Project;

@javax.xml.bind.annotation.XmlRootElement(name="project")
@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)

public class DTOProject {

	private Long id;
	private String name;
	private String description;
	private java.util.Date startDate;
	private java.util.Date endDate;
	@javax.xml.bind.annotation.XmlElement(name="employe")
	private DTOEmploye manager;
	
	public DTOProject() {super();}
	public DTOProject(Project pro) {
		super();
		this.id = pro.getId();
		this.name = pro.getName();
		this.manager = new DTOEmploye(pro.getManager());
		this.startDate = pro.getStartDate();
		this.endDate = pro.getEndDate();
		this.description = pro.getDescription();
	}
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	public java.util.Date getStartDate() {return startDate;}
	public void setStartDate(java.util.Date startDate) {this.startDate = startDate;}
	public java.util.Date getEndDate() {return endDate;}
	public void setEndDate(java.util.Date endDate) {this.endDate = endDate;}
	public DTOEmploye getManager() {return manager;}
	public void setManager(DTOEmploye manager) {this.manager = manager;}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((manager == null) ? 0 : manager.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DTOProject other = (DTOProject) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (manager == null) {
			if (other.manager != null)
				return false;
		} else if (!manager.equals(other.manager))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DTOProject [id=" + id + ", name=" + name + ", description=" + description + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", manager=" + manager + "]";
	}	
}
