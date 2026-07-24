package github.nataliatsi.marketplace.registration.infrastructure.persistence.repository;

import github.nataliatsi.marketplace.registration.infrastructure.persistence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerEntityRepository extends JpaRepository<CustomerEntity, UUID> {
}
