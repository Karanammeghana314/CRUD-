package karanam.com.STUDENT;

public class Student {
    private Long id;
    private String firstName;
    private String rollNo;

    public Student(Long id, String firstName, String rollNo) {
        this.id = id;
        this.firstName = firstName;
        this.rollNo = rollNo;
    }

    // Getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getRollNo() { return rollNo; }
    public void setRollNo(String rollNo) { this.rollNo = rollNo; }
}
