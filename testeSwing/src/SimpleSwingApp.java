import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.accessibility.*;

public class SimpleSwingApp extends JFrame {

    private GerenciadorLoja gerenciador = new GerenciadorLoja();

    JPanel panel;
    private JTextField textField;
    private DefaultListModel<String> listModel;
    private JList<String> list;
    private JButton addButton;
    private JButton editButton;
    private JButton removeButton;




    private void setAccessibility(JComponent component, String name) {
        AccessibleContext context = component.getAccessibleContext();
        context.setAccessibleName(name);
    }


    public SimpleSwingApp() {
        setTitle("Administração da escola: Gerenciamento de alunos");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        textField = new JTextField(20);
        setAccessibility(textField, "Nome:");

        listModel = new DefaultListModel<String>();
        list = new JList<>(listModel);
        setAccessibility(list, "Lojas:");

        ArrayList<Loja> lojas = gerenciador.getLojas();
        for(int i = 0; i < lojas.size(); ++i) {
            listModel.addElement(lojas.get(i).getNome()+": " + lojas.get(i).getEndereco());
        }

        addButton = new JButton("Adicionar loja");
        editButton = new JButton("Editar loja");
        removeButton = new JButton("Remover loja");

        // Painel para o campo de texto e botão
        panel = new JPanel();
        panel.add(list);
        panel.add(textField);
        panel.add(addButton);
        panel.add(editButton);
        panel.add(removeButton);
        add(panel, BorderLayout.NORTH);


        // Adicionando funcionalidade ao botão
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                if (!text.isEmpty()) {
                    listModel.addElement(text);
                    textField.setText("");
                }
            }
        });
    }
}