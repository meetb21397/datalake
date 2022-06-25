package samply.de.init;


import samply.de.domain.Gender;
import samply.de.repository.GenderRepository;
import org.springframework.transaction.annotation.Transactional;

public class GenderInit {

  public static final String MALE = "Male";
  public static final String FEMALE = "Female";

  private final GenderRepository genderRepository;

  public GenderInit(GenderRepository genderRepository) {
    this.genderRepository = genderRepository;
  }

  @Transactional
  public void init() {
    if(!genderRepository.existsByLabel(MALE)) {
      genderRepository.save(new Gender(MALE));
    }
    if(!genderRepository.existsByLabel(FEMALE)) {
      genderRepository.save(new Gender(FEMALE));
    }

  }
}
