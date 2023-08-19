import java.util.Scanner;
public class atmMachine {
    public static void main(String[] args)
    {
         int balance = 50000, withdraw, deposit;
         Scanner s= new Scanner(System.in);


         while(true) 
         {
            System.out.println("");
            System.out.println("Welcome to my simplified automated teller machine. ");
            System.out.println("1. to deposit your money. ");
            System.out.println("2. to withdraw your money. ");
            System.out.println("3. to check your balance. ");
            System.out.println("4. to exit. ");
            System.out.print("choose the operation: ");

            int choice = s.nextInt();
            

            switch(choice)
            {

                case 1:
                System.out.println("Enter money to be deposit: ");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("your money has been sucessfully deposited. ");
                System.out.println("");
                break;


                case 2:
                System.out.println("Enter money to be withdrawn: ");
                withdraw = s.nextInt();
                if(balance>=withdraw)
                {
                    balance=balance-withdraw;
                    System.out.println("money withdrawn, plese collect your money. ");
                }
                else
                {
                    System.out.println("Insufficient balance. ");
                }
                System.out.println("");
                break;


                case 3: 
                System.out.println("Your balance is " +  balance + " only. ");
                System.out.println("");
                break;


                case 4:
                System.exit(0);
            }
        }
    }
}
