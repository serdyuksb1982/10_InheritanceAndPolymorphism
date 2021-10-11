package company;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Company googleCompany = new Company();

        hire(googleCompany);
        getHighestSalary(googleCompany);
        getLowestSalary(googleCompany);
        fireEmployees(googleCompany);
    }
    private static void hire(Company company) {
        int countTopManager = 1;
        IntStream.range ( 0, countTopManager )
                .mapToObj ( i -> new TopManager ( company ) )
                .forEach ( company::hire );
        int countOperator = 5;
        IntStream.range ( 0, countOperator )
                .mapToObj ( i -> new Operator ( company ) )
                .forEach ( company::hire );
        int countManager = 4;
        IntStream.range ( 0, countManager )
                .mapToObj ( i -> new Manager ( company ) )
                .forEachOrdered ( company::hire );
    }
    private static void fireEmployees(Company company) {
        int count = 2;
        IntStream.range ( 0, company.sizeEmployees () / count )
                .mapToObj ( i -> (Employee) company.getEmployees ().get ( i ) )
                .forEach ( company::fire );
        System.out.println("The dismissed employees " + company.sizeEmployees() / count + " employees");
    }
    private static void getHighestSalary(Company company) {
        int count = 10;
        System.out.println(count + " highest salaries ");
        for (Employee emp : company.getTopSalaryStaff(count)) {
            System.out.println(emp.getMonthSalary());
        }
    }
    private static void getLowestSalary(Company company) {
        int count = 10;
        System.out.println(count + " lowest salaries ");
        for (Employee emp : company.getLowestSalaryStaff(count)) {
            System.out.println(emp.getMonthSalary());
        }
    }



}