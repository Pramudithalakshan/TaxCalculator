import java.util.*;
class Example{
  public static void main(String args[]){
	   
	    Scanner input = new Scanner(System.in);
	    System.out.printf("%80s %n","   __  _______  ________ _______");
	    System.out.printf("%81s %n","  |  \\/       \\|        |       \\");
	    System.out.printf("%81s %n","   \\$|   $$$$$$|  $$$$$$\\$$$$$$$$");
	    System.out.printf("%78s %n","  |  |  $$     | $$__     | $$");
	    System.out.printf("%78s %n","  | $|  $$     | $$  \\    | $$");
	    System.out.printf("%78s %n","  | $|  $$   __| $$$$$    | $$");
	    System.out.printf("%78s %n","  | $|  $$__/  | $$_____  | $$");
	    System.out.printf("%78s %n","  | $$\\$$     $| $$     \\ | $$");
	    System.out.printf("%78s %n","   \\$$ \\$$$$$$  \\$$$$$$$$  \\$$");
	    System.out.println();
	    System.out.println();
	    System.out.println("  _________            __    __    ______               _         ______   _    _   _                      _________     _____    ______");
	    System.out.println(" |___   ___|    /\\     \\ \\  / /   / _____|      /\\     | |       /  ____| | |  | | | |             /\\     |___   ___|  / ____ \\  |  __   \\");
	    System.out.println("     | |       /  \\     \\ \\/ /   | |           /  \\    | |      |  |      | |  | | | |            /  \\        | |     | |    | | | |__ )  |");
	    System.out.println("     | |      / /\\ \\     > <     | |          / /\\ \\   | |      |  |      | |  | | | |           / /\\ \\       | |     | |    | | |   _   /");
	    System.out.println("     | |     / ____ \\   / . \\    | |_____    / ____ \\  | |____  |  |____  | |__| | | |______    / ____ \\      | |     | |____| | |  | \\  \\ ");
	    System.out.println("     |_|    /_/    \\_\\ /_/ \\_\\    \\______|  /_/    \\_\\ |______|  \\______|  \\____/  |________|  /_/    \\_\\     |_|      \\______/  |_ |  \\_ \\");
	    System.out.println();
	    System.out.println();
	    System.out.println("=============================================================================================================================================");
	    System.out.println();
	    System.out.println();
	    System.out.printf("%7s%d%s%n","[",1,"] Withholding Tax");
	    System.out.println();
	    System.out.printf("%7s%d%s%n","[",2,"] Payable Tax");
	    System.out.println();
	    System.out.printf("%7s%d%s%n","[",3,"] Income Tax");
	    System.out.println();
        System.out.printf("%7s%d%s%n","[",4,"] Social Security Contribution Levy (SSCL) Tax");
	    System.out.println();
	    System.out.printf("%7s%d%s%n","[",5,"] Leasing Tax");
	    System.out.println();
	    System.out.printf("%7s%d%s%n","[",6,"] Exit");
	    System.out.println();
	    System.out.println();
	    System.out.print("Enter an option to continue->");
	    int option = input.nextInt();
	    switch(option){
			  case 1:
			  withHoldingTax();
			  case 2:
			  payableTax();
			  case 3:
			  incomeTax();
			  case 4:
			  ssclTax();
			  case 5:
			  leasingPayment();
			  case 6:
			  //exit();
			}
	  } //End of the main method
	 
