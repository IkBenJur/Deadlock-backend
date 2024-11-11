package deadlock.deadlock_stats_builds.controller;

import deadlock.deadlock_stats_builds.model.Hero.Hero;
import deadlock.deadlock_stats_builds.model.Item.Build;
import deadlock.deadlock_stats_builds.model.Item.BuildNameDescriptionDTO;
import deadlock.deadlock_stats_builds.model.Item.ItemSet;
import deadlock.deadlock_stats_builds.service.BuildService;
import deadlock.deadlock_stats_builds.service.ItemSetServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/build")
public class BuildController {

    @Autowired
    private BuildService buildService;

    @Autowired
    private ItemSetServce itemSetServce;

    @GetMapping("/")
    @CrossOrigin("http://localhost:4200")
    public List<Build> getBuilds() {
        return buildService.allBuilds();
    }

    @GetMapping("/{id}")
    @CrossOrigin("http://localhost:4200")
    public Build getBuild(@PathVariable("id") Long id) {
        try {
            return buildService.getBuild(id);
        } catch (Exception ex) {
            throw ex;
        }
    }

    @PostMapping("/")
    @CrossOrigin("http://localhost:4200")
    public ResponseEntity<Build> createBuild(@RequestBody Build newBuild) {
        List<ItemSet> itemSets = itemSetServce.createItemSets(newBuild.getItemSets());
        Build build = buildService.createBuild(newBuild);
        return ResponseEntity.status(HttpStatus.CREATED.value()).body(build);
    }

    @GetMapping("/hero/name-description/{id}")
    @CrossOrigin("http://localhost:4200")
    public List<BuildNameDescriptionDTO> getNameDescriptionByHeroId(@PathVariable("id") Long heroId){
        return buildService.findNameAndDescriptionByHeroId(heroId);
    }
}
