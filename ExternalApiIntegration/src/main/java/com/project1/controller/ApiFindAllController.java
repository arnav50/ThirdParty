package com.project1.controller;

import com.project1.externalService.ExternalServiceApis;
import com.project1.model.InternalContactModal;
import com.project1.service.ApiContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ApiFindAllController {

    @Autowired
    private ApiContactService apiContactService;

    @Autowired
    private ExternalServiceApis externalServiceApis;



    @GetMapping("/findAllContacts/{isActive}")
    public ResponseEntity<?> getContact(@PathVariable String isActive) {
        if (isActive.equalsIgnoreCase("true")) {
            return new ResponseEntity(externalServiceApis.externalFindAll(), HttpStatus.OK);
        }
        return new ResponseEntity( apiContactService.getContact(), HttpStatus.OK);
    }
    }
