package com.test;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "User")

public class Track {

	private String trackId;
	private String name;
	private String singer;
	private String year;
	
	public Track(String trackId, String name, String singer, String year) {
		super();
		this.trackId = trackId;
		this.name = name;
		this.singer = singer;
		this.year = year;
	}

	/**
	 * @return the trackId
	 */
	public String getTrackId() {
		return trackId;
	}

	/**
	 * @param trackId the trackId to set
	 */
	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the singer
	 */
	public String getSinger() {
		return singer;
	}

	/**
	 * @param singer the singer to set
	 */
	public void setSinger(String singer) {
		this.singer = singer;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	
	
}
