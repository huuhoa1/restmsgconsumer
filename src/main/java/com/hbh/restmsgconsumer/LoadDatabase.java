package com.hbh.restmsgconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(MessageRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Message("Bilbo Baggins is a burglar")));
      log.info("Preloading " + repository.save(new Message("Frodo Baggins is a thief")));
    };
  }
}
