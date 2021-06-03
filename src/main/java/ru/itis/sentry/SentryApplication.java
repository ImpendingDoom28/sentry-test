package ru.itis.sentry;

import io.sentry.Sentry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SentryApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SentryApplication.class, args);
        Thread.sleep(4000);
        try {
            throw new Exception("Testing");
        } catch (Exception e) {
            Sentry.captureException(e);
            throw new IllegalStateException(e);
        }
    }

}
