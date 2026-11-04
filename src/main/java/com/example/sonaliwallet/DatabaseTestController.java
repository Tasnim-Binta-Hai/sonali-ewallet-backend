
package com.example.sonaliwallet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;

@RestController
public class DatabaseTestController {

    private final JdbcTemplate jdbcTemplate;

    public DatabaseTestController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/api/db-test")
    public String testDatabaseConnection() {

        String result = jdbcTemplate.queryForObject(
                "SELECT 'Oracle Database Connected Successfully!' FROM DUAL",
                String.class
        );

        return result;
    }
}

