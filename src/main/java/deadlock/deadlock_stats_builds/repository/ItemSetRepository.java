package deadlock.deadlock_stats_builds.repository;

import deadlock.deadlock_stats_builds.model.Item.ItemSet;
import org.springframework.data.repository.CrudRepository;

public interface ItemSetRepository extends CrudRepository<ItemSet, Long> {
}
