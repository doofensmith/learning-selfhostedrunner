package com.learning.jpaspec.service.impl;

import com.learning.jpaspec.repository.PersonPendingRepository;
import com.learning.jpaspec.repository.PersonRepository;
import com.learning.jpaspec.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonPendingRepository personPendingRepository;

}
