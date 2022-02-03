public class BankAccountTester {
    public static void main(String[] args){
        BankAccount bob = new BankAccount(5213452,"poop");
        BankAccount bill = new BankAccount(5213453,"peepee");
        bob.deposit(5.0);
        bob.transferTo(bill,3.0,"poop");
        bill.transferTo(bob,5.0,"peepee");
        bill.transferTo(bob,3.0,"pee");
        bill.transferTo(bob,2.0,"peepee");
        System.out.println(bob.getBalance());
        System.out.println(bill.getBalance());
        /*System.out.println(bob.getAccountID());
        System.out.println(bob.getBalance());
        bob.deposit(3.0);
        System.out.println(bob.getBalance());
        bob.deposit(-3.0);
        System.out.println(bob.getBalance());
        bob.withdraw(5.0);
        System.out.println(bob.getBalance());
        bob.withdraw(2.0);
        System.out.println(bob.getBalance());
        System.out.println(bob.toString());*/

    }
}
