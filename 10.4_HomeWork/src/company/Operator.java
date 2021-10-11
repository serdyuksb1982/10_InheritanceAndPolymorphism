package company;
public class Operator implements Employee
{
    private String post;//должность
    private final Company myJob;
    public Operator(Company job) {
        getMonthSalary();
        getPost();
        this.stringText();
        this.myJob = job;
    }

    private Company getCompany() {
        return myJob;
    }
    @Override
    public int getMonthSalary() {
        return salaryGenerate();
    }
    private int salaryGenerate() {
        //зарплата
        return 40_000;
    }
    @Override
    public void getPost() {
        this.post = "Operator";
    }
    @Override
    public String stringText() {
        return post + getMonthSalary();
    }
}
