package be.ste.ts.datasheet.dto;

import be.steformations.java_data.timesheets.entities.Prestation;

@javax.xml.bind.annotation.XmlRootElement(name="prestation")
@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)

public class DTOPrestation {
	private Long id;
	private java.util.Date day;
	@javax.xml.bind.annotation.XmlElement(name="employe") 
	private DTOEmploye employee;
	@javax.xml.bind.annotation.XmlElement(name="project") 
	private DTOProject project;
	private int duration;
	private String comment;
	
	public DTOPrestation() {super();}
	public DTOPrestation(Prestation pres) {
		super();
		this.id = pres.getId();
		this.day = pres.getDay();
		this.employee = new DTOEmploye(pres.getEmployee());
		this.project = new DTOProject(pres.getProject());
		this.duration = pres.getDuration();
		this.comment = pres.getComment();
	}
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	public java.util.Date getDay() {return day;}
	public void setDay(java.util.Date day) {this.day = day;}
	public DTOEmploye getEmployee() {return employee;}
	public void setEmployee(DTOEmploye employee) {this.employee = employee;}
	public DTOProject getProject() {return project;}
	public void setProject(DTOProject project) {this.project = project;}
	public int getDuration() {return duration;}
	public void setDuration(int duration) {this.duration = duration;}
	public String getComment() {return comment;}
	public void setComment(String comment) {this.comment = comment;}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + duration;
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((project == null) ? 0 : project.hashCode());
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
		DTOPrestation other = (DTOPrestation) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (duration != other.duration)
			return false;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (project == null) {
			if (other.project != null)
				return false;
		} else if (!project.equals(other.project))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DTOPrestation [id=" + id + ", day=" + day + ", employee=" + employee + ", project=" + project
				+ ", duration=" + duration + ", comment=" + comment + "]";
	}
	
	
	

}
