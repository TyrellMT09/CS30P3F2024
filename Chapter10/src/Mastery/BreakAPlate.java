package Mastery;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BreakAPlate {

    private JFrame frame;
    private JLabel Out; 
    private Random random;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                BreakAPlate window = new BreakAPlate();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public BreakAPlate() {
        random = new Random();
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 425, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        panel.setLayout(null); 

        JLabel BaseP = new JLabel(new ImageIcon("C:/Users/16282511/git/CS30P3F2024/Chapter10/src/pics/plates.gif"));
        BaseP.setBounds(65, 15, 287, 79);
        panel.add(BaseP);

        JButton Play = new JButton("Play");
        Play.setBounds(153, 105, 112, 23);
        panel.add(Play);

        Out = new JLabel("");
        Out.setBounds(157, 129, 137, 107);
        panel.add(Out);

        JLabel Output = new JLabel("");
        Output.setBounds(155, 236, 114, 14);
        panel.add(Output);
  

        Play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Last = 2;
                int Rone = random.nextInt(Last); 
                if (Rone == 0) {
                    Output.setText("You win: Sticker");
                    BaseP.setIcon(new ImageIcon("C:/Users/16282511/git/CS30P3F2024/Chapter10/src/pics/plates_two_broken.gif"));
                    Out.setIcon(new ImageIcon("C:/Users/16282511/git/CS30P3F2024/Chapter10/src/pics/sticker.gif"));
                } else if (Rone == 1) {
                    Output.setText("You win: Tiger plush");
                    BaseP.setIcon(new ImageIcon("C:/Users/16282511/git/CS30P3F2024/Chapter10/src/pics/plates_all_broken.gif"));
                    Out.setIcon(new ImageIcon("C:/Users/16282511/git/CS30P3F2024/Chapter10/src/pics/tiger_plush.gif"));
                }
                Play.setText("Play Again");
            }
        });

        JLabel Backgrounds = new JLabel(new ImageIcon("C:/Users/16282511/git/CS30P3F2024/Chapter10/src/pics/Untitled.png"));
        Backgrounds.setBounds(0, 0, 409, 261);
        panel.add(Backgrounds);
    }
}