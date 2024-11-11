package deadlock.deadlock_stats_builds.service;

import deadlock.deadlock_stats_builds.exception.BuildNotFoundException;
import deadlock.deadlock_stats_builds.model.Item.Build;
import deadlock.deadlock_stats_builds.model.Item.BuildNameDescriptionDTO;
import deadlock.deadlock_stats_builds.repository.BuildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuildService {

    @Autowired
    BuildRepository buildRepository;

    public List<Build> allBuilds() {
        return (List<Build>) buildRepository.findAll();
    }

    public Build createBuild(Build build) {
        return buildRepository.save(build);
    }

    public Build getBuild(Long id) throws BuildNotFoundException {
        Optional<Build> result = buildRepository.findById(id);

        if (result.isEmpty()){
            throw new BuildNotFoundException("Build with id: " + id + " not found.");
        }

        return result.get();
    }

    public List<BuildNameDescriptionDTO> findNameAndDescriptionByHeroId(Long id) {
        return buildRepository.findBuildIdNameDescriptionByHeroHeroId(id);
    }
}
