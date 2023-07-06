/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act4.pkg1;

import java.util.Scanner;

/**
 *
 * @author raniel
 */
public class Act41 {

    /**
     * @param args the command line arguments
     */
   
       
        
        
        
        
        public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int discount=1;
    public static int choose,quantity=1;
    public static double total=0,pay;
    
    public static void menu(){
   
    System.out.println("\t\t\t\t+=========================================+");
    System.out.println("\t\t\t\t         PETSHOP      ");
   System.out.println("\t\t\t\t   1. MICE       Php.40");
    System.out.println("\t\t\t\t   2.RABBIT       Php.50 ");
    System.out.println("\t\t\t\t   3. HAMSTER      Php.15");
    System.out.println("\t\t\t\t   4. PARROT        Php.25");
     System.out.println("\t\t\t\t   5.GOLDFISH      Php.20");
     System.out.println("\t\t\t\t   6. TORTOISE              Php.10");
     System.out.println("\t\t\t\t   7.GUPPY           Php.20");
        System.out.println("");
    System.out.println("\t\t\t\t    PROMO NOW!");
    System.out.println("\t\t   - BUY 20 TAKE5  for Php 250 ");
    System.out.println("\t\t   - Total order of Php 250to getMORE FREE PETS !");
   
        System.out.println("");
    System.out.println("\t\t\t\t   We also offer discounts on the following:");
    System.out.println("\t\t\t\t     1.)  Buying worth of 150 ( 5% off )");
    System.out.println("\t\t\t\t     2 .) Buying worth of 200( 10% off )");
    
    }
    
