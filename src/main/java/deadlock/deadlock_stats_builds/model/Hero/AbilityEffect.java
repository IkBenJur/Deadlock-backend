package deadlock.deadlock_stats_builds.model.Hero;

import jakarta.persistence.*;

@Entity
public class AbilityEffect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int abilityEffectId;

    @Column
    String Effect;

    @Column
    String value;

    public String getEffect() {
        return Effect;
    }

    public void setEffect(String effect) {
        Effect = effect;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
