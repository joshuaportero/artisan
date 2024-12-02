package dev.portero.artisan.security.repository;

import dev.portero.artisan.security.token.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<Token, Integer> {

    @Query(value = """
            SELECT token FROM Token token INNER JOIN User user\s
            ON token.user.id = user.id\s
            WHERE user.id = :id AND (token.expired = FALSE OR token.revoked = FALSE)\s
            """)
    List<Token> findAllValidTokenByUserId(Long id);

    Optional<Token> findByToken(String authToken);
}
