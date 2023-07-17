import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] count = new int[6];
        int totalRolls = 500;

        for (int i = 0; i < totalRolls; i++) {
            int diceRoll = random.nextInt(6) + 1;
            count[diceRoll - 1]++;
        }

        for (int i = 0; i < count.length; i++) {
            int diceNumber = i + 1;
            int diceCount = count[i];
            double probability = (double) diceCount / totalRolls * 100;

            String formattedProbability = String.format("%.1f", probability);

            System.out.println("出目 " + diceNumber + ": " + diceCount + " 回, 確率 " + formattedProbability + "%");
        }
    }
}
