import java.util.*;
    class BankAccount{
        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }
        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public boolean withdraw(double amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                return true;
            }
            return false;
        }
        public double checkBalance() {
            return balance;
        }
    }
    class ATM{
        private BankAccount account;

        public ATM(BankAccount account) {
            this.account = account;
        }

        public void displayMenu() {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
        }
        public void run() {
            int key;
            String start;
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Welcome!");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Enter your key: ");
                key = sc.nextInt();
                System.out.println();

                switch(key){
                    case 1:
                    System.out.println("Current balance in your account is " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount for deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Current balance in your account after deposit " + account.getBalance());
                    break;
                case 3:
                    System.out.print("Enter amount for withdrawl: ");
                    double withdrawAmount = sc.nextDouble();
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Withdraw of " + withdrawAmount + " is successfully done. Your current balance is " + account.getBalance());
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using ATM.");
                    System.out.println("Have a nice day ahead.");
                    break;
                default:
                    System.out.println("Invalid key. Please enter a valid key.");
                 

                }
                System.out.println();
                System.out.print("Do you want to continue or want to exit? (y/n): ");
                start = sc.next();
        }       
        while (start.equalsIgnoreCase("y"));

            }
            public static void main(String args[]){
                double initial = 5000;
                BankAccount bankaccount = new BankAccount(initial);
                ATM atm = new ATM(bankaccount);
                atm.run();
    }
}
            
    
