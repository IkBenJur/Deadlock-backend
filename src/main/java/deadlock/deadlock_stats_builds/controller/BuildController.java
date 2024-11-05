package deadlock.deadlock_stats_builds.controller;

import deadlock.deadlock_stats_builds.model.Item.Build;
import deadlock.deadlock_stats_builds.service.BuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/build")
public class BuildController {

    @Autowired
    private BuildService buildService;

    @GetMapping("/")
    @CrossOrigin("http://localhost:4200")
    public List<Build> getBuilds(){
        return buildService.allBuilds();
    }
}
