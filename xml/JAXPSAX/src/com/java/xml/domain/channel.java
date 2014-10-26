package com.java.xml.domain;

import java.util.ArrayList;

public class channel {
	private String name=null;
	private ArrayList<tutorial> Tutorial= new ArrayList<tutorial>();
	
	public void addTutorial(tutorial tute){
		Tutorial.add(tute);
	}
	
	
	public ArrayList<tutorial> getTutorial() {
		return Tutorial;
	}


	public void setTutorial(ArrayList<tutorial> tutorial) {
		this.Tutorial = tutorial;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
