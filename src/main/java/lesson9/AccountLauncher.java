package lesson9;

import lesson9.implementation.CompanyAccount;
import lesson9.implementation.PersonalAccount;

public class AccountLauncher {

    public static void main(String[] args) {
        Account account = new Account(""){
            @Override
            protected void printBalance() {

            }
        }; // Анонимный класс

        Account myAccount = new PersonalAccount("Ivanov Vitaly");
        myAccount.activated();
        myAccount.deposit(10_000);
        myAccount.withdraw(1_000);
        myAccount.deposit(5_000);
        System.out.println("Состояние счета: " +  myAccount.getBalance());

        PersonalAccount clientAccount = new PersonalAccount("Arni");
        clientAccount.activated();
        clientAccount.deposit(1_000_000);

        CompanyAccount companyAccount = new CompanyAccount("IT-Park");
        companyAccount.activated();
        companyAccount.deposit(10_000_000);

        CompanyAccount anotherCompanyAccount = new CompanyAccount("Roga i Kopitya");
//        anotherCompanyAccount.course = 70;
        anotherCompanyAccount.activated();
        anotherCompanyAccount.deposit(10_000_000);

        CompanyAccount vtbCompanyAccount = new CompanyAccount("VTB");
//        anotherCompanyAccount.course = 70;
        vtbCompanyAccount.activated();
        vtbCompanyAccount.deposit(100_000_000);


        System.out.println("Количество открытых расчетных счетов " + CompanyAccount.COUNT);

        System.out.println(PersonalAccount.getBic());
//        System.out.println(companyAccount.course);

        System.out.println("Состояние счета в дол : " + vtbCompanyAccount.getBalanceInDollars());

        lesson9.example.Account newAccount = new lesson9.example.Account("1235");

        String str = "1235";










    }
}
