package se.denize.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
                    Student miriam = new Student(
                            1L,
                            "Miriam",
                            "Miriam.jamal@gmail.com",
                            LocalDate.of(2000, Month.JANUARY, 5)
            );
                    //no id in alex. this will be autogenerated
            Student alex = new Student(
                    "Alex",
                    "axel.smith@gmail.com",
                    LocalDate.of(2004, Month.MARCH, 25)
            );

            repository.saveAll(List.of(miriam, alex));
        };

    }
}
