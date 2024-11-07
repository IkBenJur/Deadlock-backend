package deadlock.deadlock_stats_builds.service;

import deadlock.deadlock_stats_builds.model.Item.Item;
import deadlock.deadlock_stats_builds.model.Item.ItemType;
import deadlock.deadlock_stats_builds.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getByType(ItemType type) {
        return itemRepository.findByType(type);
    }
}
