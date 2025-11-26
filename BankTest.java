import java.util.Scanner; 
class Account { 
protected int accountNo; 
protected double balance; 
Account(int accountNo, double balance) { 
this.accountNo = accountNo; 
this.balance = balance; 
} 
void checkBalance() { 
System.out.println("Account No: " + accountNo); 
System.out.println("Balance: " + balance); 
} 
void deposit(double amount) { 
balance += amount; 
System.out.println(amount + " deposited successfully."); 
} 
boolean withdraw(double amount) {
if (balance >= amount) { 
balance -= amount; 
System.out.println(amount + " withdrawn successfully."); 
return true; 
} 
else { 
System.out.println("Insufficient balance."); 
return false; 
} 
} 
} 
class Savings extends Account { 
private double interestRate; 
Savings(int accountNo, double balance, double interestRate) { 
super(accountNo, balance); 
this.interestRate = interestRate; 
} 
void addInterest() { 
double interest = balance * interestRate / 100; 
balance += interest; 
System.out.println("Interest of " + interest + " added. New Balance: " + balance); 
} 
} 
class Current extends Account { 
private double overdraftLimit; 
Current(int accountNo, double balance, double overdraftLimit) { 
super(accountNo, balance); 
this.overdraftLimit = overdraftLimit; 
} 
@Override 
boolean withdraw(double amount) { 
if (balance + overdraftLimit >= amount) { 
balance -= amount; 
System.out.println(amount + " withdrawn successfully."); 
return true; 
} 
else { 
System.out.println("Exceeded overdraft limit."); 
return false; 
} 
} 
} 
public class BankTest { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.println("=== Savings Account ==="); 
System.out.print("Enter account number: "); 
int savAccNo = sc.nextInt(); 
System.out.print("Enter initial balance: "); 
double savBalance = sc.nextDouble(); 
System.out.print("Enter interest rate (%): "); 
double rate = sc.nextDouble(); 
Savings sav = new Savings(savAccNo, savBalance, rate); 
sav.checkBalance(); 
sav.deposit(2000); 
sav.withdraw(1500); 
sav.addInterest(); 
sav.checkBalance(); 
System.out.println("\n=== Current Account ==="); 
System.out.print("Enter account number: "); 
int curAccNo = sc.nextInt(); 
System.out.print("Enter initial balance: "); 
double curBalance = sc.nextDouble(); 
System.out.print("Enter overdraft limit: "); 
double overdraft = sc.nextDouble(); 
Current cur = new Current(curAccNo, curBalance, overdraft); 
cur.checkBalance(); 
cur.deposit(5000); 
cur.withdraw(8000); 
cur.checkBalance(); 
} 
} 
