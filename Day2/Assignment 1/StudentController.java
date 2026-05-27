package controller;

import service.StudentService;
import entity.Student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentService service = new StudentService();

    // Add Student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    // Get All Students
    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // Get Student by ID
    @GetMapping("/{id}")
    public Object getStudentById(@PathVariable Long id) {
        Student student = service.getStudentById(id);
        if (student != null) {
            return student;
        } else {
            return "Student not found";
        }
    }

    // Update Student
    @PutMapping("/{id}")
    public String updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    // Delete Student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return service.deleteStudent(id);
    }
}
