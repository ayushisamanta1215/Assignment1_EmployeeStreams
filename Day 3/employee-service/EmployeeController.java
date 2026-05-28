import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Map<String, Object> getEmployee(@PathVariable Long id) {

        // Employee data
        Map<String, Object> emp = new HashMap<>();
        emp.put("employeeId", 1);
        emp.put("employeeName", "Rahul");
        emp.put("departmentId", 101);

        // Call Department Service
        Map dept = restTemplate.getForObject(
                "http://localhost:8081/departments/101",
                Map.class
        );

        // Combine response
        Map<String, Object> response = new HashMap<>();
        response.put("employeeId", emp.get("employeeId"));
        response.put("employeeName", emp.get("employeeName"));
        response.put("departmentName", dept.get("departmentName"));
        response.put("location", dept.get("location"));
        response.put("managerName", dept.get("managerName"));

        return response;
    }
}

@Configuration
class Config {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
