package com.example._bmTopicosProgramacao7s.auth.dto;

import com.example._bmTopicosProgramacao7s.auth.enuns.UserRoleEnum;

public record RegisterDTO(String login, String password, UserRoleEnum role) {
}
