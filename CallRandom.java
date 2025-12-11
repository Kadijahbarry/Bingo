import java.util.Random;

public class CallRandom {
    public static String pickRandom(String h) {
        int start = 0;
        int end = 0;

        if (h.equals("B")) {
            start = 0;   end = 15;
        } else if (h.equals("I")) {
            start = 15;  end = 30;
        } else if (h.equals("N")) {
            start = 30;  end = 45;
        } else if (h.equals("G")) {
            start = 45;  end = 60;
        } else if (h.equals("O")) {
            start = 60;  end = 75;
        }

        Random r = new Random();
        int randomNumber = r.nextInt(end - start) + start;

        return String.valueOf(randomNumber);
    }
}
