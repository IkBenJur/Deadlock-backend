package deadlock.deadlock_stats_builds.model.Item;

public class BuildNameDescriptionDTO {
    Long buildId;
    String name;
    String description;

    public Long getBuildId() {
        return buildId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BuildNameDescriptionDTO(Long buildId, String name, String description) {
        this.buildId = buildId;
        this.name = name;
        this.description = description;
    }
}
