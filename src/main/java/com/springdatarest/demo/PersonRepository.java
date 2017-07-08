package com.springdatarest.demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = InlineAddress.class)
public interface PersonRepository
        extends PagingAndSortingRepository<Person, Long> {

    @RestResource(path = "lastNameContains", rel = "lastNameContains")
    List<Person> findByLastNameContains(@Param("name") String lastName);

    @RestResource
    List<Person> findByFirstNameOrLastName(@Param("fname") String fname, @Param("lname") String lname);

    @RestResource(path = "country", rel = "country")
    List<Person> findByAddressCountry(@Param("country") String country);

    @RestResource(exported = false)
    List<Person> findByLastNameContainsAndAddressCountry(@Param("name") String lastName, @Param("country") String country);
}
