package bank;

public class NaturalPerson extends Client
{
    protected NaturalPerson(double deposit, String nameClient) {
        super(deposit, nameClient);
    }

    @Override
    void getBalanse() {
        this.balanseClient = depositClient;
        System.out.println("Остаток баланса на счету физического лица " + nameClient + " " +  balanseClient + " руб." + "  Пополнение и снятие средств происходит без комиссии");
    }
    @Override
    void putMoney(double withdrawMoney) {
        if (withdrawMoney >= 0) {
            depositClient += withdrawMoney;
            System.out.println("Вы положили " + withdrawMoney + " руб." + " на счёт физического лица " + nameClient);
        } else System.out.println("Введите правльную сумму внесения.");
    }
    @Override
    void withdrawMoney(double withdrawMoney) {
        if (depositClient >= withdrawMoney) {
            depositClient -= withdrawMoney;
            System.out.println("Вы сняли сумму = " + withdrawMoney + " руб." + " со счёта физического лица " + nameClient);
        } else {
            if (depositClient < withdrawMoney) {
                System.out.println("Недостаточно денег для операции.");
            } else {
                System.out.println("Введите правильную сумму снятия.");
            }
        }
    }

}
