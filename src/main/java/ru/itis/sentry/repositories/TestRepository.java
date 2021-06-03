package ru.itis.sentry.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.sentry.models.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
}
