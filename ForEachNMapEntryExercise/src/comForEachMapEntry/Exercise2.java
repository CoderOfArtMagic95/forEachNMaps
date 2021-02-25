package comForEachMapEntry;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//import java.util.function.BiConsumer;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner user = new Scanner(System.in);
		 System.out.println("What make of car are you looking for");
		 String input = user.nextLine();
		 System.out.println("What model of car are you looking for");
		 String input2 = user.nextLine();
		 user.close();
		 
		 /* You are a car dealer. Create a hash map of vehicles.
		  * The model is the Key, the make is the Value.
		  * Ask the customer what car (model) they are looking for. 
		  * Use the Hash Map to determine if you have that vehicle, and what make it is.
		  * (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")*/
		 
		HashMap<String, String> vehicles = new HashMap<>();
		  
		  vehicles.put("Ford","Fiesta");
		  vehicles.put("Toyota","4Runner");
		  vehicles.put("Nissan","Rogue");
		  vehicles.put("Kia","Soul");
		  
		for (Map.Entry<String, String> entry : vehicles.entrySet()){
			//fix later doesn't work correctly
      	    input = entry.getKey();
        	input2 = entry.getValue();
        	
      	    
      	   switch(vehicles.get(input)) {
    		 case "Ford":
    	   		 System.out.println("Oh you are looking for a " + input2 + " Our "+ input +" Selection is over to the north!");
    	   		 break;
    	   	    case "Toyota":
    	   		 System.out.println("Oh you are looking for a " + input2 + " Our "+ input +" Selection is over to the south of the lot!");
    	   		 break;
    	   	  case "Nissan":
    	    		 System.out.println("Oh you are looking for a " + input2 + " Our "+ input +" Selection is over to your left!");
    	    		 break;
    	   	   case "Kia":
    	  		 System.out.println("Oh you are looking for a " + input2 + " Our "+ input +" Selection is over to your right!");
    	  		 break;
    	  		 default:
    	      	System.out.println("Sorry we don't sell those here...");
    	      		 break;
       	     }
      	
       }//end of for loop
	}

}
