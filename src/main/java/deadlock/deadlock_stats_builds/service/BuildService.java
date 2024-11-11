package deadlock.deadlock_stats_builds.service;

import deadlock.deadlock_stats_builds.model.Item.Build;
import deadlock.deadlock_stats_builds.model.Item.ItemSet;
import deadlock.deadlock_stats_builds.repository.BuildRepository;
import deadlock.deadlock_stats_builds.repository.ItemSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
