package ru.itis.sentry.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itis.sentry.dtos.TestDto;
import ru.itis.sentry.models.Test;
import ru.itis.sentry.repositories.TestRepository;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private TestRepository testRepository;

    @Override
    public TestDto getTestById(Long testId) {
        Test foundTest = testRepository.getById(testId);
        return TestDto.builder()
                .id(foundTest.getId())
                .build();
    }
}
