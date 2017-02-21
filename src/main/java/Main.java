import org.apache.log4j.Logger;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        for (int i = 1; i < 10000; i++) {
            log.info("Logging info");
            log.warn("Logging warn");
        }
    }
}
