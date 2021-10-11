package company;
public class TopManager implements Employee
{
    private final int TOP_MANAGER_SALARY = 110_000;
    private int salary = TOP_MANAGER_SALARY;
    private String post;
    private final long incomeCompanyTM;
    private final Company myJob;
    public TopManager(Company job) {
        getMonthSalary();
        getPost();
        this.stringText();
        this.incomeCompanyTM = (long) (Company.income + (Math.random() * 1_500_000));
        this.myJob = job;
    }
    private Company getCompany() {
        return myJob;
    }

    @Override
    public int getMonthSalary() {
        if(incomeCompanyTM > 10_000_000) {
            this.salary = salaryGenerate() + (TOP_MANAGER_SALARY / 100 * 150);
        } else  {
            this.salary = salaryGenerate();
        }
      return salary;
    }
    private int salaryGenerate() {
        salary = TOP_MANAGER_SALARY;
        return salary;
    }

    @Override
    public void getPost() {
        this.post = "Top manager";
    }

    @Override
    public String stringText() {
        return post + getMonthSalary();
    }
}
