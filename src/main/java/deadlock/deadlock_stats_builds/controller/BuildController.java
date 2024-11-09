package deadlock.deadlock_stats_builds.controller;

import deadlock.deadlock_stats_builds.model.Item.Build;
import deadlock.deadlock_stats_builds.service.BuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/build")
public class BuildController {

    @Autowired
    private BuildService buildService;

    @GetMapping("/")
    @CrossOrigin("http://localhost:4200")
    public List<Build> getBuilds() {
        return buildService.allBuilds();
    }

    @PostMapping("/")
    @CrossOrigin("http://localhost:4200")
    public ResponseEntity<Build> createBuild(@RequestBody Build newBuild) {
        Build build = buildService.createBuild(newBuild);
        return ResponseEntity.status(HttpStatus.CREATED.value()).body(build);
    }
}
