package com.inet.bbbclient

class SysUser {

	String username
	String password
	SysGroup group
	
    static constraints = {
		username nullable: false, blank: false
		password nullable: false
		group nullable: true
    }
}
