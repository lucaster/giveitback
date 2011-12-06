package giveitback

import java.util.Date;

/*
 * This class is an Item that you borrow or lend
 */
class Item {
	
	String name
	Date dateCreated // GORM will update this automatically
	Date lastUpdated // GORM will update this automatically

    static constraints = {
    }
}
