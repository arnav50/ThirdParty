package com.project1.externalService;

import com.project1.dto.ExternalContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class ExternalServiceApis {

    @Autowired
    private RestTemplate restTemplate;

    public String externalFindAll() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(httpHeaders);

        return restTemplate.exchange("http://10.50.2.196:8081/contact/findAllContacts", HttpMethod.GET, entity, String.class).getBody();
    }

    public String externalSave(ExternalContactDto externalContactDto){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<ExternalContactDto> entity = new HttpEntity<ExternalContactDto>(httpHeaders);

        return restTemplate.exchange("http://10.50.2.196:8081/save", HttpMethod.POST,entity,String.class).getBody();
    }

    public String externalUpdate(Long id){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<ExternalContactDto> entity = new HttpEntity<ExternalContactDto>(httpHeaders);

        return restTemplate.exchange("http://10.50.2.196:8081/update/"+id, HttpMethod.PUT,entity,String.class).getBody();
    }

    public String externalSearchByFirstName(String firstName){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<ExternalContactDto> entity = new HttpEntity<ExternalContactDto>(httpHeaders);

        return restTemplate.exchange("http://10.50.2.196:8081/search/"+firstName, HttpMethod.GET,entity,String.class).getBody();
    }

}

