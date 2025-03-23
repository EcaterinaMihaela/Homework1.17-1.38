

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Aplicația a început!");

        try {
            int rezultat = 10 / 0; // Va genera o excepție
        } catch (Exception e) {
            logger.error("Eroare detectată: ", e);
        }

        logger.debug("Acesta este un mesaj de debug.");
        logger.warn("Acesta este un mesaj de avertizare.");
        logger.info("Aplicația s-a terminat.");
    }
}
