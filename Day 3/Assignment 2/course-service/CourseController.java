import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @GetMapping("/{id}")
    public Map<String, Object> getCourse(@PathVariable Long id) {

        Map<String, Object> course = new HashMap<>();
        course.put("courseId", 501);
        course.put("courseName", "Java Microservices");
        course.put("trainer", "Amit Sharma");

        return course;
    }
}
``
