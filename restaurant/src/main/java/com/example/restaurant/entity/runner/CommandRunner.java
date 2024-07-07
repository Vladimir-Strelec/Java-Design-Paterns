package com.example.restaurant.entity.runner;

import com.example.restaurant.entity.Table;
import com.example.restaurant.repository.TableRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CommandRunner implements CommandLineRunner {

    @Autowired
    TableRepository tableRepository;

    @Override
    public void run(String... args) throws Exception {
        Table table = Table.builder()
                .id(1L)
                .chairs(12)
                .zone("No smoke")
                .type("Private")
                .build();

        tableRepository.save(table);
    }
}
