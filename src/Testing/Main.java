package Testing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JPanel Rumus;
    private JLabel judulRumus;
    private JTextField inputSisi;
    private JTextField hasilKelling;
    private JButton hitungButton;
    private JButton hapusButton;
    private JButton keluarButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().Rumus);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Main() {
    hitungButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Local Var
            double sisi, hasilKeliling;

            // Get input user
            sisi = Double.parseDouble(inputSisi.getText());

            // Calculating
            hasilKeliling = 4 * sisi;

            // Pass result hasilKeliling to tfhasilkeliling
            hasilKelling.setText(String.valueOf(hasilKeliling));

        }
    });
        hapusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputSisi.setText("");
                hasilKelling.setText("");
                inputSisi.requestFocus();
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
