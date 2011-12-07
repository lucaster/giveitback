package giveitback

import java.util.Date;
import giveitback.User

/*
 * This class is an Item that you borrow or lend
 */
class Item {

	User creator

	String name
	String description

	Date dateCreated // GORM will update this automatically
	Date lastUpdated // GORM will update this automatically

	static constraints = {
		creator(nullable:true) 
		description(blank:true)
	}
}
