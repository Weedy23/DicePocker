package Pocker;

public class Game {
    private static Pocker.Screen screen;
    private static int gameProces;

    public void start(String args[]) {
        screen = new Screen();
        screen.setVisible(true);
        gameProces = 0;
        P1();
    }

    public static void P1() {
        if (gameProces >= 26) {
            end();
            return;
        }
        screen.gameTime = true;
        screen.throwDices();
        screen.P1VisComb();
        screen.setThrows(0);
        screen.setEnableThrow();
        for (; screen.gameTime == true;) {
            screen.countCombP1();
        }
        screen.setAllDicesOn();
        screen.P1HidComb();
        gameProces++;
        P2();
    }

    public static void P2() {
        screen.gameTime = true;
        screen.throwDices();
        screen.P2VisComb();
        screen.setThrows(0);
        screen.setEnableThrow();
        for (; screen.gameTime == true;) {
            screen.countCombP2();
        }
        screen.setAllDicesOn();
        screen.P2HidComb();
        gameProces++;
        P1();
    }

    private static void end() {
        screen.end();
    }
}