	  public static void withHoldingTax(){                                //Start of the withHodingTax method 
	    System.out.println("+----------------------------------------------------------------------+");
	    System.out.println("|                        WITHHOLDING TAX                               |");
	    System.out.println("+----------------------------------------------------------------------+");
	 L1:while(true){
		Scanner input = new Scanner(System.in);
		System.out.printf("%7s%d%s%n","[",1,"] Rent Tax");
	    System.out.println();
	    System.out.printf("%7s%d%s%n","[",2,"] Bank Interest Tax");
	    System.out.println();
	    System.out.printf("%7s%d%s%n","[",3,"] Dividend Tax");
	    System.out.println();
	    System.out.printf("%7s%d%s%n","[",4,"] Exit");
	    System.out.println();
	    System.out.println();
	    System.out.print("Enter an option to continue->");
	    int option = input.nextInt();
	    switch(option){
			  case 1:
			  rentTax();
			  case 2:
			  bankInterestTax();
			  case 3:
			  dividendTax();
			  case 4:
			  //exit();
			  default:
			  System.out.println("Enter Valid Input");
			  System.out.println();
			  continue L1;
			  
			}
		   
		 }
	  }
	       //RentTax method
	  public static void rentTax(){
		System.out.println("+----------------------------------------------------------------------+");
	    System.out.println("|                            RENT TAX                                  |");
	    System.out.println("+----------------------------------------------------------------------+");
	   RT:while(true){
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter Your Rent->");
		  double payment = input.nextInt();
		  if(payment>0 ){
		    System.out.println(payment<100000?"You don't have to pay Rent Tax...":"Tax amount ->"+((payment-100000)*0.1)); 
		    L1:while(true){
		    System.out.print("Do You Want To Calculate Rent Tax Again(Y/N)");
		    String op = input.next().toUpperCase();
		    switch(op){
				case "Y":
				continue RT;
				case "N":
				break RT;
				default:
				System.out.println("Please Enter Valid Input");
				continue L1;
				}
			}
	           }else{
			         System.out.printf("%10s%n","Invalid Input Please Enter Valid Input");
			         continue RT;
			         }
	      
		  }
	  }
		   //BankInterest method
	  public static void bankInterestTax(){
		System.out.println("+----------------------------------------------------------------------+");
	    System.out.println("|                        BANK INTEREST TAX                             |");
	    System.out.println("+----------------------------------------------------------------------+");
		  BT:while(true){
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter your bank interest per year->");
		  double interest = input.nextInt();
		  if(interest>0 ){
		    System.out.println("You have to pay Bank Interest Tax per year->"+interest*0.05); 
		    L1:while(true){
		    System.out.print("Do You Want To Calculate Interest Tax Again(Y/N)");
		    String op = input.next().toUpperCase();
		    switch(op){
				case "Y":
				continue BT;
				case "N":
				break BT;
				default:
				System.out.println("Please Enter Valid Input");
				continue L1;
				}
			}
	           }else{
			         System.out.printf("%10s%n","Invalid Input Please Enter Valid Input");
			         continue BT;
			         }
				 }
		  }
	       //DividendTax method
	  public static void dividendTax(){
		System.out.println("+----------------------------------------------------------------------+");
	    System.out.println("|                        DIVIDEND TAX                                  |");
	    System.out.println("+----------------------------------------------------------------------+");
		   RT:while(true){
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter Dividend ->");
		  double payment = input.nextInt();
		  if(payment>0 ){
		    System.out.println(payment<100000?"You don’t have to pay Dividend Tax….":"Tax amount ->"+(payment-100000)*0.14); 
		    L1:while(true){
		    System.out.print("Do You Want To Calculate Dividend Tax Again(Y/N)");
		    String op = input.next().toUpperCase();
		    switch(op){
				case "Y":
				continue RT;
				case "N":
				break RT;
				default:
				System.out.println("Please Enter Valid Input");
				continue L1;
				}
			}
	           }else{
			         System.out.printf("%10s%n","Invalid Input Please Enter Valid Input");
			         continue RT;
			         }
	      
		  }
		  }
		  
		  
		
		//Start of the payable tax
		public static void payableTax(){
			Scanner input = new Scanner(System.in);
			System.out.println("+----------------------------------------------------------------------+");
	        System.out.println("|                        PAYABLE TAX                                   |");
	        System.out.println("+----------------------------------------------------------------------+");
	        System.out.println();
	        System.out.println();
	        PT:while(true){
			System.out.print("Enter employee salary per month->");
			double salary = input.nextInt();
			if(salary>=0){
			double tax=0;
			double sd=100000;
			 System.out.println(salary<=100000?"You don't have to pay Payable Tax...":salary<=141667?"Tax amount->"+((salary-sd)*0.06)
			 :salary<=183333?"Tax amount->"+((salary-sd)*0.12-2500)
			 :salary<=225000?"Tax amount->"+((salary-sd)*0.18-7500):salary<=266667?"Tax amount->"+((salary-sd)*0.24-15000)
			 :salary<=308333?"Tax amount->"+((salary-sd)*0.3-25000):"Tax amount->"+((salary-sd)*0.36-37500));
			L1:while(true){
		    System.out.print("Do You Want To Calculate Dividend Tax Again(Y/N)");
		    String op = input.next().toUpperCase();
		    switch(op){
				case "Y":
				continue PT;
				case "N":
				break PT;
				default:
				System.out.println("Please Enter Valid Input");
				continue L1;
				}
			}
	           }else{
			         System.out.printf("%10s%n","Invalid Input Please Enter Valid Input");
			         continue PT;
			         }
			}
		}
		
