import java.util.Scanner;

public class Introduction {



    public static void main(String[] args) {

        Object obj = new Object();



    }

}

interface Account{
    void setPassword();
    void deposit();
    void withdraw();
    void createAccount();
}


class BankAccount implements Account{

    String name;
    int age;
    double accountNumber;
    private double password;
    private double balance;

    static boolean isExit(BankAccount obj){
        return obj.accountNumber != 0;
    }

    public BankAccount(String name, int age){
        this.name = name;
        this.age = age;
        this.balance = 0;
    }

    @Override
    public void createAccount() {
        if(isExit(this)){
            System.out.println(this.name + " your account already existed");
        }else{
            this.accountNumber = Math.random() * 1000000;
            Scanner sc = new Scanner(System.in);
            System.out.println("Creating your account -" );
            System.out.print("Set password : ");
            double pass = sc.nextDouble();
            this.password = pass;
            System.out.println("Dear " + this.name + ", Your account has been created");
        }

    }

    @Override
    public void deposit() {

        if(isExit(this)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter amount : ");
            double amount = sc.nextDouble();
            System.out.print(this.name + " enter your password : ");

            double password = sc.nextDouble();

            if(password == this.password){
                this.balance += amount;
                System.out.println(this.name + " your account has been credited " + amount + " rupees now your total balance is " + this.balance);

            }else{
                System.out.println("encryption corrupted");
            }
        }else{
            System.out.println("create your account firstly");
        }


    }


    public void deposit(BankAccount obj) {

        if(isExit(this) && isExit(obj)){
            System.out.print(this.name + " Enter your password : ");

            Scanner sc = new Scanner(System.in);

            double password = sc.nextDouble();

            System.out.print("Enter amount to deposit in " + obj.name + "'s account : ");
            double amount = sc.nextDouble();

            if(this.password == password && this.balance >= amount){
                obj.balance += amount;
                System.out.println("amount " + amount + " has been successfully deposit to " + obj.name);
            }else{
                System.out.println("encryption corrupted");
            }
        }else{
            System.out.println("You entered wrong details");
        }
    }

    @Override
    public void setPassword() {
        if(isExit(this)){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your new password : ");
            double newP = sc.nextDouble();
            this.password = newP;
            System.out.println(this.name + " your password has been updated");
        }else{
            System.out.println("create your account firstly");
        }
    }

    @Override
    public void withdraw() {
        if(isExit(this)){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter withdraw amount : ");
            double amount = sc.nextDouble();

            if(this.balance >= amount){
                this.balance -= amount;
                System.out.println(this.name + " your account has been withdraw " + amount + " rupees now your total balance is " + this.balance);
            }else{
                System.out.println(this.name + " your account balance is not sufficient");
            }
        }else{
            System.out.println("create your account firstly");
        }
    }

    public void checkBalance(){
        if(isExit(this)){
            System.out.println(this.name + " your total balance is " + this.balance);
            return;
        }else{
            System.out.println("create your account firstly");
        }
    }

    public void getAccountNumber(){
        if(isExit(this)){
            System.out.println(this.name + " your account number is : " + this.accountNumber);
            return;
        }else{
            System.out.println("create your account firstly");
        }
    }
}


