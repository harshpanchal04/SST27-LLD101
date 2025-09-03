package exercise;

public class CSVAdaptor implements Employee{
    private EmployeeCSV employee;
    String[] CSVData;
    
    CSVAdaptor(EmployeeCSV e){
        this.employee = e;
        CSVData = employee.tokens();
    }

    public String getId(){
        return CSVData[0];
    };
    public String getFirstName(){
        return CSVData[1];
    };
    public String getLastName(){
        return CSVData[2];
    };
    public String getEmail(){
        return CSVData[3];
    };
}
