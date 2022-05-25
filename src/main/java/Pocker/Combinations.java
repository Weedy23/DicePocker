package Pocker;

public class Combinations {
    private int[] count = new int[6];
    private int sum = 0;
    public Combinations(int[] dicePoints) {
        for (int i = 0; i < 5; i++) {
            count[dicePoints[i] - 1]++;
            sum = sum + dicePoints[i];
        }
    }
    public int combination1() {
        return count[0];
    }
    public int combination2() {
        return count[1] * 2;
    }
    public int combination3() {
        return count[2] * 3;
    }
    public int combination4() {
        return count[3] * 4;
    }
    public int combination5() {
        return count[4] * 5;
    }
    public int combination6() {
        return count[5] * 6;
    }
    public int combination7() { //three of a kind
        for (int i = 0; i < 6; i++) {
            if (count[i] >= 3) {
                return sum;
            }
        }
        return 0;
    }
    public int combination8() { //four of a kind
        for (int i = 0; i < 6; i++) {
            if (count[i] >= 4) {
                return sum;
            }
        }
        return 0;
    }
    public int combination9() { //full house
        for (int i = 0; i < 6; i++) {
            if (count[i] == 2) {
                for (int j = 0; j < 6; j++) {
                    if (count[j] == 3) {
                        return 25;
                    }
                }
            }
        }
        return 0;
    }
    public int combination10() { //small straight
        if (count[0] > 0 && count[1] > 0 && count[2] > 0 && count[3] > 0) {
            return 30;
        } else if (count[1] > 0 && count[2] > 0 && count[3] > 0 && count[4] > 0) {
            return 30;
        } else if (count[2] > 0 && count[3] > 0 && count[4] > 0 && count[5] > 0) {
            return 30;
        }
        return 0;
    }
    public int combination11() { // large straight
        if ((count[0] > 0 && count[1] > 0 && count[2] > 0 && count[3] > 0 && count[4] > 0) || (count[1] > 0 && count[2] > 0 && count[3] > 0 && count[4] > 0 && count[5] > 0)) {
            return 40;
        }
        return 0;
    }
    public int combination12() { // Yahtzee
        for (int i = 0; i < 6; i++) {
            if (count[i] > 0) {
                if (count[i] == 5) {
                    return 50;
                } else {
                    return 0;
                }
            }
        }
        return 0;
    }
    public int combination13() { // chance
        return sum;
    }
}