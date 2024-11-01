package deadlock.deadlock_stats_builds.service;

import deadlock.deadlock_stats_builds.model.Hero;
import deadlock.deadlock_stats_builds.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroService {

    @Autowired
    HeroRepository heroRepository;

    public List<Hero> allHeroes() {
        return (List<Hero>) heroRepository.findAll();
    }
}
