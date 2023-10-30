package com.example.demo.dtos;

import jakarta.validation.constraints.NotNull;

public record UserDto(@NotNull String name) {
}
