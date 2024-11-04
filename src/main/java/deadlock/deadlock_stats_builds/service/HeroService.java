package deadlock.deadlock_stats_builds.service;

import deadlock.deadlock_stats_builds.model.Hero;
import deadlock.deadlock_stats_builds.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroService {

    @Autowired
    HeroRepository heroRepository;

    public List<Hero> allHeroes() {
        return (List<Hero>) heroRepository.findAll();
    }

    public Hero getHero(Long id) throws Exception{
        Optional<Hero> result = heroRepository.findById(id);

        if (result.isEmpty()){
            throw new Exception("Hero with Id: " + id + "not found");
        }

        return result.get();
    }
}
