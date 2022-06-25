package samply.de;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import samply.de.config.KafkaConsumerConfig;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(KafkaConsumerConfig.class)
public class ConsumerlogApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConsumerlogApplication.class, args);
  }

}