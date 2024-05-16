import javax.swing.*;

class Main {
    public static void main(String[] args) {
        SimpleSwingApp s = new SimpleSwingApp();
        s.setContentPane(s.panel);
        s.setTitle("Gerenciador de lojas");
        s.setSize(400, 300);
        s.setLocationRelativeTo(null);
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}