		//Start of the Income Tax method
		public static void incomeTax(){
			 Scanner input = new Scanner(System.in);
			System.out.println("+----------------------------------------------------------------------+");
	        System.out.println("|                         INCOME TAX                                   |");
	        System.out.println("+----------------------------------------------------------------------+");
	        System.out.println();
	        System.out.println();
	         PT:while(true){
			System.out.print("Enter income per year->");
			double income = input.nextInt();
			if(income>=0){
			double tax=0;
			double sd=1200000;
			 System.out.println(income<=1200000?"You don't have to pay Income Tax..."
			 :income<=1700000?"Income Tax amount->"+((income-sd)*0.06)
			 :income<=2200000?"Tax amount->"+((income-sd)*0.12-30000)
			 :income<=2700000?"Tax amount->"+((income-sd)*0.18-90000)
			 :income<=3200000?"Tax amount->"+((income-sd)*0.24-180000)
			 :income<=3700000?"Tax amount->"+((income-sd)*0.3-300000)
			 :"Tax amount->"+((income-sd)*0.36-450000));
			L1:while(true){
		    System.out.print("Do You Want To Calculate Dividend Tax Again(Y/N)");
		    String op = input.next().toUpperCase();
		    switch(op){
				case "Y":
				continue PT;
				case "N":
				break PT;
				default:
				System.out.println("Please Enter Valid Input");
				continue L1;
				}
			}
	           }else{
			         System.out.printf("%10s%n","Invalid Input Please Enter Valid Input");
			         continue PT;
			         }
			}
			
			}
			
			//Start of the sscl Tax
			public static void ssclTax(){
				  Scanner input = new Scanner(System.in);
				  System.out.println("+----------------------------------------------------------------------+");
	              System.out.println("|            SOCIAL SECURITY CONTRIBUTION LEVY(SSCL) TAX               |");
	              System.out.println("+----------------------------------------------------------------------+");
				  SSCLL:while(true){
				  System.out.print("Enter value of the good->");
				  double price = input.nextDouble();

				     if(price>=0){
						 double st =saleTax(price);
				  
				         System.out.printf("%s %.2f%n","After sale tax added->",st+price);
				  
				         double value =vatTax(st,price);
				  
				         System.out.printf("%s%.2f%n","After vat tax added->",value);
				         L1:while(true){
		                 System.out.print("Do You Want To Calculate SSCL Tax Again(Y/N)");
		                 String op = input.next().toUpperCase();
		                 switch(op){
				          case "Y":
				          continue SSCLL;
				          case "N":
				          break SSCLL;
				          default:
				          System.out.println("Please Enter Valid Input");
				          continue L1;
				          } 
		 	           }
		                  }else{
			              System.out.printf("%10s%n","Invalid Input Please Enter Valid Input");
			              continue SSCLL;
			  }
		}
	}		
			public static double saleTax(double price){
				  return price*0.025;
				  
				}
				
			public static double vatTax(double st,double price){
				 return ((st+price)*0.15)+st;
				}
		   public static void leasingPayment(){
			   Scanner input = new Scanner(System.in);
			    leasingPaymentHome();
			    System.out.print("Enter an option to continue ->");
			    int op = input.nextInt();
			    switch(op){
					 case 1:
					 case 2:
					 case 3:
					 case 4:
					 default:
					}
			   }
				
			public static void leasingPaymentHome(){
				 Scanner input = new Scanner(System.in);
				  System.out.println("+----------------------------------------------------------------------+");
	              System.out.println("|                        Leasing Payment                               |");
	              System.out.println("+----------------------------------------------------------------------+");
	              System.out.println();
	               System.out.printf("%7s%d%s%n","[",1,"] Calculate Monthly Installment");
	               System.out.println();
	               System.out.printf("%7s%d%s%n","[",2,"] Search Leasing Category");
	               System.out.println();
	               System.out.printf("%7s%d%s%n","[",3,"] Find Leasing Amount");
	               System.out.println();
	               System.out.printf("%7s%d%s%n","[",4,"] Exit");
	               System.out.println();
	              
				}
			
  }
