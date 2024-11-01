package deadlock.deadlock_stats_builds.controller;

import deadlock.deadlock_stats_builds.model.Hero;
import deadlock.deadlock_stats_builds.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hero")
public class HeroController {

    @Autowired
    private HeroService heroService;

    @GetMapping("/")
    public List<Hero> getHeroes(){
        return heroService.allHeroes();
    }
}
