package bank;
import java.util.Calendar;
class DepositAccount extends BankAccount
{
    private Calendar dateOfDeposit;
    private Calendar dateOfWithdrawal;
    protected DepositAccount(double deposit, String nameAccount) {
        super(deposit, nameAccount);
    }
    protected void withdrawMoney(double withdrawMoney) {
        dateOfWithdrawal = Calendar.getInstance();
        if (deposit >= withdrawMoney && dateOfWithdrawal.before(dateOfDeposit)) {
            deposit -= withdrawMoney;
            System.out.println("Вы сняли сумму = " + withdrawMoney + " руб." + " со счёта " + nameAccount);
        } else {
            if (deposit < withdrawMoney) {
                System.out.println("Недостаточно денег для операции.");
            } else System.out.println("Вы не можете снять деньги.");
        }
    }
    protected void putMoney(double withdrawMoney) {
        dateOfDeposit = Calendar.getInstance();
        if (withdrawMoney >= 0) {
            dateOfDeposit.add(Calendar.MONTH,1);
            deposit += withdrawMoney;
            System.out.println("Вы положили " + withdrawMoney + " руб." + " на счёт " + nameAccount);
        } else System.out.println("Введите правльную сумму внесения.");
    }
}
