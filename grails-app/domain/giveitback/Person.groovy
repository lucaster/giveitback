package giveitback

import java.util.Date;

/*
 * This class represents the Person you lend to or borrow from some items.
 */
class Person {
	
	String fullName
	Date dateCreated // GORM will update this automatically
	Date lastUpdated // GORM will update this automatically

    static constraints = {
    }
}
