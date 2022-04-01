package com.project1.controller;

import com.project1.externalService.ExternalServiceApis;
import com.project1.model.InternalContactModal;
import com.project1.service.ApiContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ApiFineByNameController {

    @Autowired
    private ApiContactService apiContactService;

    @Autowired
    private ExternalServiceApis externalServiceApis;


    @GetMapping("/internalApiFindByName/{firstName}")
    public InternalContactModal findByName(@PathVariable String firstName) {
        return apiContactService.findByName(firstName);
    }
    @GetMapping("/externalApiFindByName/{firstName}")
    public String externalSearchByName(@PathVariable String firstName) {
        return externalServiceApis.externalSearchByFirstName(firstName);
    }

}
