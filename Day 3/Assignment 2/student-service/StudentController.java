import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Map<String, Object> getStudent(@PathVariable Long id) {

        // Student data
        Map<String, Object> student = new HashMap<>();
        student.put("studentId", 1);
        student.put("studentName", "Neha");

        // Call Course Service
        Map course = restTemplate.getForObject(
                "http://localhost:8083/courses/501",
                Map.class
        );

        // Combine response
        Map<String, Object> response = new HashMap<>();
        response.put("studentId", student.get("studentId"));
        response.put("studentName", student.get("studentName"));
        response.put("courseName", course.get("courseName"));
        response.put("trainer", course.get("trainer"));

        return response;
    }
}

@Configuration
class Config2 {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
