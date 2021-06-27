package com.project.model;

public class fileNames {
	private String filename;
	
	public fileNames() {}

	public fileNames(String filename) {
		this.filename = filename;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public String toString() {
		return "Files [username=" + filename +"]";
	}

}
