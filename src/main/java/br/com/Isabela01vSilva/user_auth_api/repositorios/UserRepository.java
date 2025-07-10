package br.com.Isabela01vSilva.user_auth_api.repositorios;

import br.com.Isabela01vSilva.user_auth_api.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String> {
    UserDetails findByLogin(String login);
}
