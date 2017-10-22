package com.inet.bbbclient

class SysGroup {

	String name
	String description
	static hasMany = [roles: SysRole]
	
    static constraints = {
		name nullable: false
		description nullable: false, maxSize: 100
		roles blank: true
    }
}
