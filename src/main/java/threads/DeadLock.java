package threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock extends Thread {
    public static void main(String[] args) {
        Account A = new Account(1000);
        Account B = new Account(2000);

        Transfer transfer1 = new Transfer(A, B, 200);
        Transfer transfer2 = new Transfer(B, A, 100);

        Thread t1 = new Thread(transfer1, "Thread1");
        Thread t2 = new Thread(transfer2, "Thread2");

        t1.start();
        t2.start();

    }
}
// Deadlock case in amount transfering between two accounts
// thread 1-> A is from account B is to account
// thread 2-> B is from account A is to account
// thread 1 and 2 will start
// thread 1 will lock A account (From account)
// thread 2 will lock B account (From account)
// thread 1 will wait for B account(toaccount for t1) to release and thread 2 will wait for A account( toaccount for t2) to realse
// and both thread wait for each other for life long

//Thread1 locks Account A first, then waits for Account B.
//Thread2 locks Account B first, then waits for Account A

class Transfer extends Thread {
    Account fromAccount;
    Account toAccount;
    int amount;

    Transfer(Account fromAccount, Account toAccount, int amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        transfer();
    }

    public void transfer() {
        synchronized (fromAccount) {
            System.out.println(Thread.currentThread().getName() + " locked from account");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (toAccount) {
                System.out.println(Thread.currentThread().getName() + " locked toAccount");
                fromAccount.withdraw(amount);
                toAccount.deposite(amount);
            }
        }
    }

//    public synchronized void transfer() {
//        System.out.println(Thread.currentThread().getName());
//        fromAccount.withdraw(amount);
//        toAccount.deposite(amount);
//        System.out.println(fromAccount.getBalance());
//    }

//    public void transfer() {
//        boolean fromLocked = false;
//        boolean toLocked = false;
//        // make sure we have created lock object in
//        try {
//            if (fromAccount.lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
//                fromLocked=true;
//                if (toAccount.lock.tryLock(100, TimeUnit.MILLISECONDS)) {
//                    toLocked=true;
//                    fromAccount.withdraw(amount);
//                    toAccount.deposite(amount);
//                    System.out.println(Thread.currentThread().getName()+" "+fromAccount.getBalance());
//                    toAccount.lock.unlock();
//                }
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }finally {
//           if(fromLocked)
//               fromAccount.lock.unlock();
//           else if(toLocked)
//               toAccount.lock.unlock();
//        }
//    }
}


class Account {
    private int balance;
    Lock lock = new ReentrantLock();

    Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public Object withdraw(int amount) {
        if (amount > balance) {
            return "insufficient balance";
        } else {
            balance -= amount;
            return amount;
        }
    }

    public void deposite(int amount) {
        balance = balance + amount;
    }
}
