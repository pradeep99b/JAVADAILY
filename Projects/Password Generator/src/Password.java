public class Password {

    String value;
    int length;

    public Password(String s) {
        value = s;
        length = s.length();
    }

    public int charType(char c) {
        if (c >= 65 && c <= 90) // A-Z
            return 1;
        else if (c >= 97 && c <= 122) // a-z
            return 2;
        else if (c >= 48 && c <= 57) // 0-9
            return 3;
        else // Special characters
            return 4;
    }

    public int passwordStrength() {
        boolean usedUpper = false;
        boolean usedLower = false;
        boolean usedNum = false;
        boolean usedSym = false;

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            int type = charType(c);

            if (type == 1) usedUpper = true;
            if (type == 2) usedLower = true;
            if (type == 3) usedNum = true;
            if (type == 4) usedSym = true;
        }

        int score = 0;
        if (usedUpper) score++;
        if (usedLower) score++;
        if (usedNum) score++;
        if (usedSym) score++;
        if (value.length() >= 8) score++;
        if (value.length() >= 16) score++;

        return score;
    }

    public String calculateScore() {
        int score = this.passwordStrength();

        if (score == 6) {
            return "Excellent password";
        } else if (score >= 4) {
            return "Good Password";
        } else if (score >= 3) {
            return "OK password";
        } else {
            return "Weak Password";
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
