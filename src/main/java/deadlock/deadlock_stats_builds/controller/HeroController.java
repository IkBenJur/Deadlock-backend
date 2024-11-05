package deadlock.deadlock_stats_builds.controller;

import deadlock.deadlock_stats_builds.model.Hero.Hero;
import deadlock.deadlock_stats_builds.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/hero")
public class HeroController {

    @Autowired
    private HeroService heroService;

    @GetMapping("/")
    @CrossOrigin("http://localhost:4200")
    public List<Hero> getHeroes(){
        return heroService.allHeroes();
    }

    @GetMapping("/{id}")
    @CrossOrigin("http://localhost:4200")
    public Hero getHero(@PathVariable("id") Long id) {
        try {
            return heroService.getHero(id);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Id not found");
        }
    }
}
