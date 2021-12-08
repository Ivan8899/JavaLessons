package lesson9.implementation;

import lesson9.Account;

public class PersonalAccount extends Account {



    public PersonalAccount(String name) {
        super(name);
    }

    public static String getBic() {
        return "15151515";
    }

    @Override
    protected void printBalance() {
        System.out.println("Tekyshii" + getBalance());
    }
}
