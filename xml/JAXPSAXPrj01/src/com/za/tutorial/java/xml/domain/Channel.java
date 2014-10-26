package com.za.tutorial.java.xml.domain;

import java.util.ArrayList;

public class Channel {
	private String name=null;
	private ArrayList<Tutorial> tutorials=new ArrayList<Tutorial>();
	public void addTutorial(Tutorial tutorial){
		tutorials.add(tutorial);
		
	}

	public ArrayList<Tutorial> getTutorials() {
		return tutorials;
	}

	public void setTutorials(ArrayList<Tutorial> tutorials) {
		this.tutorials = tutorials;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
