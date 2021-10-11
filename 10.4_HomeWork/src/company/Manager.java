package company;

public class Manager implements Employee
{
    private String post;
    private final Company myJob;
    public Manager(Company job) {
        getMonthSalary();
        getPost();
        this.stringText();
        this.myJob = job;
    }
    private Company geCompany() {
        return myJob;
    }

    @Override
    public int getMonthSalary() {
        return salaryGenerate();
    }
    private int salaryGenerate() {
        int MANAGER_SALARY = 60000;
        return (int) (MANAGER_SALARY + ((Math.random () * (140000 - 115000)) + 115000 / 100 * 5));
    }

    @Override
    public void getPost() {
        this.post = "Manager";
    }

    @Override
    public String stringText() {
        return post + getMonthSalary();
    }


}
