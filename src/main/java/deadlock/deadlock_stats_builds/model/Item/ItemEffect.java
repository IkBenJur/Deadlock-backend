package deadlock.deadlock_stats_builds.model.Item;

import jakarta.persistence.*;

@Entity
public class ItemEffect {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long itemEffectId;

    @Column
    String effect;
}
