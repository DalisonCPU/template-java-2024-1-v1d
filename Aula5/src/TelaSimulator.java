import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSimulator extends JFrame {
    private JTextField txtSaque;
    private JButton sacarButton;
    private JTextField txtDeposito;
    private JButton depositarButton;
    private JLabel lblSaldo;
    public JPanel painelPrincipal;

    Conta c = new Conta(1234, "João", 5000);

    public TelaSimulator() {

        String saldo = String.valueOf(c.getSaldo());
        lblSaldo.setText(saldo);

        sacarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.sacar(Float.parseFloat(txtSaque.getText()));



                String saldo = String.valueOf(c.getSaldo());
                lblSaldo.setText(saldo);
                txtSaque.setText("");
            }
        });

        depositarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.depositar(Float.parseFloat(txtDeposito.getText()));
                String saldo = String.valueOf(c.getSaldo());
                lblSaldo.setText(saldo);
                txtSaque.setText("");
            }
        });
    }
}
