package deadlock.deadlock_stats_builds.controller;

import deadlock.deadlock_stats_builds.exception.InvalidItemTypeException;
import deadlock.deadlock_stats_builds.model.Item.Item;
import deadlock.deadlock_stats_builds.model.Item.ItemType;
import deadlock.deadlock_stats_builds.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/{type}")
    @CrossOrigin("http://localhost:4200")
    public List<Item> getByType(@PathVariable("type") String type){
        try {
            ItemType itemType = ItemType.valueOf(type.toUpperCase());
            return itemService.getByType(itemType);
        } catch (Exception e) {
            throw new InvalidItemTypeException(type + "not found. Valid item types are: WEAPON, SPIRIT or VITALITY");
        }
    }
}
