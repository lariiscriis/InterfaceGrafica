package br.edu.fatecpg.gui.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.edu.fatecpg.gui.model.Cliente;

public class CadastroForm extends JFrame {
    private JPanel contentPane;
    private JTextField nomeField;
    private JSpinner idadeSpinner;
    private ButtonGroup grupoSexo;
    private JRadioButton masculinoRadio;
    private JRadioButton femininoRadio;
    private JButton enviarDadosButton;
    private JLabel lblResultado;

    public CadastroForm() {
        setTitle("Formulário de Cadastro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 200);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(6, 2, 5, 5));
        setContentPane(contentPane);

        JLabel lblNome = new JLabel("Nome:");
        nomeField = new JTextField();
        contentPane.add(lblNome);
        contentPane.add(nomeField);

        JLabel lblIdade = new JLabel("Idade:");
        idadeSpinner = new JSpinner(new SpinnerNumberModel(18, 0, 100, 1)); 
        contentPane.add(lblIdade);
        contentPane.add(idadeSpinner);

        JLabel lblSexo = new JLabel("Sexo:");
        contentPane.add(lblSexo);

        masculinoRadio = new JRadioButton("Masculino");
        femininoRadio = new JRadioButton("Feminino");
        grupoSexo = new ButtonGroup();
        grupoSexo.add(masculinoRadio);
        grupoSexo.add(femininoRadio);

        JPanel panelSexo = new JPanel();
        panelSexo.add(masculinoRadio);
        panelSexo.add(femininoRadio);
        contentPane.add(panelSexo);

        enviarDadosButton = new JButton("Enviar");
        contentPane.add(enviarDadosButton);

        lblResultado = new JLabel("");
        contentPane.add(new JLabel()); 
        contentPane.add(lblResultado);

        enviarDadosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enviarDados();
            }
        });
    }

    private void enviarDados() {
        String nome = nomeField.getText();
        int idade = (int) idadeSpinner.getValue();
        String sexo = null;

        if (masculinoRadio.isSelected()) {
            sexo = "Masculino";
        } else if (femininoRadio.isSelected()) {
            sexo = "Feminino";
        }

        if (nome.isEmpty() || sexo == null) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
        } else {
            Cliente cliente = new Cliente(nome, idade, sexo);

            lblResultado.setText(cliente.informacoes());

         
        }
    }

    public static void main(String[] args) {
                CadastroForm frame = new CadastroForm();
                frame.setVisible(true);
            }
}
