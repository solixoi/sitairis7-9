package entityes;


public class Company {
    private String company_name;
    private WorkHours workHours;
    private Carsdb carsdb;


    public void setCarsdb(Carsdb carsdb) {
        this.carsdb = carsdb;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public void setWorkHours(WorkHours workHours) {
        this.workHours = workHours;
    }

    public String getCompany_name() {
        return company_name;
    }

    public WorkHours getWorkHours() {
        return workHours;
    }

    @Override
    public String toString() {
        return "Company name: " + getCompany_name() + "\nWork hours: " + workHours.toString() +
                "\nCars: " + carsdb.getCars();
    }
}
