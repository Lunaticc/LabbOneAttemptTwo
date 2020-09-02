package AttemptTwo;

public class Main {
    public static void main(String[] args) {
        Institute institute = new Institute("Högskolan Dalarna" , "Borlängevägen 123B", "Borlange@du.se", "0243-56574");
        Department department = new Department("Borlänge", 22330, "Hogskolan@du.se", institute);

        department.enrol("David", 1, "dav@du.se", "072-2808082");
        Student erik = new Student("Erik", 2, "eri@du.se", "070-8342309");
        department.enrol(erik);
        System.out.println(department);
    }
}
