package com.study.ex02;
import com.study.ex02.domain.Course;
import com.study.ex02.domain.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Ex02Application {
    public static void main(String[] args) {SpringApplication.run(Ex02Application.class, args);}
    // Week02Application.java 의 main 함수 아래에 붙여주세요.
    @Bean
    public CommandLineRunner demo(CourseRepository repository) {
        return (args) -> {

            Course course1 = new Course("웹개발의 봄, Spring", name: "장창훈");
            repository.save(course1);

            List<Course> courseList = repository.findAll();
            for (int i=0; i < courseList.size(); i++) {
                System.out.println(courseList.get(i));
            }
        };
    }
}