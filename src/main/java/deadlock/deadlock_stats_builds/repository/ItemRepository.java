package deadlock.deadlock_stats_builds.repository;

import deadlock.deadlock_stats_builds.model.Item.Item;
import deadlock.deadlock_stats_builds.model.Item.ItemType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Long> {
    List<Item> findByType(ItemType itemType);
}
