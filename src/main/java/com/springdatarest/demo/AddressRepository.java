package com.springdatarest.demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AddressRepository
        extends PagingAndSortingRepository<Address, Long> {

    List<Address> findByCountry(@Param("country") String country);
}
