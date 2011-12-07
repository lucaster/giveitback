package giveitback

import java.util.Date;
import giveitback.User
import giveitback.Person
import giveitback.Item

/*
 * A Person lends to / borrows from another Person an Item
 */
class Loan {

	Person lender
	Person borrower
	Item item
	
	String description
	Date dueDate // the date before which the item must be given back
	boolean hasBeenGivenBack
	
	Date dateCreated // GORM will update this automatically
	Date lastUpdated // GORM will update this automatically

	static constraints = { 
		dueDate(nullable:true)
		description(nullable:true) 
	}
}

enum LoanDirections {LEND_TO, BORROW_FROM}
