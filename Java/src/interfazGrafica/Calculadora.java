package interfazGrafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {

    private JTextField campoNumero1;
    private JTextField campoNumero2;
    private JLabel etiquetaResultado;

    public CalculadoraSencilla() {
        // Configuración de la ventana
        setTitle("Calculadora Sencilla");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar ventana

        // Panel principal con layout
        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));

        // Componentes
        panel.add(new JLabel("Número 1:"));
        campoNumero1 = new JTextField();
        panel.add(campoNumero1);

        panel.add(new JLabel("Número 2:"));
        campoNumero2 = new JTextField();
        panel.add(campoNumero2);

        JButton botonSumar = new JButton("Sumar");
        panel.add(botonSumar);

        etiquetaResultado = new JLabel("Resultado: ");
        panel.add(etiquetaResultado);

        // Acción del botón
        botonSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(campoNumero1.getText());
                    double num2 = Double.parseDouble(campoNumero2.getText());
                    double suma = num1 + num2;
                    etiquetaResultado.setText("Resultado: " + suma);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                        CalculadoraSencilla.this,
                        "Por favor, ingresa números válidos.",
                        "Error de entrada",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });

        // Agregar panel a la ventana
        add(panel);
    }

    public static void main(String[] args) {
        // Ejecutar en el hilo de eventos de Swing
        SwingUtilities.invokeLater(() -> {
            new CalculadoraSencilla().setVisible(true);
        });
    }
}
