package deadlock.deadlock_stats_builds.model;

import jakarta.persistence.*;

@Entity
public class AbilityEffect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int abilityEffectId;

    @Column
    String Effect;

    @Column
    int value;

    public String getEffect() {
        return Effect;
    }

    public void setEffect(String effect) {
        Effect = effect;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
