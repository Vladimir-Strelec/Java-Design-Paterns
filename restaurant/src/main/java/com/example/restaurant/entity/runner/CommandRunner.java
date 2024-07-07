package com.example.restaurant.entity.runner;

import com.example.restaurant.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class CommandRunner implements CommandLineRunner {

    @Autowired
    TableRepository tableRepository;

    @Override
    public void run(String... args) throws Exception {

    }
}
