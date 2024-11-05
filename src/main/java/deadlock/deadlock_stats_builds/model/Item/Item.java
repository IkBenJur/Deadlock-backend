package deadlock.deadlock_stats_builds.model.Item;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long itemId;

    @Column
    String name;

    @Column
    int cost;

    @Enumerated(EnumType.STRING)
    ItemType type;

    @Column
    Boolean active;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Item_ItemEffect",
            joinColumns = { @JoinColumn(name = "itemId")},
            inverseJoinColumns = { @JoinColumn(name = "itemEffectId")}
    )
    Set<ItemEffect> effects;

    public Long getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Set<ItemEffect> getEffects() {
        return effects;
    }

    public void setEffects(Set<ItemEffect> effects) {
        this.effects = effects;
    }
}