     public static void list1() {    
        switch (choose) {
            case 1 -> System.out.println("\t" + quantity + " MICE");
            case 2 -> System.out.println("\t" + quantity + " RABBIT ");
            case 3 -> System.out.println("\t" + quantity + " HAMSTER");
            case 4 -> System.out.println("\t" + quantity + " PARROT");
            case 5 -> System.out.println("\t" + quantity + " GOLD FISH");
             case 6 -> System.out.println("\t" + quantity + " TORTOISE");
            case 7 -> System.out.println("\t" + quantity + " GUPPY");
            default -> {
            }
        }
  }
    public static void list2(){
        switch (choose) {
             case 1 -> System.out.println("\t" + quantity + " MICE");
            case 2 -> System.out.println("\t" + quantity + " RABBIT ");
            case 3 -> System.out.println("\t" + quantity + " HAMSTER");
            case 4 -> System.out.println("\t" + quantity + " PARROT");
            case 5 -> System.out.println("\t" + quantity + " GOLD FISH");
             case 6 -> System.out.println("\t" + quantity + " TORTOISE");
            case 7 -> System.out.println("\t" + quantity + " GUPPY");
            default -> {
            }
        }
    }
    public static void list3(){
        switch (choose) {
           case 1 -> System.out.println("\t" + quantity + " MICE");
            case 2 -> System.out.println("\t" + quantity + " RABBIT ");
            case 3 -> System.out.println("\t" + quantity + " HAMSTER");
            case 4 -> System.out.println("\t" + quantity + " PARROT");
            case 5 -> System.out.println("\t" + quantity + " GOLD FISH");
             case 6 -> System.out.println("\t" + quantity + " TORTOISE");
            case 7 -> System.out.println("\t" + quantity + " GUPPY");
            default -> {
            }
        }
    }
    public static void list4(){
        switch (choose) {
            case 1 -> System.out.println("\t" + quantity + " MICE");
            case 2 -> System.out.println("\t" + quantity + " RABBIT ");
            case 3 -> System.out.println("\t" + quantity + " HAMSTER");
            case 4 -> System.out.println("\t" + quantity + " PARROT");
            case 5 -> System.out.println("\t" + quantity + " GOLD FISH");
             case 6 -> System.out.println("\t" + quantity + " TORTOISE");
            case 7 -> System.out.println("\t" + quantity + " GUPPY");
            default -> {
            }
        }
    }
    public static void list5(){
        switch (choose) {
            case 1 -> System.out.println("\t" + quantity + " MICE");
            case 2 -> System.out.println("\t" + quantity + " RABBIT ");
            case 3 -> System.out.println("\t" + quantity + " HAMSTER");
            case 4 -> System.out.println("\t" + quantity + " PARROT");
            case 5 -> System.out.println("\t" + quantity + " GOLD FISH");
             case 6 -> System.out.println("\t" + quantity + " TORTOISE");
            case 7 -> System.out.println("\t" + quantity + " GUPPY");
            default -> {
            }
        }
    }
    public static void list6(){
        switch (choose) {
         case 1 -> System.out.println("\t" + quantity + " MICE");
            case 2 -> System.out.println("\t" + quantity + " RABBIT ");
            case 3 -> System.out.println("\t" + quantity + " HAMSTER");
            case 4 -> System.out.println("\t" + quantity + " PARROT");
            case 5 -> System.out.println("\t" + quantity + " GOLD FISH");
             case 6 -> System.out.println("\t" + quantity + " TORTOISE");
            case 7 -> System.out.println("\t" + quantity + " GUPPY");
            default -> {
            }
            }
                
            }
     public static void list7(){
        switch (choose) {
          case 1 -> System.out.println("\t" + quantity + " MICE");
            case 2 -> System.out.println("\t" + quantity + " RABBIT ");
            case 3 -> System.out.println("\t" + quantity + " HAMSTER");
            case 4 -> System.out.println("\t" + quantity + " PARROT");
            case 5 -> System.out.println("\t" + quantity + " GOLD FISH");
             case 6 -> System.out.println("\t" + quantity + " TORTOISE");
            case 7 -> System.out.println("\t" + quantity + " GUPPY");
            default -> {
        }
        }
     }
      public static void order(){
        System.out.println("");
        System.out.println("Enter 6: CANCEL");     
        System.out.println("Enter the number code of your order: "); choose = input.nextInt();
        System.out.println("");                
         
        switch (choose) {
 
            case 1:
                System.out.println("You chose MICE");
                System.out.println("Enter the quantity of your order: "); quantity =input.nextInt();   
                total = total +(quantity*40);
      break;
            
            case 2:
                System.out.println("You chose RABBIT");
                System.out.println("Enter the quantity of your order: "); quantity =input.nextInt();         
                total = total +(quantity*50);        
       break;
           
            case 3:
                System.out.println("You chose HAMSTER");
                System.out.println("Enter the quantity of your order: "); quantity =input.nextInt();               
                total = total +(quantity*15);
       break;
            
            case 4:
                System.out.println("You chose PARROT");
                System.out.println("Enter the quantity of your order: ");
                quantity =input.nextInt();
                total = total +(quantity*250);
      break;
            
            case 5:
                System.out.println("You chose GOLD FISH");
                System.out.println("Enter the quantity of your order: ");
                quantity =input.nextInt();
                total = total +(quantity*25);
      break;
                    
            case 6:
                System.out.println("You chose TORTOISE");
                System.out.println("Enter the quantity of your order: ");
                quantity =input.nextInt();
                total = total +(quantity*10);
      break;
               case 7:
                System.out.println("You chose GUPPY");
                System.out.println("Enter the quantity of your order: ");
                quantity =input.nextInt();
                total = total +(quantity*15);
      break;
            case 8:
                System.exit(0);
            
            default:
                System.out.println("Choose 1 to 7 only!");
                order();
        break;
        }
        
                if(total >=100){
                    System.out.println("Total order of Php 250 to get free pets!");
                }       
                
                
                              
                System.out.println("");
                System.out.println("Add more?");
                System.out.println("Enter 1 for Yes and 2 for No: ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();                
                }
                else{
                    System.out.println("\t---Discount List---");
                    System.out.println(" We also offer discount to the following:");
                System.out.println(" Code 1 -  Buying worth of 150  ( 5% off )");
                System.out.println(" Code 2 -Buying worth of 200 ( 10% off )");
                System.out.println(" Note: Discounts cannot be stacked");
                    System.out.println("");
                    System.out.println("Enter 3 if neither applicable");
                    System.out.println("Enter your Code: "); discount = input.nextInt();
                    if(discount ==1){
                        total = total*0.95;
                    }
                    if(discount ==2){
                        total = total*0.90;
                    }
                    if(discount==3){
                        System.out.println("No discount applicable");
                        total = total - 0;
                    }                                                               
                    System.out.println("");
                    System.out.println("The bill is Php " + total + "0");
                    System.out.println("Enter Cash: "); pay = input.nextDouble();
                    
                    if(pay <total){
                        System.out.println("---Input sufficient cash amount---");
                        System.out.println("Enter Cash: "); pay = input.nextDouble();
                    }  
                    if(pay <total){
                        System.out.println("---Input sufficient cash amount---");
                        System.out.println("Enter Cash: "); pay = input.nextDouble();
                    }
                    if(pay <total){
                        System.out.println("---Input sufficient cash amount---");
                        System.out.println("3 Consecutive input invalid cash amount");
                    }
                    else{
                        total = pay-total;
                        System.out.println("The change is Php " + total + "0");
                      }
                    }                            
                System.out.println("Order again?");
                System.out.println("Enter 1 for Yes and 2 for No: ");
                        choose = input.nextInt();
                        if(choose==1){
                            System.out.println("\t\t\t\t+=========================================+");
    System.out.println("\t\t\t\t         PETSHOP      ");
   System.out.println("\t\t\t\t   1. MICE       Php.40");
    System.out.println("\t\t\t\t   2.RABBIT       Php.50 ");
    System.out.println("\t\t\t\t   3. HAMSTER      Php.15");
    System.out.println("\t\t\t\t   4. PARROT        Php.25");
     System.out.println("\t\t\t\t   5.GOLDFISH      Php.20");
     System.out.println("\t\t\t\t   6. TORTOISE              Php.10");
     System.out.println("\t\t\t\t   7.GUPPY           Php.20");
        System.out.println("");
    System.out.println("\t\t\t\t    PROMO NOW!");
    System.out.println("\t\t   - BUY 20 TAKE5  for Php 250 ");
    System.out.println("\t\t   - Total order of Php 250to getMORE FREE PETS !");
        System.out.println("");
    System.out.println("\t\t\t\t   We also offer discounts on the following:");
    System.out.println("\t\t\t\t     1.)  Buying worth of 150 ( 5% off )");
    System.out.println("\t\t\t\t     2 .) Buying worth of 200( 10% off )");
                            order();}
                        else{System.exit(0);}    
    }     
   
    public static void main(String[] args) {    
       menu();
       order();       
    }
    
}