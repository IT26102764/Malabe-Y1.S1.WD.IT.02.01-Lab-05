import java.util.Scanner;
 
  public class IT26102764Lab5Q1{
    
	public static void main(String[] args){
	
	// define variables
	  int num1,num2,num3;
	  
	// create the object
	  Scanner input= new Scanner(System.in);
	  
	// get user input for the variable num 
	  System.out.print("Enter the first integer:");
	  num1= input.nextInt();
	  
	  System.out.print("Enter the second integer:");
	  num2 = input.nextInt();
	  
	  System.out.print("Enter the third integer:");
	  num3= input.nextInt();
	  
	// user entered number display
	   System.out.println();
	   System.out.println("User entered numbers are:" + num1 + " " + num2 + " " + num3);
	  
	// find the smallest number
	   if (num1<num2){
	     if(num1<num3){
		  System.out.println("The smallest number is:" + num1);
	     }
	     else {
	      System.out.println("The smallest number is:" + num3);
	     }
		}
	   else if(num2<num3){
	     System.out.println("The smallest number is:" + num2);
		}
		else{
			System.out.println("The smallest number is:" + num3);
		}
		
		
	// find the largest number
	   if (num1>num2){
		 if(num1>num3){
		  System.out.println("The largest number is:" + num1);
		 }
		 else{
		  System.out.println("The largest number is:" + num3);
		 }
	    }
	   else if(num2>num3){
		    System.out.println("The largest number is:" + num2);
	    }
		else{
			 System.out.println("The largest number is:" + num3);
		}
    }
  }
			
			   