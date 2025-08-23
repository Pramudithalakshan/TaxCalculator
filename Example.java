import java.util.*;
class Example{
  public static void main(String args[]){
	    mainMenu();
	  } //End of the main method
	 
	  public static void withHoldingTax(){                                //Start of the withHodingTax method 
	    Scanner input = new Scanner(System.in);
	    L1:while(true){
	    withHoldingTaxHome();
	    System.out.print("Enter an option to continue->");
	    int option = input.nextInt();
	    switch(option){
			  case 1:
			  clearConsole();
			  rentTax();
			  break;
			  case 2:
			  clearConsole();
			  bankInterestTax();
			  break;
			  case 3:
			  clearConsole();
			  dividendTax();
			  break;
			  case 4:
			  clearConsole();
			  mainMenu();
		      return;
			  default:
			  System.out.println("Enter Valid Input");
			  System.out.println();
			  continue L1;
			  
			}
		   
		 }
	  }
	   //RentTax method
	  public static void rentTax(){
		Scanner input = new Scanner(System.in);
		RT:while(true){
		System.out.println("+----------------------------------------------------------------------+");
	    System.out.println("|                            RENT TAX                                  |");
	    System.out.println("+----------------------------------------------------------------------+");
	  
		  System.out.print("Enter Your Rent->");
		  double payment = input.nextInt();
		  if(payment>0 ){
		    System.out.println(payment<100000?"\tYou don't have to pay Rent Tax...":"Tax amount ->"+((payment-100000)*0.1)); 
		    L1:while(true){
		    System.out.print("Do You Want To Calculate Rent Tax Again(Y/N)");
		    String op = input.next().toUpperCase();
		    switch(op){
				case "Y":
				clearConsole();
				continue RT;
				case "N":
				clearConsole();
				withHoldingTax();
				return;
				default:
				System.out.println("Please Enter Valid Input");
				continue L1;
				}
			}
	           }else{
				     clearConsole();
			         System.out.printf("%10s%n","Invalid Input Please Enter Valid Input");
			         continue RT;
			         }
	      
		  }
	  }
		   //BankInterest method
	  public static void bankInterestTax(){
		Scanner input = new Scanner(System.in);
		BT:while(true){
		System.out.println("+----------------------------------------------------------------------+");
	    System.out.println("|                        BANK INTEREST TAX                             |");
	    System.out.println("+----------------------------------------------------------------------+");
	
		  System.out.print("Enter your bank interest per year->");
		  double interest = input.nextInt();
		  if(interest>0 ){
		    System.out.println("You have to pay Bank Interest Tax per year->"+interest*0.05); 
		    L1:while(true){
		    System.out.print("Do You Want To Calculate Interest Tax Again(Y/N)");
		    String op = input.next().toUpperCase();
		    switch(op){
				case "Y":
				clearConsole();
				continue BT;
				case "N":
				clearConsole();
				withHoldingTax();
				return;
				default:
				System.out.println("Please Enter Valid Input");
				continue L1;
				}
			}
	           }else{
				     clearConsole();
			         System.out.printf("%10s%n","Invalid Input Please Enter Valid Input");
			         continue BT;
			         }
				 }
		  }
	       //DividendTax method
	  public static void dividendTax(){
	    Scanner input = new Scanner(System.in);
		RT:while(true){
		System.out.println("+----------------------------------------------------------------------+");
	    System.out.println("|                        DIVIDEND TAX                                  |");
	    System.out.println("+----------------------------------------------------------------------+");
		  
		  System.out.print("Enter Dividend ->");
		  double payment = input.nextInt();
		  if(payment>0 ){
		    System.out.println(payment<100000?"You don’t have to pay Dividend Tax….":"Tax amount ->"+(payment-100000)*0.14); 
		    L1:while(true){
		    System.out.print("Do You Want To Calculate Dividend Tax Again(Y/N)");
		    String op = input.next().toUpperCase();
		    switch(op){
				case "Y":
				clearConsole();
				continue RT;
				case "N":
				clearConsole();
				withHoldingTax();
				return;
				default:
				System.out.println("Please Enter Valid Input");
				continue L1;
				}
			}
	           }else{ 
				     clearConsole();
			         System.out.printf("%10s%n","Invalid Input Please Enter Valid Input");
			         continue RT;
			         }
	      
		  }
		  }
		  
		  
		
