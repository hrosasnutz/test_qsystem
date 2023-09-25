package pe.com.test_qsystem.model;

public class Person {
    private String dni;
    private String fatherName;
    private String motherName;
    
    public Person(String dni, String fatherName, String motherName) {
        this.dni = dni;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    public String getDni() {
        return dni;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }
}
