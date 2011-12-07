package giveitback

import giveitback.security.SecUser
import giveitback.Loan
import giveitback.Person
import giveitback.Item

/*
 * This is my User class.
 * 
 * Do NOT update/create SecUser!
 */
class User extends SecUser {
	
	/*
	 * Every User, upon registration, is associated to one Person.
	 * When a User lends/borrows, it's the associated person that
	 * actually lends/borrows.
	 */
	Person person 

	String firstName
	String lastName
	String email
	
	Date dateCreated // GORM will update this automatically
	Date lastUpdated // GORM will update this automatically

	static constraints = { email(email:true) }

	static hasMany = [
		loans : Loan,
		items : Item
	]
}