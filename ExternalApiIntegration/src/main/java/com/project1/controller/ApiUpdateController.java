package com.project1.controller;

import com.project1.externalService.ExternalServiceApis;
import com.project1.service.ApiContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ApiUpdateController {

    @Autowired
    private ApiContactService apiContactService;

    @Autowired
    private ExternalServiceApis externalServiceApis;

    @PutMapping("/externalApiUpdateById/{id}")
    public String externalUpdate(@PathVariable Long id) {
        return externalServiceApis.externalUpdate(id);
    }

}
