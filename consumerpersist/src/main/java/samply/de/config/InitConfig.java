package samply.de.config;


import samply.de.init.CountryInit;
import samply.de.init.GenderInit;
import samply.de.repository.CountryRepository;
import samply.de.repository.GenderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitConfig {

  @Bean
  public GenderInit genderInit(GenderRepository genderRepository) {
    return new GenderInit(genderRepository);
  }

  @Bean
  public CountryInit countryInit(CountryRepository countryRepository) {
    return new CountryInit(countryRepository);
  }

  @Bean
  public CommandLineRunner initDb(GenderInit genderInit, CountryInit countryInit) {
    return arg -> {

      genderInit.init();
      countryInit.init();

    };
  }}