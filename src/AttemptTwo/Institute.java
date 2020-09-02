package AttemptTwo;

import java.util.ArrayList;
import java.util.List;

public class Institute {
    private String name;
    private String address;
    private String email;
    private String phoneNr;

    private List<Department> departments;

    
    public Institute(String name, String address, String email, String phoneNr) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNr = phoneNr;
        departments = new ArrayList<>();
    }

    public boolean newDepartment(Department department){
        for (Department d : departments){
            if(department.equals(d)){
                System.out.println("Already in system");
                return false;
            }
        }
        System.out.println("New department added");
        departments.add(department);
        return true;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNr='" + phoneNr + '\'' +
                ", departments=" + departments +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNr() {
        return phoneNr;
    }
}
