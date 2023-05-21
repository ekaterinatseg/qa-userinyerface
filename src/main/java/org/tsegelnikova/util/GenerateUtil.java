package org.tsegelnikova.util;

import java.util.*;

public class GenerateUtil {
    private static final String LOW = "abcdefghijklmnopqrstuvwxyz";
    private static final String HIGH = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String CYRILLIC = "абвгдежзиклмнопрстуфхцчшщъыьэюя";
    private static final String DIGITAL = "0123456789";
    private static final Random rnd = new Random();
    private static final ArrayList<String> INTERESTS = new ArrayList<>(Arrays.asList("ponies", "polo", "dough", "snails",
            "balls", "postits", "faucets", "enveloppes", "cables", "questions", "squares", "purple", "cotton", "drywall",
            "closets", "tires", "windows", "mullets", "cinnamon"));

    private GenerateUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static String generateString() {
        StringBuilder sb = new StringBuilder(15);
        for (int i = 0; i < 15; i = i + 4) {
            sb.append(LOW.charAt(rnd.nextInt(LOW.length())));
            sb.append(HIGH.charAt(rnd.nextInt(HIGH.length())));
            sb.append(CYRILLIC.charAt(rnd.nextInt(CYRILLIC.length())));
            sb.append(DIGITAL.charAt(rnd.nextInt(DIGITAL.length())));

        }

        return sb.toString();
    }

    public static List<String> generateInterest() {
        Collections.shuffle(INTERESTS, rnd);
        return Arrays.asList(INTERESTS.get(0), INTERESTS.get(1), INTERESTS.get(2));
    }
}
