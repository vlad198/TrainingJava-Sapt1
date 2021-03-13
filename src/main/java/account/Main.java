package account;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("123","vlad");
        System.out.println(account);

        Account  account1 = new Account("124","alin",1000);
        System.out.println(account1);

        System.out.println("credit 500 : " + account.credit(500));
        System.out.println(account);

        System.out.println("debit 100 : " + account1.debit(100));
        System.out.println(account1);

        System.out.println("transfer from account1 to account : " + account1.transferTo(account,1000));
        System.out.println("transfer from account1 to account : " + account1.transferTo(account,300));

        System.out.println(account);
        System.out.println(account1);
    }
}
