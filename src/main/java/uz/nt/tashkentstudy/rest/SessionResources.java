package uz.nt.tashkentstudy.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.nt.tashkentstudy.service.SessionService;

@RestController
@RequestMapping("/session")
@RequiredArgsConstructor
public class SessionResources {
    private final SessionService sessionService;
}
