package deadlock.deadlock_stats_builds.model.Item;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class ItemSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long itemSetId;

    @Column
    String name;

    @ManyToMany()
    @JoinTable(
            name = "ItemSet_Item",
            joinColumns = { @JoinColumn(name = "itemSetId")},
            inverseJoinColumns = { @JoinColumn(name = "itemId")}
    )
    Set<Item> items;

    public Long getItemSetId() {
        return itemSetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
