package com.springdatarest.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LoadData implements CommandLineRunner, Ordered {

    private PersonRepository repo;

    public LoadData(PersonRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... strings) throws Exception {

        log.debug("Loading test person data");
        repo.save(new Person("Ram", "Desai", new Address("1234", "AP", "India")));
        repo.save(new Person("Gauranga", "Gogineni", new Address("3434", "AP", "India")));
        repo.save(new Person("Doug", "Casey", new Address("5643", "TX", "USA")));
        repo.save(new Person("Mark", "Nix", new Address("7676", "TX", "USA")));
        repo.save(new Person("Kiran", "Desai", new Address("1234", "AP", "India")));
        repo.save(new Person("Deepthi", "Gogineni", new Address("3434", "AP", "India")));
        repo.save(new Person("Jared", "Casey", new Address("5643", "TX", "USA")));
        repo.save(new Person("Derek", "Nix", new Address("7676", "TX", "USA")));
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
