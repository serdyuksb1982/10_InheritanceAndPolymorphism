package bank;

public class Main
{
    public static void main(String[] args) {
        //Пример использования класса NaturalPerson
        NaturalPerson naturalPerson = new NaturalPerson(1000.0,"Li-Li");
        naturalPerson.getBalanse();
        naturalPerson.putMoney(1000.0);
        naturalPerson.getBalanse();
        System.out.println("--------------------------------------------------------------------------------------");
        //Пример использования класса LegalPerson
        LegalPerson legalPerson = new LegalPerson(100000,"Djon Rokfeller");
        legalPerson.getBalanse();
        legalPerson.withdrawMoney(1000.0);
        legalPerson.getBalanse();
        System.out.println("--------------------------------------------------------------------------------------");
        //Пример использования класса IndividualEntereneur
        IndividualEntrepreneur individualEntrepreneur = new IndividualEntrepreneur(100000.0,"Standard oil company");
        individualEntrepreneur.getBalanse();
        individualEntrepreneur.putMoney(20000);
    }
}
