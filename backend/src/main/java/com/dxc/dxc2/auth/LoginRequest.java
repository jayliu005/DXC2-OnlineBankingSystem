package com.dxc.dxc2.auth;

import jakarta.validation.constraints.NotBlank;

public record LoginRequest(@NotBlank String userName, @NotBlank String password) {
}
