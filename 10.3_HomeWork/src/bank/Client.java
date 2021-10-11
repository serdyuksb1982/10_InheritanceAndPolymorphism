package bank;

public abstract class Client
{
    protected double depositClient;//текущий счет
    protected String nameClient;//имя аккаунта
    protected double balanseClient;//баланс
    protected Client(double deposit, String nameClient) {
        this.depositClient = deposit;
        this.nameClient = nameClient;
    }
    abstract void getBalanse();
    abstract void putMoney(double withdrawMoney);
    abstract void withdrawMoney(double withdrawMoney);
}
