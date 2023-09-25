package pe.com.test_qsystem.exercises;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pe.com.test_qsystem.model.Person;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise1 {
    
    private Set<Person> persons;
    
    @BeforeEach
    public void setUp() {
        var faker = new Faker();
        persons = IntStream.range(0, 10)
                .mapToObj(i -> new Person(faker.numerify("########"), faker.name().lastName(), faker.name().lastName()))
                .collect(Collectors.toSet());
    }
    
    @Test
    public void orderPersons() {
        persons
                .forEach(p -> System.out.println(p.getDni() + " - " + p.getFatherName() + " " + p.getMotherName()));
        System.out.println("ordered persons ---------------------------------------------------");
        persons.stream()
                .sorted(this::compareWithDniAndAppPaterno)
                .forEach(p -> System.out.println(p.getDni() + " - " + p.getFatherName() + " " + p.getMotherName()));
    }

    private int compareWithDniAndAppPaterno(Person p1, Person p2) {
        var result = p1.getDni().compareTo(p2.getDni());
        if (result == 0) {
            result = p1.getFatherName().compareTo(p2.getFatherName());
        }
        return result;
    }
}
