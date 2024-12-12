package medilux.aquabe.domain.type.repository;

import medilux.aquabe.domain.type.entity.SkinTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface SkinTypeRepository extends JpaRepository<SkinTypeEntity, UUID> {
    Optional<SkinTypeEntity> findByUserId(UUID userId);
}
