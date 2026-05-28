import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Map<String, Object> getPatient(@PathVariable Long id) {

        // Patient data
        Map<String, Object> patient = new HashMap<>();
        patient.put("patientName", "Amit");
        patient.put("doctorId", 201);

        // Call Doctor Service
        Map doctor = restTemplate.getForObject(
                "http://localhost:8085/doctors/201",
                Map.class
        );

        // Combine response
        Map<String, Object> response = new HashMap<>();
        response.put("patientName", patient.get("patientName"));
        response.put("doctorName", doctor.get("doctorName"));
        response.put("specialization", doctor.get("specialization"));

        return response;
    }
}

@Configuration
class Config3 {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
