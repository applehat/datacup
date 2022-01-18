package com.applehat.datacup;

public class Document {

	private final String id;
	private final String type;
	private final String data;

	public Document(String id, String data, String type) {
		this.id = id;
		this.data = data;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getdata() {
		return data;
	}
}