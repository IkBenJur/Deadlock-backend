package deadlock.deadlock_stats_builds.model;

import jakarta.persistence.*;

@Entity
public class Ability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String name;

    @Column
    String description;

    @Column
    int cooldown;

    @Column
    String upgradeOne;

    @Column
    String upgradeTwo;

    @Column
    String upgradeThree;

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

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    public String getUpgradeOne() {
        return upgradeOne;
    }

    public void setUpgradeOne(String upgradeOne) {
        this.upgradeOne = upgradeOne;
    }

    public String getUpgradeTwo() {
        return upgradeTwo;
    }

    public void setUpgradeTwo(String upgradeTwo) {
        this.upgradeTwo = upgradeTwo;
    }

    public String getUpgradeThree() {
        return upgradeThree;
    }

    public void setUpgradeThree(String upgradeThree) {
        this.upgradeThree = upgradeThree;
    }
}
