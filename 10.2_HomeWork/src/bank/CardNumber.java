package bank;
class CardNumber extends BankAccount
{
    protected CardNumber(double deposit, String nameAccount) {
        super(deposit, nameAccount);
    }
    protected void withdrawMoney(double withdrawMoney) {
        if (deposit >= withdrawMoney) {
            deposit = deposit - withdrawMoney - (withdrawMoney / 100 * 1);
            System.out.println("Вы сняли сумму = " + withdrawMoney + " руб." + " со счёта " + nameAccount);
        } else {
            if (deposit < withdrawMoney) {
                System.out.println("Недостаточно денег для операции.");
            } else {
                System.out.println("Введите правильную сумму снятия.");
            }
        }
    }
}
