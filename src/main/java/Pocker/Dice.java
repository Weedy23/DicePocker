package Pocker;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Dice extends JToggleButton{
    private javax.swing.JLabel top = new JLabel();
    private javax.swing.JLabel mid = new JLabel();
    private javax.swing.JLabel bottom = new JLabel();

    private int n;
    public Dice() {
        n = new Random().nextInt(6) + 1;
        this.setSize(60, 60);
        this.setLayout(new BorderLayout());
        top.setFont(new Font("Calibri", Font.BOLD, 9));
        mid.setFont(new Font("Calibri", Font.BOLD, 9));
        bottom.setFont(new Font("Calibri", Font.BOLD, 9));
        this.add(BorderLayout.NORTH, top);
        this.add(BorderLayout.CENTER, mid);
        this.add(BorderLayout.SOUTH, bottom);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String[] text = getDiceGrafic(n);
        top.setText(text[0]);
        mid.setText(text[1]);
        bottom.setText(text[2]);
    }

    private String[] getDiceGrafic(int n) {
        String[] res = new String[3];
        switch (n) {
            case 1:
                res[0] = "       ";
                res[1] = "   *   ";
                res[2] = "       ";
                return res;
            case 2:
                res[0] = "      *";
                res[1] = "       ";
                res[2] = "*      ";
                return res;
            case 3:
                res[0] = "      *";
                res[1] = "   *   ";
                res[2] = "*      ";
                return res;
            case 4:
                res[0] = "*     *";
                res[1] = "       ";
                res[2] = "*     *";
                return res;
            case 5:
                res[0] = "*     *";
                res[1] = "   *   ";
                res[2] = "*     *";
                return res;
            case 6:
                res[0] = "*     *";
                res[1] = "*     *";
                res[2] = "*     *";
                return res;
        }
        return res;
    }

    public void throwDice() {
        n = new Random().nextInt(6) + 1;
        repaint();
    }

    public int getN() {
        return n;
    }
}
