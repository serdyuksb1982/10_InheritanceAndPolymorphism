package bank;
public class Main
{
    public static void main(String[] args) {
        System.out.println("Пример использования класса BankAccount");
        BankAccount bankAccount = new BankAccount(900.0, "Sergey Serdyuk");
        BankAccount bankAccount1 = new BankAccount(300.0, "Djimmi Breddok");
        System.out.println("пример использования метода send, перевода средств с одного счёта на другой.");
        System.out.println(bankAccount.send(bankAccount1,300.0));
        bankAccount.getAccountBalanse();
        bankAccount1.getAccountBalanse();
        System.out.println("--------------");
        System.out.println("Пример использования класса CardNumber");
        CardNumber cardNumberN1 = new CardNumber(150.0,"Liza Simpson");
        cardNumberN1.withdrawMoney(100.0);
        cardNumberN1.getAccountBalanse();
        System.out.println("--------------");
        System.out.println("Пример использования класса DepozitAccount");
        DepositAccount depositAccount = new DepositAccount(100.5, "Dillon Lebkov");

        depositAccount.withdrawMoney(50.0);
        depositAccount.getAccountBalanse();
    }
}
