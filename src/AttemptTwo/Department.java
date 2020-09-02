package AttemptTwo;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private int deptCode;
    private String email;

    private List<Student> students;

    public Department(String name, int deptCode, String email, Institute institute) {
        this.name = name;
        this.deptCode = deptCode;
        this.email = email;
        students = new ArrayList<>();
    }

    public boolean enrol(String name,int id, String email, String phoneNr){
        for(Student s : students){
            if(s.getId() == id){
                System.out.println("Already in system");
                return false;
            }
        }
        System.out.println("New student enrolled");
        students.add(new Student(name, id, email, phoneNr));
        return true;
    }
    public boolean enrol(Student student){
        for (Student s: students){
            if(s.equals(student)){
                System.out.println("Already in system");
                return false;
            }
        }
        System.out.println("New student enrolled");
        students.add(student);
        return true;
    }
    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\n' +
                "deptCode=" + deptCode + '\n'+
                "email='" + email + '\n' +
                "students=" + students +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getDeptCode() {
        return deptCode;
    }

    public String getEmail() {
        return email;
    }

    public List<Student> getStudents() {
        return students;
    }
}
