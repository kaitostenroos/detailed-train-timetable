package com.kaitostenroos.detailedtraintimetable.detailedtraintimetable;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kaitostenroos.detailedtraintimetable.domain.History;
import com.kaitostenroos.detailedtraintimetable.domain.HistoryRepository;

@SpringBootApplication(scanBasePackages = "com.kaitostenroos.detailedtraintimetable")
public class DetailedtraintimetableApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetailedtraintimetableApplication.class, args);
	}

}
