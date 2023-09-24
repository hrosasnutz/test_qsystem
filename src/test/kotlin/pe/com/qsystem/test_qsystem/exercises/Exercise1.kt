package pe.com.qsystem.test_qsystem.exercises

import io.github.serpro69.kfaker.Faker
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import pe.com.qsystem.test_qsystem.model.Person

class Exercise1 {
    
    private val log = LoggerFactory.getLogger(javaClass)
    
    private val faker = Faker()
    
    private lateinit var persons: List<Person>
    
    @BeforeEach
    fun init() {
        persons = IntRange(0, 9)
            .map { _ ->  Person(faker.string.numerify("########"), faker.name.lastName(), faker.name.lastName())}
    }
    
    @Test
    fun `order person list`() {
        log.info("unordered persons")
        persons.forEach{
            log.info("${it.dni} - ${it.appPaterno} ${it.appMaterno}")
        }
        log.info("ordered persons")
        persons
            .sortedWith { p1, p2 -> compareWithDniAndAppPaterno(p1, p2) }
            .forEach{ 
                log.info("${it.dni} - ${it.appPaterno} ${it.appMaterno}") 
            }
    }
    
    private fun compareWithDniAndAppPaterno(p1: Person, p2: Person): Int {
        val result = p1.dni.compareTo(p2.dni)
        return if (result == 0) {
            p1.appPaterno.compareTo(p2.appPaterno)
        } else {
            result
        }
    }
}