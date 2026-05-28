import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @GetMapping("/{id}")
    public Map<String, Object> getDoctor(@PathVariable Long id) {

        Map<String, Object> doctor = new HashMap<>();
        doctor.put("doctorId", 201);
        doctor.put("doctorName", "Dr. Rajesh");
        doctor.put("specialization", "Cardiologist");

        return doctor;
    }
}
