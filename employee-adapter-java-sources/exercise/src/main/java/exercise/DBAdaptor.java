package exercise;
public class DBAdaptor implements Employee{
    private EmployeeDB employee;

    DBAdaptor(EmployeeDB e){
        this.employee = e;
    }

    public String getId(){
        return Integer.toString(employee.getId());
    };
    public String getFirstName(){
        return employee.getFirstName();
    };
    public String getLastName(){
        return employee.getSurname();
    };
    public String getEmail(){
        return employee.getEmailAddress();
    };

}
