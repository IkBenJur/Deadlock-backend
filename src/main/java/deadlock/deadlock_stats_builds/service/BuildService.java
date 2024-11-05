package deadlock.deadlock_stats_builds.service;

import deadlock.deadlock_stats_builds.model.Item.Build;
import deadlock.deadlock_stats_builds.repository.BuildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildService {

    @Autowired
    BuildRepository buildRepository;

    public List<Build> allBuilds(){
        return (List<Build>) buildRepository.findAll();
    }
}