		//Start of the payable tax
		public static void payableTax(){
			Scanner input = new Scanner(System.in);
			PT:while(true){
			System.out.println("+----------------------------------------------------------------------+");
	        System.out.println("|                        PAYABLE TAX                                   |");
	        System.out.println("+----------------------------------------------------------------------+");
	        System.out.println();
	        System.out.println();
	      
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
				clearConsole();
				continue PT;
				case "N":
				clearConsole();
				mainMenu();
				return;
				default:
				System.out.println("Please Enter Valid Input");
				continue L1;
				}
			}
	           }else{ 
				     clearConsole();
			         System.out.printf("%10s%n","Invalid Input Please Enter Valid Input");
			         continue PT;
			         }
			}
		}
		
		//Start of the Income Tax method
		public static void incomeTax(){
			Scanner input = new Scanner(System.in);
			 PT:while(true){
			System.out.println("+----------------------------------------------------------------------+");
	        System.out.println("|                         INCOME TAX                                   |");
	        System.out.println("+----------------------------------------------------------------------+");
	        System.out.println();
	        System.out.println();
	         
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
				clearConsole();
				continue PT;
				case "N":
				clearConsole();
				mainMenu();
				return;
				default:
				System.out.println("Please Enter Valid Input");
				continue L1;
				}
			}
	           }else{ 
				     clearConsole();
			         System.out.printf("%10s%n","Invalid Input Please Enter Valid Input");
			         continue PT;
			         }
			}
			
			}
			
			//Start of the sscl Tax
			public static void ssclTax(){
				  Scanner input = new Scanner(System.in);
				   SSCLL:while(true){
				  System.out.println("+----------------------------------------------------------------------+");
	              System.out.println("|            SOCIAL SECURITY CONTRIBUTION LEVY(SSCL) TAX               |");
	              System.out.println("+----------------------------------------------------------------------+");
				 
				  System.out.print("Enter value of the good->");
				  double price = input.nextDouble();

				     if(price>=0){
						 double st =saleTax(price);				  
				         double value =vatTax(st,price);
				  
				         System.out.printf("%s%.2f%n","You have to pay SSCL Tax->",value);
				         L1:while(true){
		                 System.out.print("Do You Want To Calculate SSCL Tax Again(Y/N)");
		                 String op = input.next().toUpperCase();
		                 switch(op){
				          case "Y":
				          clearConsole();
				          continue SSCLL;
				          case "N":
				          clearConsole();
				          mainMenu();
				          return;
				          default:
				          System.out.println("Please Enter Valid Input");
				          continue L1;
				          } 
		 	           }
		                  }else{
						  clearConsole();
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
				
			///////////////////////////Leasing Payment////////////////////////////////////////	
		   public static void leasingPayment(){
			   Scanner input = new Scanner(System.in);
			   L1:while(true){
			    leasingPaymentHome();
			    System.out.print("Enter an option to continue ->");
			    int op = input.nextInt();
			    switch(op){
					 case 1:
					 clearConsole();
					 calMonthlyInstallment();
					 break L1;
					 case 2:
					 clearConsole();
					 searchCategory();
					 break L1;
					 case 3:
					 clearConsole();
					 findLeasAmount();
					 break L1;
					 case 4:
					  clearConsole();
				      mainMenu();
				      return;
					 default:
					 System.out.println("Invalid input");
					 continue L1;
					}
			   }
			 }
			 public static void calMonthlyInstallment(){
				  Scanner input = new Scanner(System.in);
				  MIL:while(true){
				  clearConsole();
				  System.out.println("+----------------------------------------------------------------------+");
	              System.out.println("|                 Calculate Monthly Installment                        |");
	              System.out.println("+----------------------------------------------------------------------+");
				  System.out.println();
				 
				  System.out.print("Enter lease amount         :");
				  double amount = input.nextDouble();
				  System.out.print("Enter annual interest rate :");
				  double rate = input.nextDouble();
				  System.out.print("Enter number of year       :");  
				  int year = input.nextInt();
				  if(validateLeasePayment(amount,rate,year)){
                        double instalment = findInstalment(amount,rate,year);
					    System.out.printf("%s %.2f %n","Year monthly instalment  :",instalment);
					     L1:while(true){
					       System.out.print("Do you want to calculate another monthly instalment (Y/N):");
						   String op = input.next().toUpperCase();
						   switch(op){
				            case "Y":
				             clearConsole();
				             continue MIL;
				            case "N":
				              clearConsole();
				              leasingPayment();
				              return;
				            default:
				              System.out.println("Please Enter Valid Input");
				              continue L1;
				            } 
							 }
					  }else{
						 L2:while(true){
					       System.out.print("Do you want to calculate another monthly instalment (Y/N):");
						   String op = input.next().toUpperCase();
						   switch(op){
				            case "Y":
				            clearConsole();
				             continue MIL;
				            case "N":
				              clearConsole();
				              leasingPayment();
				              return;
				            default:
				             
				              System.out.println("Please Enter Valid Input");
				              continue L2;
				            } 
							 }
						 
						  }
					
					 }
				}
			 public static void searchCategory(){
				  Scanner input = new Scanner(System.in);
				  SC:while(true){
				  System.out.println("+----------------------------------------------------------------------+");
	              System.out.println("|                    Search Leasing Category                           |");
	              System.out.println("+----------------------------------------------------------------------+");
				  System.out.println();
				  System.out.print("Enter lease amount         :");
				  double amount = input.nextDouble();
				  System.out.print("Enter annual interest rate :");
				  double rate = input.nextDouble();
				  if(validateLeasePayment(amount,rate)){
					double plan1 = findInstalment(amount,rate,3);
                    System.out.printf("%s %.2f %n","Your monthly instalment for 3 year leasing plan - ",plan1);
                    double plan2 = findInstalment(amount,rate,4);
                    System.out.printf("%s %.2f %n","Your monthly instalment for 4 year leasing plan - ",plan2);
                    double plan3 = findInstalment(amount,rate,5);
                    System.out.printf("%s %.2f %n","Your monthly instalment for 5 year leasing plan - ",plan3);
					     L1:while(true){
					       System.out.print("Do you want to search leasing category (Y/N):");
						   String op = input.next().toUpperCase();
						   switch(op){
				            case "Y":
				            clearConsole();
				             continue SC;
				            case "N":
				              clearConsole();
				              leasingPayment();
				              return;
				            default:
				              System.out.println("Please Enter Valid Input");
				              continue L1;
				            } 
							 }
					  }else{
						 L2:while(true){
					       System.out.print("Do you want to search another leasing category (Y/N):");
						   String op = input.next().toUpperCase();
						   switch(op){
				            case "Y":
				            clearConsole();
				             continue SC;
				            case "N":
				              clearConsole();
				              leasingPayment();
				              return;
				            default:
				          
				              System.out.println("Please Enter Valid Input");
				              continue L2;
				            } 
							 }
						 
						  }
					  }
				  
				 }
		     public static void findLeasAmount(){
				  Scanner input = new Scanner(System.in);
				  FLA:while(true){
			      System.out.println("+----------------------------------------------------------------------+");
	              System.out.println("|                     Find the Leasing Amount                          |");
	              System.out.println("+----------------------------------------------------------------------+");
	              System.out.println();
                  System.out.print("Enter the monthly lease payment amount you can afford:");
				  double amount = input.nextDouble();
				  System.out.print("Enter number of year       :");
				  int year = input.nextInt();
				  System.out.print("Enter annual interest rate :");
				  double rate = input.nextDouble();
				  
				  if(validateLeasePayment(amount,rate,year)){
                        double leaseAmount = calculateLeaseAmount(amount,rate,year);
					    System.out.printf("%s %.2f %n","you can get Lease Amount  :",leaseAmount);
					     L1:while(true){
					       System.out.print("Do you want to leasing amount again (Y/N):");
						   String op = input.next().toUpperCase();
						   switch(op){
				            case "Y":
				             clearConsole();
				             continue FLA;
				            case "N":
				              clearConsole();
				              leasingPayment();
				              return;
				            default:
				              clearConsole();
				              System.out.println("Please Enter Valid Input");
				              continue L1;
				            } 
							 }
					  }else{
						 L2:while(true){
					       System.out.print("Do you want to calculate another monthly instalment (Y/N):");
						   String op = input.next().toUpperCase();
						   switch(op){
				            case "Y":
				              clearConsole();
				             continue FLA;
				            case "N":
				              clearConsole();
				              leasingPayment();
				              return;
				            default:
				              System.out.println("Please Enter Valid Input");
				              continue L2;
				            } 
							 }
						 
						  }
					  }
				 }
			 
		        ///////////////////Calculations in leasing payment///////////////////
		        public static double findInstalment(double amount,double rate,int year){
					   double monthlyRate = rate / 12/100;
                        double pow = Math.pow(1+monthlyRate, year*12);
                        double instalment =amount*monthlyRate*pow /(pow-1);
                        return instalment;
					}
					public static double calculateLeaseAmount(double instalment,double rate,int year){
					   double monthlyRate = rate / 12/100;
                        double pow = Math.pow(1+monthlyRate, year*12);
                       double amount = instalment * (pow - 1) / (monthlyRate * pow);
                        return amount;
					}
				
				///////////////////Validation////////////////////
			public static boolean validateLeasePayment(double amount,double rate, int year){
				boolean isValid= true;
				 
					if(amount<0){
					System.out.println("Invalid amount..Enter the valid amount...");
					return isValid= false;
					}else if(rate<0){     
					     System.out.println("Invalid rate..Enter the valid rate...");
					     return isValid= false;	
						}else if(year>5){
							System.out.println("Invalid number of year...Enter the correct value again...");
							return isValid= false;
							}else{
								return isValid= true;
								}
				
				 
				
				
				}
				public static boolean validateLeasePayment(double amount,double rate){
				boolean isValid= true;
		
				if(amount<0){
					System.out.println("Invalid amount..Enter the valid amount...");
					return isValid= false;
					}else if(rate<0){     
					     System.out.println("Invalid rate..Enter the valid rate...");
					     return isValid= false;	
							}else{
								return isValid= true;
								}
				
				 
				
				}
				
				
				/////////////////Clear console///////////////////
		     public static void clearConsole(){
		       try{
			    final String os=System.getProperty("os.name");
			      if(os.contains("Windows")){
				    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			     }else{
				    System.out.print("\033[H\033[2J");
				    System.out.flush();
			      }
		           }catch(final Exception e){
			          e.printStackTrace();
			          //Handle any exceptions.
		           }
	         }	 
	         
	         
	         
	         
	         
	         ///////////////////////Menus//////////////////////////
	         public static void mainMenu(){
				   
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
	    System.out.printf("%7s%d%s%n","[",5,"] Leasing Payment");
	    System.out.println();
	    System.out.printf("%7s%d%s%n","[",6,"] Exit");
	    System.out.println();
	    System.out.println();
	    System.out.print("Enter an option to continue->");
	    int option = input.nextInt();
	    switch(option){
			  case 1:
			  clearConsole();
			  withHoldingTax();
			  break;
			  case 2:
			  clearConsole();
			  payableTax();
			  break;
			  case 3:
			  clearConsole();
			  incomeTax();
			  break;
			  case 4:
			  clearConsole();
			  ssclTax();
			  break;
			  case 5:
			  clearConsole();
			  leasingPayment();
			  break;
			  case 6:
			  clearConsole();
			  return;
			}
	 }
	 
	 public static void withHoldingTaxHome(){
		System.out.println("+----------------------------------------------------------------------+");
	    System.out.println("|                        WITHHOLDING TAX                               |");
	    System.out.println("+----------------------------------------------------------------------+");
	
		System.out.printf("%7s%d%s%n","[",1,"] Rent Tax");
	    System.out.println();
	    System.out.printf("%7s%d%s%n","[",2,"] Bank Interest Tax");
	    System.out.println();
	    System.out.printf("%7s%d%s%n","[",3,"] Dividend Tax");
	    System.out.println();
	    System.out.printf("%7s%d%s%n","[",4,"] Exit");
	    System.out.println();
	    System.out.println();

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
