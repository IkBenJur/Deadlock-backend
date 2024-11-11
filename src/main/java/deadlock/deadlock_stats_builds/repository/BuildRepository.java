package deadlock.deadlock_stats_builds.repository;

import deadlock.deadlock_stats_builds.model.Item.Build;
import deadlock.deadlock_stats_builds.model.Item.BuildNameDescriptionDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BuildRepository extends CrudRepository<Build, Long> {
    List<BuildNameDescriptionDTO> findBuildIdNameDescriptionByHeroHeroId(long id);
}
