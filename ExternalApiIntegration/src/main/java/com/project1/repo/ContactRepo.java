package com.project1.repo;

import com.project1.model.InternalContactModal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<InternalContactModal, Long> {

    public InternalContactModal findByFirstName(String firstName);
}
