import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        StringBuilder alteredInput = new StringBuilder();

        for (int i = 0; i < Arrays.stream(args).count(); i++) {
            String input = args[i];
            char[] chars = input.toCharArray();

            for (int j = 0; j < chars.length; j++) {
                int randNumber = rand.nextInt(0,2);
                switch (randNumber) {
                    case 0:
                        chars[j] = Character.toUpperCase(chars[j]);
                        break;
                    case 1:
                        chars[j] = Character.toLowerCase(chars[j]);
                        break;
                }
                alteredInput.append(chars[j]);
            }
            if (i < args.length - 1) {
                alteredInput.append(" ");
            }
        }
        System.out.println(alteredInput.toString());
    }
}