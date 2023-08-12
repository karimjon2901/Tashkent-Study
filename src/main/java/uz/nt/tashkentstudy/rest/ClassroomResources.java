package uz.nt.tashkentstudy.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.nt.tashkentstudy.service.ClassroomService;

@RestController
@RequestMapping("/classroom")
@RequiredArgsConstructor
public class ClassroomResources {
    private final ClassroomService classroomService;
}
