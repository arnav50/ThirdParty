package com.project1.controller;

import com.project1.externalService.ExternalServiceApis;
import com.project1.model.InternalContactModal;
import com.project1.service.ApiContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact")
public class ApiDeleteController {

    @Autowired
    private ApiContactService apiContactService;

    @Autowired
    private ExternalServiceApis externalServiceApis;

    @PutMapping("/internalRemoveDataFromDatabase/{contactId}")
    public InternalContactModal removeContact(@PathVariable Long contactId){
        return apiContactService.removeContact(contactId);
    }

    @DeleteMapping("/deleteContactFromDatabase")
    public String deleteContact(Long contactId) {
        apiContactService.deleteContact(contactId);
        return "Data Deleted!";
    }








}
