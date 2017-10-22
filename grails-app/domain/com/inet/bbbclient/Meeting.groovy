package com.inet.bbbclient

class Meeting {

	String name
	SysUser presenter
	static hasMany = [attenders: SysUser]
	
    static constraints = {
		name nullable: false, blank: false
		presenter unique: true, nullable: true
		attenders blank: true
    }
}
