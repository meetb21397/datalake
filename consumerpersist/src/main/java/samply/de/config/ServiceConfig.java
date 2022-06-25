package samply.de.config;

import samply.de.repository.AccountRepository;
import samply.de.repository.ActivityRepository;
import samply.de.repository.CountryRepository;
import samply.de.repository.GenderRepository;
import samply.de.repository.PreferenceRepository;
import samply.de.repository.UserRepository;
import samply.de.service.LineService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

  @Bean
  public LineService lineService(UserRepository userRepository, GenderRepository genderRepository, CountryRepository countryRepository, ActivityRepository activityRepository, PreferenceRepository preferenceRepository, AccountRepository accountRepository) {
    return new LineService(userRepository, genderRepository, countryRepository, activityRepository, preferenceRepository, accountRepository);
  }

}