package br.com.Isabela01vSilva.user_auth_api.domain.user;

public record AuthenticationDTO(
    String login,
    String password
) {
}
