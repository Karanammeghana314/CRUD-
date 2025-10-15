package karanam.com.STUDENT;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{rollNo}")
    public Student getStudentByRollNo(@PathVariable String rollNo) {
        return studentService.getStudentByRollNo(rollNo).orElse(null);
    }

    @GetMapping("/name/{firstName}")
    public List<Student> getStudentsByFirstName(@PathVariable String firstName) {
        return studentService.getStudentsByFirstName(firstName);
    }

    @PostMapping
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @DeleteMapping("/{rollNo}")
    public void deleteStudentByRollNo(@PathVariable String rollNo) {
        studentService.deleteStudentByRollNo(rollNo);
    }
}
