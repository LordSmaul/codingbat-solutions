package java.AP_1;

public class scoreUp {
    public int scoreup(String[] key, String[] answers) {

        int score = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equals(key[i])) {
                score += 4;
            } else if (answers[i].equals("?")) {
                continue;
            } else {
                score -= 1;
            }
        }

        return score;
    }
}
