package karanam.com.STUDENT;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService() {
        this.studentRepository = new StudentRepository(); // Using static data
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentByRollNo(String rollNo) {
        return studentRepository.findByRollNo(rollNo);
    }

    public List<Student> getStudentsByFirstName(String firstName) {
        return studentRepository.findByFirstName(firstName);
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudentByRollNo(String rollNo) {
        studentRepository.deleteByRollNo(rollNo);
    }
}
