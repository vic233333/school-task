public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) {
                return true;
            }
        }
        return false;
    }

    // scoresClump method 1
    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            if (scores[i + 2] - scores[i + 1] <= 2 &&
                    scores[i + 1] - scores[i] <= 2 &&
                    scores[i + 2] - scores[i] <= 2) {
                return true;
            }
        }
        return false;
    }

    // scoresClump method 2
    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; 1++) {
            int max = Math.max(scores[i], Math.max(scores[i + 1], scores[i + 2]));
            int min = Math.min(scores[i], Math.min(scores[i + 1], scores[i + 2]));
            if (max - min <= 2) {
                return true;
            }
        }
        return false;
    }
}
