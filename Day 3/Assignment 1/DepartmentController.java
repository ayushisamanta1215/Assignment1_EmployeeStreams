import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @GetMapping("/{id}")
    public Map<String, Object> getDepartment(@PathVariable Long id) {

        Map<String, Object> dept = new HashMap<>();
        dept.put("departmentId", 101);
        dept.put("departmentName", "Engineering");
        dept.put("location", "Bangalore");
        dept.put("managerName", "Anil Kumar");

        return dept;
    }
}
