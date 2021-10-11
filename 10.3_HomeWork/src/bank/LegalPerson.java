package bank;

public class LegalPerson extends Client
{
    protected LegalPerson(double deposit, String nameClient) {
        super(deposit, nameClient);
    }
    @Override
    void getBalanse() {
        this.balanseClient = depositClient;
        System.out.println("Остаток баланса на счету Юридического лица " + nameClient + " " +  balanseClient + " руб." + " Снятие средств с комиссией 1%");
    }
    @Override
    void putMoney(double withdrawMoney) {
        if (withdrawMoney >= 0) {
            depositClient += withdrawMoney;
            System.out.println("Вы положили " + withdrawMoney + " руб." + " на счёт Юридического лица " + nameClient);
        } else System.out.println("Введите правльную сумму внесения.");
    }
    @Override
    void withdrawMoney(double withdrawMoney) {
        if (depositClient >= withdrawMoney) {
            depositClient = depositClient - withdrawMoney - (withdrawMoney / 100 * 1);
            System.out.println("Вы сняли сумму = " + withdrawMoney + " руб." + " со счёта Юридического лица " + nameClient + " с комиссией 1% = " + (withdrawMoney / 100 * 1) + " руб.");
        } else {
            if (depositClient < withdrawMoney) {
                System.out.println("Недостаточно денег для операции.");
            } else {
                System.out.println("Введите правильную сумму снятия.");
            }
        }
    }
}
