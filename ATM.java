import java.util.*;
public class ATM {
    public static void main(String args[]){
      ATMop obj = new ATMop();

    }
    
}
class data{
    float balance;
}
class ATMop{
    
Scanner sc = new Scanner(System.in);
HashMap<Integer,data> map = new HashMap<>();

    ATMop(){
      System.out.println("***********************");
        System.out.println("Welcome to our ATM interface");
        op();
    }

      public void op(){
       System.out.println("***********************");
        System.out.println("enter your pincode");
        int pincode = sc.nextInt();
        if(map.containsKey(pincode)== true){
            data obj = map.get(pincode);
            menu(obj);
        }

        else {
           System.out.println("***********************");
            System.out.println("please create your account first...");
            System.out.println("set your pincode...");
            int pin = sc.nextInt();
            data obj = new data();
            map.put(pin,obj);
          menu(obj);
        }

    }

    public void menu(data obj){
        System.out.println("***********************");
        System.out.println("please enter valid number");
    System.out.println("1. check balance");
    System.out.println("2. withdraw money ");
    System.out.println("3. deposit money");
    System.out.println("4. check another account");
    System.out.println("5. exit");
     int n = sc.nextInt();

     if(n==1){
        check_balance(obj);
     }

     else if(n==2){
      withdraw(obj);
     }

     else if (n==3){
        deposit(obj);
       
     }

     else if(n==4){
        op();
     }
     else if(n==5){
        System.out.println("thank you !...");
     }
     else {
        System.out.println("please enter the valid option");
        menu(obj);
     }

    }
    public void check_balance(data obj){
        System.out.println("***********************");
        System.out.println("your balance is :"+ obj.balance);
        System.out.println("***********************");
        menu(obj);
    }
    public void withdraw(data obj){
        System.out.println("enter your amount");
        float a = sc.nextFloat();
        if(obj.balance>=a){
            obj.balance-=a;
            System.out.println("your amount succesfully wihtdraw...");
        }
        else{
            System.out.println("Insufficient balance");
        }
        
        System.out.println("***********************");
     menu(obj);}
    public void deposit(data obj){
         System.out.println("enter your amount");
        float a = sc.nextFloat();
        obj.balance += a;
        System.out.println("amount is deposited succesfully...");
        System.out.println("***********************");
         menu(obj);
    }
  


    


    }
    
    