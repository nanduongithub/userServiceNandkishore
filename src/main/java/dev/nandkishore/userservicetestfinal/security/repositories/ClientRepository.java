package dev.nandkishore.userservicetestfinal.security.repositories;

import java.util.Optional;

import dev.nandkishore.userservicetestfinal.security.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {
    Optional<Client> findByClientId(String clientId);
}