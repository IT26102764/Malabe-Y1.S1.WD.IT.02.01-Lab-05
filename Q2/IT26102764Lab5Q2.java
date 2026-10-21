import java.util.Scanner;
 
  public class IT26102764Lab5Q2{
    
	public static void main ( String[] args){
	 
	//declare the variables
	 int new_member;
	 
	// create the object
	  Scanner input = new Scanner(System.in);
	
	// get user input for the variable
	 System.out.println("Enter the number of new members:");
	 new_member= input.nextInt();
	 
	// check the prizers for the seperate user inpus
	  switch(new_member){
		  
		    case 5:
		System.out.println();
		System.out.println("Prize is a: Headphone");
		         
				break;
			     
		    case 4:
		System.out.println();
		System.out.println("Prize is a: Travelling chair");
		            
		        break;
			      
		    case 3:
		System.out.println();
		System.out.println("Prize is a: Bag");
		         
			    break;
			     
		    case 2:
		System.out.println();
		System.out.println("Prize is an: Umbrella");
		         
			    break;
			     
		    case 1:
		System.out.println();
		System.out.println("Prize is a: Pen");
		         
			    break;
			     
		    case 0:
		System.out.println();
		System.out.println(" No Prize");
		         
				break;
				 
			default:
			    if (new_member>=5){
			System.out.println();
			System.out.println("Prize is a: Headphone");
			    }
				else {
			          System.out.println("Input must number 0 or greater");
				}
				 
				break;
				 
		}
	}
}
		
		