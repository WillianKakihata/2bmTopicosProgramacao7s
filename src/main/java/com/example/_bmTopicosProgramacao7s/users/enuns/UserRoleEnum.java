package com.example._bmTopicosProgramacao7s.users.enuns;

public enum UserRoleEnum{
    ADMIN("Administrador"),
    USER("Usuario");
    private String role;

    UserRoleEnum(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
