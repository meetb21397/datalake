package samply.de;

import samply.de.producer.LineProducer;
import samply.de.reader.CsvReader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProducerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProducerApplication.class, args);
  }

  @Bean
  public CommandLineRunner sendFile(LineProducer lineProducer, CsvReader csvReader) {
    return args -> {
      csvReader.readAndCallback("classpath:test.csv", lineProducer::sendMessage);
    };
  }
}
