package lesson9.implementation;

import lesson9.Account;
import lesson9.Course;

public class CompanyAccount extends Account {

    public static int COUNT = 0;
//    private static double COURSE = 75.56; // 1 $ = 75.56 rublei

    public CompanyAccount(String name) {
        super(name);
        COUNT++;
    }

    public double getBalanceInDollars() {
        if (isBlocked()) {
            return 0;
        }
        return this.getBalance() / Course.CURRENT_VALUE;
    }

    @Override
    protected void printBalance() {
        System.out.println("tekyshii" + getBalanceInDollars());

    }
}
