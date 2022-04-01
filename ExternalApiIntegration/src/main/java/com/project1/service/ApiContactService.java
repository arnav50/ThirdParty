package com.project1.service;

import com.project1.dto.ContactDto;
import com.project1.model.InternalContactModal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ApiContactService {

    public List<InternalContactModal> getContact();
    public InternalContactModal saveContact(ContactDto contactDto);
    public void deleteContact(Long contactId);
    public InternalContactModal findByName(String firstName);
    public InternalContactModal removeContact(Long contactId);

}
