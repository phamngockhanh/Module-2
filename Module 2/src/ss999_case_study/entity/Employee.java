package ss999_case_study.entity;

public class Employee extends Person {
    private String employeeId;
    private String educationLevelList;
    private String position;
    private double salary;

    public Employee(String fullName, String dateOfBirth, String gender, String phoneNumber, String email, String identityCard, String employeeId, String educationLevelList, String position, double salary) {
        super(fullName, dateOfBirth, gender, phoneNumber, email, identityCard);
        this.employeeId = employeeId;
        this.educationLevelList = educationLevelList;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEducationLevelList() {
        return educationLevelList;
    }

    public void setEducationLevelList(String educationLevelList) {
        this.educationLevelList = educationLevelList;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "employeeId=" + employeeId +
                ", educationLevelList='" + educationLevelList + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getInfo() {
        return super.getInfo() + "," + employeeId + "," + educationLevelList + "," + position + "," + salary ;
    }
}
