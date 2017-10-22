package com.inet.bbbclient

class SysRole {

	String name
	String description
	
    static constraints = {
		name nullable: false, blank: false
		description nullable: true, maxSize: 100
    }
}
