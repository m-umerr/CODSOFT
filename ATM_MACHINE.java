import java.util.*;

class USER_ACCOUNT {
    float balance;

    public void pin(){
        int pin;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your PIN: ");
        pin = sc.nextInt();
        if(pin==0000){
            System.out.println("Congratulations! You have successfully logged into your account");
            menu();
        }
        else{
            System.out.println("INCORRECT PIN! PLEASE TRY AGAIN...");
            System.exit(1);
        }
    }
    public void menu(){
        int option;
        System.out.println("Select what you want to do: ");
        System.out.println("1. Withdraw Amount");
        System.out.println("2. Deposit Amount");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();
        switch (option){
            case 1:
                WithdrawAmount();
                break;

            case 2:
                DepositAmount();
                break;

            case 3:
                CheckBalance();
                break;

            case 4:
                System.exit(0);

            default:
                System.out.println("Enter Valid Number");
                System.exit(1);
        }

    }
    public void DepositAmount(){
        System.out.println("Enter the Amount to be Deposited: ");
        Scanner sc = new Scanner(System.in);
        float deposit = sc.nextFloat();
        balance = balance+deposit;
        menu();
    }
    public void WithdrawAmount(){
        System.out.println("Enter the Amount to be Withdrawn: ");
        Scanner sc = new Scanner(System.in);
        float withdraw = sc.nextFloat();
        if(withdraw>balance){
            System.out.println("Insufficient Balance. Please try again...");
        }
        else{
            balance = balance - withdraw;
        }
        menu();
    }
    public void CheckBalance(){
        System.out.println("Balance = " + balance);
        menu();
    }

}

class ATM_MACHINE{
    public static void main(String[] args){
        USER_ACCOUNT u1 = new USER_ACCOUNT();
        u1.pin();
    }
}