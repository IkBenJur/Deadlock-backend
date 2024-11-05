package deadlock.deadlock_stats_builds.model.Item;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import deadlock.deadlock_stats_builds.model.Hero.Hero;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "buildId",
        scope = Build.class
)
public class Build {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long buildId;

    @Column
    String name;

    @Column
    String description;

    @Column
    Date createdAt;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    Set<ItemSet> itemSets;

    @ManyToOne
    @JoinColumn(name = "hero_id", referencedColumnName = "heroId")
    Hero hero;

    public Long getBuildId() {
        return buildId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Set<ItemSet> getItemSets() {
        return itemSets;
    }

    public void setItemSets(Set<ItemSet> itemSets) {
        this.itemSets = itemSets;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
