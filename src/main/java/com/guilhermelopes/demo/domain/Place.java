package com.guilhermelopes.demo.domain;


import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public record Place(@Id Long id, String name, String slug, String state, LocalDateTime createdAt, LocalDateTime updatedAt) {
}
