package Pocker;

import javax.swing.*;
import java.awt.*;

public class Screen extends javax.swing.JFrame {

    public Screen() {
        initComponents();
        makeDices();
        makeCombNames();
        setP1();
        setP2();
    }

    public void makeDices() {
        dice = new Dice[5];
        for (int i = 0; i < 5; i++) {
            dice[i] = new Dice();
            dice[i].setBounds(10 + i*70, 10, 60, 60);
            dicePanel.add(dice[i]);
        }
    }

    public void setP1() {
        P1.setLayout(new FlowLayout());

        textP1 = new JLabel();
        textP1.setText("Player 1");
        textP1.setBounds(10, 10, 50, 20);
        textP1.setVisible(true);
        P1.add(textP1);

        punktsP1 = new JLabel();
        punktsP1.setText("Punkts: " + punP1);
        punktsP1.setBounds(10, 40, 60, 20);
        P1.add(punktsP1);

        makeCombButtonsP1();

        pack();
    }

    public void makeCombButtonsP1() {
        combP1 = new JButton[13];
        for (int i =0; i < 13; i++) {
            combP1[i] = new JButton();
            combP1[i].setText(combNames[i]);
            combP1[i].setBounds(200, 10 + (i*25), 200, 20);
            combP1[i].setVisible(false);
            final int I = i;
            combP1[i].addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    combP1Pressed(evt, I);
                }
            });
            P1.add(combP1[i]);
        }
    }

    public void P1VisComb() {
        for (int i = 0; i < 13; i++) {
            combP1[i].setVisible(true);
        }
    }

    public void setP2() {
        textP2 = new JLabel();
        textP2.setText("Player 2");
        textP2.setBounds(10, 10, 50, 20);
        P2.add(textP2);

        punktsP2 = new JLabel();
        punktsP2.setText("Punkts: " + punP2);
        punktsP2.setBounds(10, 40, 60, 20);
        P2.add(punktsP2);

        makeCombButtonsP2();
    }

    public void makeCombButtonsP2() {
        combP2 = new JButton[13];
        for (int i =0; i < 13; i++) {
            combP2[i] = new JButton();
            combP2[i].setText(combNames[i]);
            combP2[i].setBounds(200, 10 + (i*25), 200, 20);
            combP2[i].setVisible(false);
            final int I = i;
            combP2[i].addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    combP2Pressed(evt, I);
                }
            });
            P2.add(combP2[i]);
        }
    }

    public void P2VisComb() {
        for (int i = 0; i < 13; i++) {
            combP2[i].setVisible(true);
        }
    }

    private void makeCombNames() {
        combNames = new String[13];
        combNames[0] = "Aces";
        combNames[1] = "Twos";
        combNames[2] = "Threes";
        combNames[3] = "Fours";
        combNames[4] = "Fives";
        combNames[5] = "Sixes";
        combNames[6] = "Three Of A Kind";
        combNames[7] = "Four Of A Kind";
        combNames[8] = "Full House";
        combNames[9] = "Small straight";
        combNames[10] = "Large straight";
        combNames[11] = "Yahtzee";
        combNames[12] = "Chance";
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        dicePanel = new javax.swing.JPanel();
        P1 = new javax.swing.JPanel();
        throwDice = new javax.swing.JButton();
        P2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 500));

        javax.swing.GroupLayout dicePanelLayout = new javax.swing.GroupLayout(dicePanel);
        dicePanel.setLayout(dicePanelLayout);
        dicePanelLayout.setHorizontalGroup(
                dicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 952, Short.MAX_VALUE)
        );
        dicePanelLayout.setVerticalGroup(
                dicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 80, Short.MAX_VALUE)
        );

        P1.setPreferredSize(new java.awt.Dimension(420, 0));

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
                P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 420, Short.MAX_VALUE)
        );
        P1Layout.setVerticalGroup(
                P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 380, Short.MAX_VALUE)
        );

        throwDice.setText("Throw Dice");
        throwDice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                throwDiceActionPerformed(evt);
            }
        });

        throwDice.setEnabled(false);

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
                P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 420, Short.MAX_VALUE)
        );
        P2Layout.setVerticalGroup(
                P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(throwDice, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(dicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(dicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(142, 142, 142)
                                                .addComponent(throwDice)
                                                .addContainerGap(234, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(P2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(P1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                                                .addContainerGap())))
        );

        pack();
    }

    public void setThrows(int n) {
        Throws = n;
    }

    public void setEnableThrow() {
        throwDice.setEnabled(true);
    }

    private boolean throwDiceActionPerformed(java.awt.event.ActionEvent evt) {
        Throws++;
        throwDices();
        if (Throws == 3) {
            throwDice.setEnabled(false);
            return false;
        }
        return true;
    }

    public void throwDices() {
        for (int i = 0; i < 5; i ++) {
            if (dice[i].isSelected() == false) {
                dice[i].throwDice();
            }
        }
    }
    Pocker.Combinations comb;
    public void countCombP1() {
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = dice[i].getN();
        }
        comb = new Combinations(nums);
        combP1[0].setText(combNames[0] + " " + comb.combination1());
        combP1[1].setText(combNames[1] + " " + comb.combination2());
        combP1[2].setText(combNames[2] + " " + comb.combination3());
        combP1[3].setText(combNames[3] + " " + comb.combination4());
        combP1[4].setText(combNames[4] + " " + comb.combination5());
        combP1[5].setText(combNames[5] + " " + comb.combination6());
        combP1[6].setText(combNames[6] + " " + comb.combination7());
        combP1[7].setText(combNames[7] + " " + comb.combination8());
        combP1[8].setText(combNames[8] + " " + comb.combination9());
        combP1[9].setText(combNames[9] + " " + comb.combination10());
        combP1[10].setText(combNames[10] + " " + comb.combination11());
        combP1[11].setText(combNames[11] + " " + comb.combination12());
        combP1[12].setText(combNames[12] + " " + comb.combination13());
    }

    public void countCombP2() {
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = dice[i].getN();
        }
        comb = new Combinations(nums);
        combP2[0].setText(combNames[0] + " " + comb.combination1());
        combP2[1].setText(combNames[1] + " " + comb.combination2());
        combP2[2].setText(combNames[2] + " " + comb.combination3());
        combP2[3].setText(combNames[3] + " " + comb.combination4());
        combP2[4].setText(combNames[4] + " " + comb.combination5());
        combP2[5].setText(combNames[5] + " " + comb.combination6());
        combP2[6].setText(combNames[6] + " " + comb.combination7());
        combP2[7].setText(combNames[7] + " " + comb.combination8());
        combP2[8].setText(combNames[8] + " " + comb.combination9());
        combP2[9].setText(combNames[9] + " " + comb.combination10());
        combP2[10].setText(combNames[10] + " " + comb.combination11());
        combP2[11].setText(combNames[11] + " " + comb.combination12());
        combP2[12].setText(combNames[12] + " " + comb.combination13());
    }

    public void combP1Pressed(java.awt.event.ActionEvent evt, int i) {
        throwDice.setEnabled(false);
        combP1[i].setEnabled(false);
        switch (i) {
            case 0:
                punP1 += comb.combination1();
                break;
            case 1:
                punP1 += comb.combination2();
                break;
            case 2:
                punP1 += comb.combination3();
                break;
            case 3:
                punP1 += comb.combination4();
                break;
            case 4:
                punP1 += comb.combination5();
                break;
            case 5:
                punP1 += comb.combination6();
                break;
            case 6:
                punP1 += comb.combination7();
                break;
            case 7:
                punP1 += comb.combination8();
                break;
            case 8:
                punP1 += comb.combination9();
                break;
            case 9:
                punP1 += comb.combination10();
                break;
            case 10:
                punP1 += comb.combination11();
                break;
            case 11:
                punP1 += comb.combination12();
                break;
            case 12:
                punP1 += comb.combination13();
                break;
        }
        punktsP1.setText("" + punP1);
        gameTime = false;
    }

    public void combP2Pressed(java.awt.event.ActionEvent evt, int i) {
        throwDice.setEnabled(false);
        combP2[i].setEnabled(false);
        switch (i) {
            case 0:
                punP2 += comb.combination1();
                break;
            case 1:
                punP2 += comb.combination2();
                break;
            case 2:
                punP2 += comb.combination3();
                break;
            case 3:
                punP2 += comb.combination4();
                break;
            case 4:
                punP2 += comb.combination5();
                break;
            case 5:
                punP2 += comb.combination6();
                break;
            case 6:
                punP2 += comb.combination7();
                break;
            case 7:
                punP2 += comb.combination8();
                break;
            case 8:
                punP2 += comb.combination9();
                break;
            case 9:
                punP2 += comb.combination10();
                break;
            case 10:
                punP2 += comb.combination11();
                break;
            case 11:
                punP2 += comb.combination12();
                break;
            case 12:
                punP2 += comb.combination13();
                break;
        }
        punktsP2.setText("" + punP2);
        gameTime = false;
    }

    public void setAllDicesOn() {
        for (int i = 0; i < 5; i++) {
            dice[i].setSelected(false);
        }
    }

    public void P1HidComb() {
        for (int i = 0; i < 13; i++) {
            combP1[i].setVisible(false);
        }
    }

    public void P2HidComb() {
        for (int i = 0; i < 13; i++) {
            combP2[i].setVisible(false);
        }
    }

    public void end() {
        log = new JOptionPane();
        if (punP1 > punP2) {
            log.showMessageDialog(this, "first player win!");
        } else if (punP1 < punP2) {
            log.showMessageDialog(this, "second player win!");
        } else {
            log.showMessageDialog(this, "no winner!");
        }
    }

    private javax.swing.JPanel P1;
    private javax.swing.JPanel P2;
    private javax.swing.JPanel dicePanel;
    public javax.swing.JButton throwDice;
    Dice[] dice;
    private javax.swing.JLabel textP1;
    private javax.swing.JLabel textP2;
    private javax.swing.JLabel punktsP1;
    public int punP1 = 0;
    private javax.swing.JLabel punktsP2;
    public int punP2 = 0;
    public javax.swing.JButton[] combP1;
    public javax.swing.JButton[] combP2;
    private int Throws = 0;
    public boolean gameTime;
    private String[] combNames;
    private javax.swing.JOptionPane log;
}
