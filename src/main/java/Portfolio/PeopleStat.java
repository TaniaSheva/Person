package Portfolio;

import java.util.ArrayList;
import java.util.logging.*;

public class PeopleStat {
	private static Logger LOGGER = Logger.getLogger(PeoplePortfolio.class.getName());
	
	PeopleStat (){

	}

		public static void ageStat (ArrayList<Person> Person) {
			
			int quantityUnder20 = 0;
			int quantityOver20 = 0;
				
		    	for (int i=0; i < Person.size(); i++) {
		    		if (Person.get(i).getAge() < 20) {
		    			quantityUnder20 ++;
		    		}
		    		else {
		    			quantityOver20 ++;
		    		}
		    	}
		    
		    	if (quantityUnder20 == 1)
		    		{
		    			LOGGER.info("We have " + quantityUnder20 + " person under 20 YO");
		    		}
		    	else {
		    			LOGGER.info("We have " + quantityUnder20 + " people under 20 YO");
		    	     }
		    	
		    	if (quantityOver20 == 1)
	    		{
	    				LOGGER.info("We have " + quantityOver20 + " person over 20 YO");
	    		}
		    	else {
		    			LOGGER.info("We have " + quantityOver20 + " people over 20 YO");
	    	     }
		    	
			}



}
