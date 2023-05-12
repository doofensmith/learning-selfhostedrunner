package com.learning.jpaspec.service;

import com.learning.jpaspec.domain.request.PersonRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {

    ResponseEntity<Object> newData(PersonRequest request);

}
