import java.util.Scanner;

public class ATM {
    Scanner sc = new Scanner(System.in);
  static  int balance=0;
    public static void deposit(int a) {
        if(a>0)
           balance+=a;
        else
            System.out.println("enter correct amount");
    }

    public static void withdraw(int a) {
         if(balance>a)
             balance-=a;
         else
             System.out.println("low amount in your balance");
    }

    public static void check_balance() {
        System.out.println("current balance is"+balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int pin = 123;
        int c = 0;
        int amount;
        while (true) {
            int pin_code = sc.nextInt();
            if (pin_code != pin) {
                c++;
                System.out.println("wrong pin enter again");
                if (c == 3) {
                    System.out.println("ATM card block");
                    break;
                }
            } else {
                System.out.println("welcome to your bank account");
                int count=0;
                while (true) {
                    System.out.println("------ATM Menu------");
                    System.out.println("enter [1] for deposit");
                    System.out.println("enter [2] for withdraw");
                    System.out.println("enter [3] for check balance");
                    System.out.println("exit");

                    System.out.println("please enter your choice");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("enter amount to deposit");
                            amount = sc.nextInt();
                            deposit(amount);
                            break;
                        case 2:
                            System.out.println("enter amount to withdraw");
                            amount = sc.nextInt();
                            withdraw(amount);
                            break;
                        case 3:
                            check_balance();
                            break;
                        case 4:
                            System.out.println("exit");
                            count++;
                            break;
                    }
                    if(count!=0)
                        break;

                }

            }

        }
    }
}