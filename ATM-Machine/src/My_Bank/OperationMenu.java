package My_Bank;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OperationMenu extends Account {
     HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
     DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");   		 
     Scanner menuInput = new Scanner(System.in);
     
     
     public void getLogin() throws IOException {  
    	 int x = 1;
    	 do {
    		 try {
    			 data.put(9876543, 2345);
    			 System.out.println("Herzlich Willkommen");
    			 System.out.print("Enter Your Customer Number: " );
    			 setCustomerNumber(menuInput.nextInt());
    		     
    			 System.out.print("Enter Your Pin Number: ");
    			 setPinNumber(menuInput.nextInt()); 
    		 
    		 } catch (Exception e) {
    			 System.out.println("\n" + "Invalid Character" +  "\n");
    			 x = 2;
    		 }
    		 for (Entry<Integer, Integer> entry : data.entrySet()) { 
    		     if (entry.getKey() == getCustumerNumber() && entry.getValue() == getPinNumber()) {
    		    	 getAccountType();
    		     } 
    		 }      
    	     System.out.println("\n" + "Wrong Customer Number or Number," + "\n");
    	     
    		 } while (x == 1);
     
    
     }
     
     public void getAccountType() {
    	 System.out.println("Select the Account you want to access: ");
    	 System.out.println("Type 1 - Checking Account"); 
    	 System.out.println("Type 2 - Saving Account");
    	 System.out.println("Type 3 - Exit");
    	 System.out.print("Choice: ");
    	 
    	 selection = menuInput.nextInt();
    	 
    	 switch (selection) {
    	 case 1:
    		 getChecking();
    		 break;
    	 case 2:
    		 getSaving();
    		 break;
    	 case 3:
    		 System.out.println("Thank You for using this ATM, bye.");
    		 break;
    	 default:
    		 System.out.println("\n" + "Invalid Choice." + "\n");
    		 getAccountType(); 
    	 
    	 }
       }
     
     public void getChecking() {
    	 System.out.println("Checking Account: ");
    	 System.out.println("Type 1 - View Balance");
    	 System.out.println("Type 2 - Withdraw Funds");
    	 System.out.println("Type 3 - Deposit Funds");
    	 System.out.println("Type 4 - Exit");
    	 System.out.println("Choice: ");
    	 selection = menuInput.nextInt();
    	 
    	 switch (selection) {
    	 case 1: 
    		 System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
    		 getAccountType();
    		 break;
    	 case 2:
    		 getCheckingWithdrawInput();
    		 getAccountType();
    		 break;
    	 case 3:
    		 getCheckingDepositInput();
    		 getAccountType();
    		 break;
    	 case 4:
    		 System.out.println("Thank You for using this ATM, bye.");
    	 default:
    		 System.out.println("\n" + "Invalid Choice" + "\n");
    		 getChecking();
    	 
    	 } 
     }
     
     public void getSaving() {
    	 System.out.println("Saving Account: ");
    	 System.out.println("Type 1 - View Balance");
    	 System.out.println("Type 2 - Withdraw Funds");
    	 System.out.println("Type 3 - Deposit Funds");
    	 System.out.println("Type 4 - Exit");
    	 System.out.print("Choice: ");
    	 
    	 selection = menuInput.nextInt();
    	 switch (selection) {
    	 
    	 case 1: 
    		 System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
    		 getAccountType();
    		 break;
    	 
    	 case 2:
    		 getSavingWithdrawInput();
    		 getAccountType();
    		 break;
    	 case 3:
    		 getSavingDepositInput();
    		 getAccountType();
    		 break;
    	 
    	 case 4:
    		 System.out.println("Thank You for using this ATM, bye.");
    	 default:
    		 System.out.println("\n" + "Invalid Choice" + "\n");
    		 getSaving();
         }
      }
      int selection;

}
