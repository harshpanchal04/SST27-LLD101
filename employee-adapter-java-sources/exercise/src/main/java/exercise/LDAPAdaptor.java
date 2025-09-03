package exercise;

import javax.naming.ldap.LdapContext;

public class LDAPAdaptor implements Employee {
    private EmployeeLDAP employee;

    LDAPAdaptor(EmployeeLDAP e){
        this.employee = e;
    }

    public String getId(){
        return employee.get("uid");
    };
    public String getFirstName(){
        return employee.get("givenName");
    };
    public String getLastName(){
        return employee.get("sn");
    };
    public String getEmail(){
        return employee.get("mail");
    };


}
