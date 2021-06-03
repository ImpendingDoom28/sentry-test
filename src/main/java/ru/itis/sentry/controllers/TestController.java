package ru.itis.sentry.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.sentry.services.TestService;

@RestController
@RequiredArgsConstructor
public class TestController {

    private TestService testService;

    @GetMapping("/test/{testId}")
    public ResponseEntity<?> getTestData(
            @PathVariable Long testId
    ) {
        return ResponseEntity.ok(testService.getTestById(testId));
    }
}
