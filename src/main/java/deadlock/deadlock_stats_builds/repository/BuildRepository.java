package deadlock.deadlock_stats_builds.repository;

import deadlock.deadlock_stats_builds.model.Item.Build;
import org.springframework.data.repository.CrudRepository;

public interface BuildRepository extends CrudRepository<Build, Long> {
}
