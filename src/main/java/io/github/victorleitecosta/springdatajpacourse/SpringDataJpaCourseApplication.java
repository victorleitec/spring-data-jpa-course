package io.github.victorleitecosta.springdatajpacourse;

import io.github.victorleitecosta.springdatajpacourse.model.entity.Student;
import io.github.victorleitecosta.springdatajpacourse.model.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaCourseApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student student = Student.builder().firstName("Fulano").lastName("Santos").email("fulano@email.com").age(21).build();
            repository.save(student);
        };
    }
}
