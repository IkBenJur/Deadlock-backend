package deadlock.deadlock_stats_builds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DeadlockStatsBuildsApplication {
	public static void main(String[] args) {
		SpringApplication.run(DeadlockStatsBuildsApplication.class, args);
	}
}
