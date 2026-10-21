import java.util.Scanner;
  
  public class IT26102764Lab5Q3{

    public static void main( String[] args){

        // declare and initialize constants
           final double room_charge_per_day= 48000.00;
           final double discount_3_to_4_days= 0.1;
           final double discount_5_to_more_days= 0.2;

        // declare the variables
         int startDate,endDate,noOfDaysReserved;
         double total_amount, discount_amount, total_amount_to_be_paid;

        // declare and intialise variables 
          double discount_rate= 0;

        // create the object
          Scanner input = new Scanner(System.in);

        // get user input for start date
         System.out.println("Enter Start Date (1-31):");
         startDate= input.nextInt();

        // get user input for the end date
          System.out.println("Enter End Date (1-31):");
          endDate= input.nextInt();

        // validation chech of the user inputs
         if ( startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31){
             System.out.println("Days must be between 1 and 31");
             return;
         }
         if (startDate >= endDate){
            System.out.println("Start Date must be less than End Date");
            return;
         }

        // calculate the number of days reserved
          noOfDaysReserved = endDate - startDate;

        // check whether the reserved dates are eligible for discount
         if (noOfDaysReserved >= 3 && noOfDaysReserved <=4){
            discount_rate =  discount_3_to_4_days;
         }
         else if (noOfDaysReserved >= 5) {
            discount_rate = discount_5_to_more_days;
         }

        // calculate the total amount that should be total_amount_to_be_paid
         total_amount = noOfDaysReserved*room_charge_per_day;
         discount_amount = total_amount* discount_rate;
         total_amount_to_be_paid= total_amount - discount_amount;

        // print the total amount, room charges and total of reservation days
         System.out.println();
         System.out.println("Room Charge Per Day: Rs." + room_charge_per_day + "/=");
         System.out.println("Number of Days Reserved:" + noOfDaysReserved);
         System.out.println("Total Amount to be Paid:" + total_amount_to_be_paid + "/=");

    }
  }