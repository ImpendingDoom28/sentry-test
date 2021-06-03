package ru.itis.sentry.services;

import ru.itis.sentry.dtos.TestDto;

public interface TestService {

    TestDto getTestById(Long testId);
}
