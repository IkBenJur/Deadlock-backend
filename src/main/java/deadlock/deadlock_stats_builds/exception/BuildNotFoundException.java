package deadlock.deadlock_stats_builds.exception;

public class BuildNotFoundException extends RuntimeException {
    public BuildNotFoundException(String message) {
        super(message);
    }
}
