import java.util.Random;

public class ComputerCall {
    public static String ComputerRandom() {
        String[] headers = {"B", "I", "N", "G", "O"};
        Random r = new Random();

        String randomHeader = headers[r.nextInt(headers.length)];

        String comCall = CallRandom.pickRandom(randomHeader);

        System.out.println(randomHeader+comCall);

        return randomHeader+comCall;
    }
}
