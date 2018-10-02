package com.uwefuchs.demo.soap.apachecxf.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "StudentMap")
public class StudentMap {
	
	private List<StudentEntry> entries = new ArrayList<StudentEntry>();
	
    @XmlElement(nillable = false, name = "entry")
    public List<StudentEntry> getEntries() {
        return entries;
    }
	
	@XmlType(name = "StudentEntry")
    public static class StudentEntry {
        private Integer id;
        private Student student;
 
        // getters and setters
		public Integer getId() {
			return id;
		}
		
		public void setId(Integer id) {
			this.id = id;
		}
		
		public Student getStudent() {
			return student;
		}
		
		public void setStudent(Student student) {
			this.student = student;
		}        
    }
}
