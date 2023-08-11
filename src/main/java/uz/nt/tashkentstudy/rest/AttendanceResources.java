package uz.nt.tashkentstudy.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.nt.tashkentstudy.service.AttendanceService;

@RestController
@RequestMapping("/attendance")
@RequiredArgsConstructor
public class AttendanceResources {
    private final AttendanceService attendanceService;
}
