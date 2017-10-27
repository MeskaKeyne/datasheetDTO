package be.ste.ts.datasheet.dto;

import be.steformations.java_data.timesheets.entities.Employee;
import be.steformations.java_data.timesheets.entities.Prestation;
import be.steformations.java_data.timesheets.entities.Project;

public class DTOBuilder {

	public static DTOEmploye build(Employee emp) {
		if(emp == null) return null;
		return new DTOEmploye(emp);
	}
	public static DTOProject build(Project pro) {
		if(pro == null) return null;
		return new DTOProject(pro);
	}
	public static DTOPrestation build(Prestation pres) {
		if(pres == null) return null;
		return new DTOPrestation(pres);
	}
}
