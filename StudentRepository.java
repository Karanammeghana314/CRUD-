package karanam.com.STUDENT;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepository {
    private final List<Student> students = new ArrayList<>();

    // Preload some static students
    public StudentRepository() {
        students.add(new Student(1L, "Meghana", "R101"));
        students.add(new Student(2L, "Ravi", "R102"));
        students.add(new Student(3L, "Anita", "R103"));
    }

    public List<Student> findAll() {
        return students;
    }

    public Optional<Student> findByRollNo(String rollNo) {
        return students.stream()
                .filter(s -> s.getRollNo().equals(rollNo))
                .findFirst();
    }

    public List<Student> findByFirstName(String firstName) {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getFirstName().equalsIgnoreCase(firstName)) {
                result.add(s);
            }
        }
        return result;
    }

    public void save(Student student) {
        students.add(student);
    }

    public void deleteByRollNo(String rollNo) {
        students.removeIf(s -> s.getRollNo().equals(rollNo));
    }

    public boolean existsByRollNo(String rollNo) {
        return students.stream().anyMatch(s -> s.getRollNo().equals(rollNo));
    }
}
