package io.maxzhivyn.appserver.domain.relational;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentJpaRepository extends JpaRepository<StudentEntity, UUID> {

}
