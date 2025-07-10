package br.com.Isabela01vSilva.user_auth_api.domain.user;

public record RegisterDTO(
        String login,
        String password,
        UserRole role
) {
}
