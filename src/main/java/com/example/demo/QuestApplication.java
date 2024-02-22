package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class QuestApplication {
		@GetMapping("/v1/student/name")
		public String getStudentName(@RequestParam(name = "formal", defaultValue = "false") boolean formal) {
			if (formal) {
				return "Iskander Mukhametkassym";
			} else {
				return "Iskander";
			}
		}

	public static void main(String[] args) {
		SpringApplication.run(QuestApplication.class, args);

	}
}
