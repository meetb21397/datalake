package samply.de.repository;

import samply.de.domain.User;
import samply.de.domain.Activity;
import org.springframework.data.repository.CrudRepository;

import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.UUID;

public interface ActivityRepository extends CrudRepository<Activity, UUID> {
  Optional<Activity> findByLastLoginAndUser(ZonedDateTime zonedDateTime, User user);
}