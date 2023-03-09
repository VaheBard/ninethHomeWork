package accounts;

public class Account {
    protected long balance;
    protected String name;

    protected Account(long balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    protected boolean pay(long amount) {
            balance = balance - amount;
            return true;
    }

    public boolean add(long amount) {
        balance += amount;
        return true;
    }
}
