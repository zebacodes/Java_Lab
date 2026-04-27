class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String acc, double bal){
        accountNumber = acc;
        balance = bal;
    }

    void deposit(double amt){
        balance += amt;
    }

    void withdraw(double amt){
        if(balance >= amt)
            balance -= amt;
        else
            System.out.println("Insufficient balance");
    }

    void display(){
        System.out.println("Account: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double rate;

    SavingsAccount(String acc, double bal, double rate){
        super(acc, bal);
        this.rate = rate;
    }

    void addInterest(){
        balance += balance * rate / 100;
    }
}

class FixedDepositAccount extends SavingsAccount {
    int period;

    FixedDepositAccount(String acc, double bal, double rate, int period){
        super(acc, bal, rate);
        this.period = period;
    }

    void maturityAmount(){
        double amt = balance * Math.pow(1 + rate/100, period);
        System.out.println("Maturity Amount: " + amt);
    }

    public static void main(String[] args) {
        FixedDepositAccount obj = new FixedDepositAccount("123", 1000, 5, 2);

        obj.deposit(500);
        obj.addInterest();
        obj.display();
        obj.maturityAmount();
    }
}
