package deadlock.deadlock_stats_builds.repository;

import deadlock.deadlock_stats_builds.model.Hero;
import org.springframework.data.repository.CrudRepository;

public interface HeroRepository extends CrudRepository<Hero, Long> {
}
