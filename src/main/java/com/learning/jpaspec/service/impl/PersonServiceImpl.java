package com.learning.jpaspec.service.impl;

import com.learning.jpaspec.domain.request.PersonRequest;
import com.learning.jpaspec.repository.PersonPendingRepository;
import com.learning.jpaspec.repository.PersonRepository;
import com.learning.jpaspec.service.PersonService;
import com.learning.jpaspec.util.ResponseUtil;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonPendingRepository personPendingRepository;

    @Transactional
    @Override
    public ResponseEntity<Object> newData(PersonRequest request) {
        personRepository.spInsertPerson(request.getName(), request.getEmail());

        return ResponseUtil.build(HttpStatus.OK, "Success", null);
    }
}
