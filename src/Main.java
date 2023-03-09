import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;

class Main {
    public static void main(String[] args) {
        SavingsAccount sv = new SavingsAccount(-10000, "Vanya", 1000);
        System.out.println(sv.getBalance());
        sv.pay(10000);
        System.out.println(sv.getBalance());
        sv.add(13000);
        System.out.println(sv.getBalance());

        CreditAccount cr = new CreditAccount(24000, "Anya");
        cr.add(24000);
        System.out.println(cr.getBalance());

        CheckingAccount ch = new CheckingAccount(-89000, "Tanya");
        System.out.println(ch.getBalance());
    }
}