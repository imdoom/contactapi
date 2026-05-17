package io.spb.contactapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ContactRepo extends JpaRepository<Contact, String> {
    Optional<Contact> findById(String id);
}
