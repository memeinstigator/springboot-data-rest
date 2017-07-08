package com.springdatarest.demo;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inlineAddress", types = {Person.class})
interface InlineAddress {

    String getFirstName();

    String getLastName();

    Address getAddress();
}
