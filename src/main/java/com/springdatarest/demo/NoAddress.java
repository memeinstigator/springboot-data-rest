package com.springdatarest.demo;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "noAddresses", types = {Person.class})
interface NoAddress {

    String getFirstName();

    String getLastName();
}

