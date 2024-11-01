package deadlock.deadlock_stats_builds.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String name;

    @Column
    String description;

    @Column
    int dps;

    @Column
    int bulletDamage;

    @Column
    int ammo;

    @Column
    int bulletPerSeconds;

    @Column
    int lightMelee;

    @Column
    int heavyMelee;

    @Column
    int maxHealth;

    @Column
    int regen;

    @Column
    int bulletResist;

    @Column
    int spiritResist;

    @Column
    float moveSpeed;

    @Column
    float sprintSpeed;

    @Column
    int stamina;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    Set<Ability> abilities;

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

    public int getDps() {
        return dps;
    }

    public void setDps(int dps) {
        this.dps = dps;
    }

    public int getBulletDamage() {
        return bulletDamage;
    }

    public void setBulletDamage(int bulletDamage) {
        this.bulletDamage = bulletDamage;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getBulletPerSeconds() {
        return bulletPerSeconds;
    }

    public void setBulletPerSeconds(int bulletPerSeconds) {
        this.bulletPerSeconds = bulletPerSeconds;
    }

    public int getLightMelee() {
        return lightMelee;
    }

    public void setLightMelee(int lightMelee) {
        this.lightMelee = lightMelee;
    }

    public int getHeavyMelee() {
        return heavyMelee;
    }

    public void setHeavyMelee(int heavyMelee) {
        this.heavyMelee = heavyMelee;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getRegen() {
        return regen;
    }

    public void setRegen(int regen) {
        this.regen = regen;
    }

    public int getBulletResist() {
        return bulletResist;
    }

    public void setBulletResist(int bulletResist) {
        this.bulletResist = bulletResist;
    }

    public int getSpiritResist() {
        return spiritResist;
    }

    public void setSpiritResist(int spiritResist) {
        this.spiritResist = spiritResist;
    }

    public float getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(float moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public float getSprintSpeed() {
        return sprintSpeed;
    }

    public void setSprintSpeed(float sprintSpeed) {
        this.sprintSpeed = sprintSpeed;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public Set<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(Set<Ability> abilities) {
        this.abilities = abilities;
    }
}
