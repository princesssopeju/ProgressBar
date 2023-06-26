import javax.swing.*;
import java.awt.*;

public class Bardemo {

    JFrame frame = new JFrame();
    JProgressBar progressBar = new JProgressBar(0,100);

    Bardemo() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        progressBar.setValue(0);
        progressBar.setFont(new Font("New Romans",Font.PLAIN,25));
        progressBar.setForeground(Color.pink);
        progressBar.setBackground(Color.WHITE);
        progressBar.setBounds(0, 0, 420, 50);
        progressBar.setStringPainted(true);
        frame.add(progressBar);

        fill();

    }

    public void fill() {
        int count = 0;
        while(count<=100) {
            progressBar.setValue(count);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count+=1;


        }
        progressBar.setString("Completed");
    }
}