class Customer
{
    int amount=10000;

    synchronized void withdraw(int amt) {
        System.out.println("withdrawling Cash......");
        if (this.amount < amt) {
            System.out.println("Less Balance available wait......");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
            this.amount-=amt;
            System.out.println("Cash Withdrawn");

        }
    }
         synchronized void deposit(int amt)
        {

            System.out.println("Depositing Cash.....");
            this.amount+=amt;
            System.out.println("Cash Deposited");
            notify();
        }


}
public class InterMethod {
    public static void main(String arg[]) {
       final Customer c = new Customer();
        new Thread() {
            public void run() {
                c.withdraw(12000);
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposit(15000);
            }
        }.start();
    }
}




