package bank;

public class IndividualEntrepreneur extends Client
{
    protected IndividualEntrepreneur(double deposit, String nameClient) {
        super(deposit, nameClient);
    }
    @Override
    void getBalanse() {
        this.balanseClient = depositClient;
        System.out.println("Остаток баланса на счету Юридического лица " + nameClient + " " +  balanseClient + " руб." + " У ИП — пополнение с комиссией 1%, если сумма меньше 1000 рублей. И с комиссией 0,5%, если сумма больше либо равна 1000 рублей.");
    }
    @Override
    void putMoney(double withdrawMoney) {
        if (depositClient >= withdrawMoney && withdrawMoney < 1000) {
            depositClient = depositClient + withdrawMoney - (withdrawMoney / 100 * 1);
            System.out.println("Вы пополнили сумму = " + withdrawMoney + " руб." + " на счёт ИП " + nameClient + " с комиссией 1% от вклада = " + (withdrawMoney / 100 * 1) + " руб.");
        } else if(depositClient >= withdrawMoney && withdrawMoney >= 1000) {
            depositClient = depositClient + withdrawMoney - (withdrawMoney / 100 * 0.5);
            System.out.println("Вы пополнили сумму = " + withdrawMoney + " руб." + " на счёт ИП " + nameClient + " с комиссией 0.5% от вклада = " + (withdrawMoney / 100 * 0.5) + " руб.");
        } else System.out.println("Введите правльную сумму внесения.");

    }
    @Override
    void withdrawMoney(double withdrawMoney) {
        if (depositClient >= withdrawMoney) {
            depositClient -= withdrawMoney;
            System.out.println("Вы сняли сумму = " + withdrawMoney + " руб." + " со счёта ИП " + nameClient);
        } else {
            if (depositClient < withdrawMoney) {
                System.out.println("Недостаточно денег для операции.");
            } else {
                System.out.println("Введите правильную сумму снятия.");
            }
        }
    }
}
