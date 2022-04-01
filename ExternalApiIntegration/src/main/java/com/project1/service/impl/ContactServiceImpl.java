package com.project1.service.impl;

import com.project1.dto.ContactDto;
import com.project1.mapper.Mapper;
import com.project1.model.InternalContactModal;
import com.project1.repo.ContactRepo;
import com.project1.service.ApiContactService;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ApiContactService {

    @Autowired
    private ContactRepo contactRepo;

     @Override
    public List<InternalContactModal> getContact() {
        return contactRepo.findAll();
    }

    @Override
    public InternalContactModal saveContact(ContactDto contactDto) {
        return contactRepo.save(Mapper.INSTANCE.entityToDto(contactDto));
    }

    @Override
    public void deleteContact(Long contactId) {
        contactRepo.deleteById(contactId);
    }

    @Override
    public InternalContactModal findByName(String firstName) {
        return contactRepo.findByFirstName(firstName);
    }

    @Override
    public InternalContactModal removeContact(Long contactId) {
        InternalContactModal contact = contactRepo.findById(contactId)
                        .orElseThrow(() -> new ResourceNotFoundException("contact not found for this id :: "
                                + contactId));
        contact.setIsActive("N");
        InternalContactModal save = contactRepo.save(contact);
        return save;
    }


}
