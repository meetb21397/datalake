package samply.de.init;


import samply.de.domain.Country;
import samply.de.repository.CountryRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Locale;

public class CountryInit {

  private final CountryRepository countryRepository;

  public CountryInit(CountryRepository countryRepository) {
    this.countryRepository = countryRepository;
  }

  @Transactional
  public void init() {
    String[] isoCountries = Locale.getISOCountries();

    for (String isoCountry : isoCountries) {
      if (!countryRepository.existsByCode(isoCountry)) {
        countryRepository.save(new Country(isoCountry));
      }
    }
  }
}