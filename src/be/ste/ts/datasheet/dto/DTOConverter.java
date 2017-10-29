package be.ste.ts.datasheet.dto;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class DTOConverter {
	
	private JAXBContext jaxbContext;

	public DTOConverter() {
		super();
		try {
			this.jaxbContext = JAXBContext.newInstance(DTOProject.class, DTOPrestation.class, DTOEmploye.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public String projectToXml(DTOProject project) {return this.objectToXml(project);}
	public DTOProject xmlToProject(String xml) {return (DTOProject) this.xmlToObject(xml);}
	public String prestationToXml(DTOPrestation prestation) {return this.objectToXml(prestation);}
	public DTOPrestation xmlToPrestation(String xml) {return (DTOPrestation) this.xmlToObject(xml);}
	public String employeeToXml(DTOEmploye employee) {return this.objectToXml(employee);}
	public DTOEmploye xmlToEmployee(String xml) {return (DTOEmploye) this.xmlToObject(xml);}
	private String objectToXml(Object object) {
		String xml = null;
		try (ByteArrayOutputStream output = new ByteArrayOutputStream();) {
			Marshaller marshaller = this.jaxbContext.createMarshaller();
			marshaller.marshal(object, output);
			xml = output.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return xml;
	}

	private Object xmlToObject(String xml) {
		Object object = null;
		try (StringReader input = new StringReader(xml);) {
			Unmarshaller unmarshaller = this.jaxbContext.createUnmarshaller();
			object = unmarshaller.unmarshal(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}

}
