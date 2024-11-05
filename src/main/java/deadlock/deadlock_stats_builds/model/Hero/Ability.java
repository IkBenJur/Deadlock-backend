package deadlock.deadlock_stats_builds.model.Hero;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Ability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int abilityId;

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

    @Column
    int abilityNumber;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Ability_AbilityEffect",
            joinColumns = { @JoinColumn(name = "abilityId")},
            inverseJoinColumns = { @JoinColumn(name = "abilityEffectId")}
    )
    Set<AbilityEffect> abilityEffects;

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

    public Set<AbilityEffect> getAbilityEffects() {
        return abilityEffects;
    }

    public void setAbilityEffects(Set<AbilityEffect> abilityEffects) {
        this.abilityEffects = abilityEffects;
    }

    public int getAbilityNumber() {
        return abilityNumber;
    }

    public void setAbilityNumber(int abilityNumber) {
        this.abilityNumber = abilityNumber;
    }
}
