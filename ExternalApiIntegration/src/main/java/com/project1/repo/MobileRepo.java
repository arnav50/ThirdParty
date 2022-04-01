package com.project1.repo;

import com.project1.model.InternalMobileModal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileRepo extends JpaRepository<InternalMobileModal, Long> {
}
