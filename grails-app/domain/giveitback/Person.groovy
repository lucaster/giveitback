package giveitback

import java.util.Date;

/*
 * This class represents a Person who lends or borrows some items.
 */
class Person {

	User creator

	String fullName
	String email

	Date dateCreated // GORM will update this automatically
	Date lastUpdated // GORM will update this automatically

	static constraints = {
		email(email:true)
		creator(nullable:true)
	}
}
