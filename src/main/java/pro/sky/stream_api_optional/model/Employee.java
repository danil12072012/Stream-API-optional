package pro.sky.stream_api_optional.model;

public class Employee {
    private String surnameEmployee;
    private String nameEmployee;
    private String patronymicEmployee;
    private int department;
    private int salary;
    private int id;
    static int counter = 1;

    public Employee(String surnameEmployee, String nameEmployee, String patronymicEmployee,int department, int salary) {
        id = counter++;

        this.surnameEmployee = surnameEmployee;
        this.nameEmployee = nameEmployee;
        this.patronymicEmployee = patronymicEmployee;
        this.department = department;
        this.salary = salary;
    }

    public String getSurnameEmployee() {
        return surnameEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public String getPatronymicEmployee() {
        return patronymicEmployee;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int wages) {
        this.salary = wages;
    }

    public String toString() {
        return "iD сотрудника " + id + ". ФИО: " + surnameEmployee + " " + nameEmployee + " " + patronymicEmployee + ". Отдел номер " + department + ", зарплата сотрудника " + salary;
    }

}
