package giveitback

import giveitback.security.SecUser
import giveitback.Loan

/*
 * This is my User class.
 * 
 * Do NOT update/create SecUser!
 */
class User extends SecUser {
	
	String firstName
	String lastName
	Date dateCreated // GORM will update this automatically
	Date lastUpdated // GORM will update this automatically
	
	static hasMany = [loans : Loan]
}