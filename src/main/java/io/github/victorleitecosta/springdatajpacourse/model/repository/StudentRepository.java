package io.github.victorleitecosta.springdatajpacourse.model.repository;

import io.github.victorleitecosta.springdatajpacourse.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
