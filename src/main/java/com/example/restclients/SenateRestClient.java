package com.example.restclients;

import com.example.models.SenateMembers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import org.springframework.http.HttpHeaders;
import java.util.Collections;

@Component
public class SenateRestClient {

    @Value("${propublica.congress.senate.url}")
    String senateUrl;

    @Value("${propublica.key.name}")
    String apiKeyName;

    @Value("${propublica.key.value}")
    String apiKeyValue;

    @Value("${propublica.host.name}")
    String hostName;

    @Value("${propublica.host.congress.value}")
    String hostValue;

    RestTemplate restTemplate;

    public SenateRestClient(RestTemplateBuilder restTemplateBuilder){
        restTemplate = restTemplateBuilder.build();
    }
    public SenateMembers getInfo(){
        SenateMembers info = null;

        try{
            URI uri;
            uri = new URI(senateUrl);
            HttpHeaders headers = new HttpHeaders();
            headers.set(apiKeyName, apiKeyValue);
            headers.set(hostName, hostValue);
            headers.setContentType(MediaType.APPLICATION_JSON);

            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            HttpEntity<String> request = new HttpEntity<String>(headers);
            ResponseEntity<SenateMembers[]> infoEntity = restTemplate.exchange(uri, HttpMethod.GET, request,
                    SenateMembers[].class);
            info = infoEntity.getBody()[0];
        }catch (URISyntaxException | NullPointerException e){
            e.printStackTrace();
        }
        return info;
    }
}
