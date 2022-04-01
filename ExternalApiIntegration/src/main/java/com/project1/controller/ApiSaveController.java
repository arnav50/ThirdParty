package com.project1.controller;

import com.project1.dto.ContactDto;
import com.project1.dto.ExternalContactDto;
import com.project1.externalService.ExternalServiceApis;
import com.project1.model.InternalContactModal;
import com.project1.service.ApiContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ApiSaveController {

    @Autowired
    private ApiContactService apiContactService;

    @Autowired
    private ExternalServiceApis externalServiceApis;

    @PostMapping("/internalApiSaveToDatabase")
    public InternalContactModal saveContact(@RequestBody ContactDto contactDto) {
        return apiContactService.saveContact(contactDto);
    }
    @PostMapping("/externalApiSaveToDatabase")
    public String externalSave(@RequestBody ExternalContactDto externalContactDto) {
        return externalServiceApis.externalSave(externalContactDto);
    }
}
