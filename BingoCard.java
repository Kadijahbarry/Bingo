import javax.swing.*;
import java.awt.*;


public class BingoCard {
    public static void makeBingoCard(){
        JFrame bingoCard = new JFrame("Bingo");
        bingoCard.setLayout(new GridLayout(6, 5));
        bingoCard.setSize(500, 500);
        bingoCard.getContentPane().setBackground(Color.LIGHT_GRAY);
        bingoCard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] headers = {"B", "I", "N", "G", "O"};

        for (String h : headers) {
            JLabel label = new JLabel(h, SwingConstants.CENTER);
            label.setFont(new Font("Caladea", Font.BOLD, 32));
            label.setForeground(Color.WHITE);
            label.setOpaque(true);
            label.setBackground(new Color(70, 130, 180));
            label.setBorder(BorderFactory.createLineBorder(new Color(173,216,230), 3));
            bingoCard.add(label);
        }

        for (int i = 0; i < 5; i++) {
            for (String h : headers) {
                JButton space = new JButton(h + CallRandom.pickRandom(h));
                space.setFont(new Font("Caladea", Font.PLAIN, 20));
                space.setBackground(Color.WHITE);
                space.setBorder(BorderFactory.createLineBorder(new Color(173, 216, 230), 2));
                bingoCard.add(space);
            }
        }

        bingoCard.setVisible(true);
    }
}
