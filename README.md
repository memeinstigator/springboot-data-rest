# springboot-data-rest
Spring Boot Data Rest examples with 

- Use of Spring Boot, Spring Data REST (HATEOAS), Lombok, Actuator, Actuator docs
- Use of Spring CommandLineRunner with Ordering to hydrate data
- Change Spring Boot Banner
- Person association to Address entity
- Person - export finders with different names & suppress some
- Get Address inline with Person as default - excerptProjection
- Other projects for different clients - NoAddress
- Modify ALPS profile - fields documentation
- Add Version for Entity to protect from stale updates
- Add LastModified to reduce burden on mobile clients

Run
- $ mvn spring-boot:run

View 
- http://localhost:8080
- http://localhost:8080/persons
- http://localhost:8080/persons/search/lastNameContains?name=Gogineni&NoAddress
- http://localhost:8080/actuator

