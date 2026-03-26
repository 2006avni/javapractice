class BankingSystem {

    int balance = 1000;

    void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println("Withdrawing " + amount);
                balance -= amount;
                System.out.println("Remaining balance " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem b = new BankingSystem();

        Thread t1 = new Thread(() -> b.withdraw(700));
        Thread t2 = new Thread(() -> b.withdraw(500));

        t1.start();
        t2.start();
    }
}