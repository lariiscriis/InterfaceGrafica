package br.edu.fatecpg.gui.view;
import javax.swing.*;

import br.edu.fatecpg.gui.model.PreferenciasUsuario;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Usuario extends JFrame{
    private JPanel contentPane;
    private JComboBox<String> temaComboBox;
    private JCheckBox notificacoesCheckBox;
    private JSlider volumeSlider;
    private JButton salvarButton;
    private JLabel lblResultado;
    private JLabel lblTema;
    private JLabel lblNotificacoes;
    private JLabel lblVolume;
    private JLabel lblpreferencias;


    public Usuario() {
       setTitle("Configurações de Preferências");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(500, 400);
       setLocationRelativeTo(null);

       contentPane = new JPanel();
       contentPane.setLayout(new GridLayout(6, 2, 5, 5));
       setContentPane(contentPane);

       JLabel lblTema = new JLabel("Tema:");
       temaComboBox = new JComboBox<>(new String[]{"Claro", "Escuro"});
       contentPane.add(lblTema);
       contentPane.add(temaComboBox);

       JLabel lblNotificacoes = new JLabel("Notificações:");
       notificacoesCheckBox = new JCheckBox("Habilitar Notificações");
       contentPane.add(lblNotificacoes);
       contentPane.add(notificacoesCheckBox);

       JLabel lblVolume = new JLabel("Volume:");
       volumeSlider = new JSlider(0, 100, 50);
       volumeSlider.setMajorTickSpacing(10);
       volumeSlider.setPaintTicks(true);
       volumeSlider.setPaintLabels(true);
       contentPane.add(lblVolume);
       contentPane.add(volumeSlider);

       salvarButton = new JButton("Salvar Preferências");
       contentPane.add(new JLabel()); 
       contentPane.add(salvarButton);

       JLabel lblpreferencias = new JLabel("Preferências: ");
       contentPane.add(lblpreferencias);

       salvarButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               salvarPreferencias();
           }
       });
   }

     private void salvarPreferencias() {
       String tema = (String) temaComboBox.getSelectedItem();
       boolean notificacoesAtivas = notificacoesCheckBox.isSelected();
       int volume = volumeSlider.getValue();

 

        lblResultado = new JLabel("");
        contentPane.add(new JLabel()); 
        contentPane.add(lblResultado);

       PreferenciasUsuario preferenciasusuario = new PreferenciasUsuario(tema, notificacoesAtivas, volume);

       lblResultado.setText(preferenciasusuario.preferencias());


       if (tema.equals("Escuro")) {
        contentPane.setBackground(new Color(45, 45, 45)); 
        lblNotificacoes.setForeground(Color.WHITE);
        lblTema.setForeground(Color.WHITE);
        lblVolume.setForeground(Color.WHITE);
        lblpreferencias.setForeground(Color.WHITE);   
        lblResultado.setForeground(Color.WHITE);
     } 
       else {
        contentPane.setBackground(new Color(255, 255, 255));  
        lblNotificacoes.setForeground(Color.BLACK);
        lblTema.setForeground(Color.BLACK);
        lblVolume.setForeground(Color.BLACK);
        lblpreferencias.setForeground(Color.BLACK); 
        lblResultado.setForeground(Color.BLACK);
   }
     }
    public static void main(String[] args) {

        Usuario frame = new Usuario();
        frame.setVisible(true);

    
    }
    
    
}

