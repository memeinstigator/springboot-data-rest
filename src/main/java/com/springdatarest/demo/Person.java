package com.springdatarest.demo;

import lombok.*;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;


@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
@Entity
public class Person {

    public @Version
    Long version;
    public @LastModifiedDate
    Date date;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @OneToOne(cascade = {CascadeType.ALL})
    @NonNull
    private Address address;
}
