package service;

import entity.Student;

import java.util.*;

public class StudentService {

    private Map<Long, Student> database = new HashMap<>();
    private Long idCounter = 1L;

    // Add Student
    public Student addStudent(Student student) {
        student.setId(idCounter);
        database.put(idCounter, student);
        idCounter++;
        return student;
    }

    // Get All Students
    public List<Student> getAllStudents() {
        return new ArrayList<>(database.values());
    }

    // Get By ID
    public Student getStudentById(Long id) {
        return database.get(id);
    }

    // Update Student
    public String updateStudent(Long id, Student updatedStudent) {
        if (database.containsKey(id)) {
            updatedStudent.setId(id);
            database.put(id, updatedStudent);
            return "Student updated successfully";
        } else {
            return "Student not found";
        }
    }

    // Delete Student
    public String deleteStudent(Long id) {
        if (database.remove(id) != null) {
            return "Student deleted successfully";
        } else {
            return "Student not found";
        }
    }
}
