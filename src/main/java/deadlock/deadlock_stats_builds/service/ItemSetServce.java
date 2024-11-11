package deadlock.deadlock_stats_builds.service;

import deadlock.deadlock_stats_builds.model.Item.ItemSet;
import deadlock.deadlock_stats_builds.repository.ItemSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ItemSetServce {

    @Autowired
    ItemSetRepository itemSetRepository;

    public List<ItemSet> createItemSets(Set<ItemSet> sets) {
        return (List<ItemSet>) itemSetRepository.saveAll(sets);
    }
}
