package bank;
class BankAccount
{
    protected double deposit;//текущий счет
    protected String nameAccount;//имя аккаунта
    protected double balanse;//баланс
    protected BankAccount(double deposit, String nameAccount) //метод создания счёта
    {
        this.deposit = deposit;
        this.nameAccount = nameAccount;
    }
    protected void withdrawMoney(double withdrawMoney) //метод снятия средств со счета (с проверкой)
    {
        if (deposit >= withdrawMoney) {
            deposit -= withdrawMoney;
            System.out.println("Вы сняли сумму = " + withdrawMoney + " руб." + " со счёта " + nameAccount);
        } else {
            if (deposit < withdrawMoney) {
                System.out.println("Недостаточно денег для операции.");
            } else {
                System.out.println("Введите правильную сумму снятия.");
            }
        }
    }
    protected void putMoney(double withdrawMoney) //метод добавления средств на счёт
    {
        if (withdrawMoney >= 0) {
            deposit += withdrawMoney;
            System.out.println("Вы положили " + withdrawMoney + " руб.");
        } else System.out.println("Введите правльную сумму внесения.");
    }
    protected void getAccountBalanse() //проверка баланса
    {
        balanse = deposit;
        System.out.println("Остаток баланса на счету " + nameAccount + " " +  balanse + " руб.");
    }
    protected boolean send(BankAccount receiver, double withdrawMoney) //метод перевода средств с одного счёта на другой.
    {
        if (withdrawMoney > deposit) {
            return false;
        } else {
            deposit -= withdrawMoney;
            receiver.deposit += withdrawMoney;
        } return true;
    }
}
