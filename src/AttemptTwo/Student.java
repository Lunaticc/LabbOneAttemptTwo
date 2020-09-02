package AttemptTwo;

public class Student {
    private String name;
    private int id;
    private String email;
    private String phoneNr;

    public Student(String name, int id, String email, String phoneNr) {
        this.name = name;
        this.email = email;
        this.phoneNr = phoneNr;
        this.id = id;
//        id++; // unique ID for each student object created, and it increments by one for each object.
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", phoneNr='" + phoneNr + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }
}
