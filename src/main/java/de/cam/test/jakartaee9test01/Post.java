package de.cam.test.jakartaee9test01;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Post {

	private String name;
	private String vorname;

	public Post() {
		this.name = "StandardName";
		this.vorname = "StandardVorNmae";
	}
	
	public Post(String name, String vorname) {
		this.name = name;
		this.vorname = vorname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

}
