package giveitback

import java.util.Date;
import giveitback.User
import giveitback.Person
import giveitback.Item

/*
 * A User lends to / borrows from a Person an Item
 */
class Loan {

	User user
	Person person
	Item item
	String description
	LoanDirections lendOrBorrow
	Date dueDate
	boolean hasBeenGivenBack
	Date dateCreated // GORM will update this automatically
	Date lastUpdated // GORM will update this automatically

	static constraints = { dueDate(nullable:true) }
}

enum LoanDirections {LEND_TO, BORROW_FROM}
