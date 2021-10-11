package company;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Company
{
    public static long income = 9_000_000L;
    private final ArrayList employees;
    public Company() {
        this.employees = new ArrayList();
    }

    public double getIncome() {
        return income;
    }
    public void hire(Employee employee) {
        employees.add(employee);
    }
    public void hireAll(Collection<Employee> employees) {
        this.employees.addAll(employees);
    }
    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getTopSalaryStaff(int count) {
        return getEmployeeComparator(count, new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return o2.getMonthSalary() - o1.getMonthSalary(); }});
    }
    public List<Employee> getLowestSalaryStaff(int count) {
        return getEmployeeComparator(count, new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return o1.getMonthSalary() - o2.getMonthSalary(); }});
    }

    private List<Employee> getEmployeeComparator(int count, Comparator<Employee> comparator) {
        List<Employee> nextArrayList = new ArrayList<>(employees);
        nextArrayList.sort ( comparator );
        List<Employee> outcome = new ArrayList<>();
        if (count <= nextArrayList.size() && count > 0)
        {
            outcome = IntStream.range ( 0, count )
                    .mapToObj ( nextArrayList::get )
                    .collect ( Collectors.toList () );
        }
        else System.out.println("The value must be greater than 0 and not exceed the list of employees!");
        return outcome;
    }
    public int sizeEmployees() {
        return employees.size();
    }
    public ArrayList getEmployees() {
        return employees;
    }

}
