import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class login extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    login frame = new login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(385, 730);

        // Configuración del panel principal
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null); // Layout absoluto para posicionar manualmente
        contentPane.setBackground(Color.WHITE); // Fondo blanco
        setContentPane(contentPane);

        // Crear y personalizar botones redondeados con diferentes radios
        RoundedButton button1 = new RoundedButton("1", 20);
        button1.setBounds(25, 530, 120, 40);  // Tamaño aumentado
        button1.setBackground(new Color(240, 240, 240));
        contentPane.add(button1);

        RoundedButton button2 = new RoundedButton("2", 20);
        button2.setBounds(135, 530, 120, 40);  // Tamaño aumentado
        button2.setBackground(new Color(240, 240, 240));
        contentPane.add(button2);

        RoundedButton button3 = new RoundedButton("3", 20);
        button3.setBounds(245, 530, 120, 40);  // Tamaño aumentado
        button3.setBackground(new Color(240, 240, 240));
        contentPane.add(button3);

        RoundedButton button4 = new RoundedButton("4", 20);
        button4.setBounds(25, 570, 120, 40);  // Tamaño aumentado
        button4.setBackground(new Color(240, 240, 240));
        contentPane.add(button4);

        RoundedButton button5 = new RoundedButton("5", 20);
        button5.setBounds(135, 570, 120, 40);  // Tamaño aumentado
        button5.setBackground(new Color(240, 240, 240)); // Gris claro
        contentPane.add(button5);

        RoundedButton button6 = new RoundedButton("6", 20);
        button6.setBounds(245, 570, 120, 40);  // Tamaño aumentado
        button6.setBackground(new Color(240, 240, 240));
        contentPane.add(button6);

        RoundedButton button7 = new RoundedButton("7", 20);
        button7.setBounds(25, 610, 120, 40);  // Tamaño aumentado
        button7.setBackground(new Color(240, 240, 240));
        contentPane.add(button7);

        RoundedButton button8 = new RoundedButton("8", 20);
        button8.setBounds(135, 610, 120, 40);  // Tamaño aumentado
        button8.setBackground(new Color(240, 240, 240));
        contentPane.add(button8);

        RoundedButton button9 = new RoundedButton("9", 20);
        button9.setBounds(245, 610, 120, 40);  // Tamaño aumentado
        button9.setBackground(new Color(240, 240, 240));
        contentPane.add(button9);

        RoundedButton button10 = new RoundedButton("0", 20);
        button10.setBounds(135, 650, 120, 40);  // Tamaño aumentado
        button10.setBackground(new Color(240, 240, 240));
        contentPane.add(button10);

        RoundedButton button11 = new RoundedButton("", 20);
        button11.setBounds(25, 650, 120, 40);  // Tamaño aumentado
        button11.setBackground(Color.WHITE); // Blanco
        contentPane.add(button11);

        RoundedButton button12 = new RoundedButton("Borrar", 20);
        button12.setBounds(245, 650, 120, 40);  // Tamaño aumentado
        button12.setBackground(new Color(240, 240, 240));
        contentPane.add(button12);
    }

    // Clase personalizada para botones redondeados con radio individual
    class RoundedButton extends JButton {

        private static final long serialVersionUID = 1L;
        private int cornerRadius; // Radio de las esquinas

        public RoundedButton(String text, int cornerRadius) {
            super(text);
            this.cornerRadius = cornerRadius;
            setOpaque(false);
            setContentAreaFilled(false);
            setFocusPainted(false);
            setBorderPainted(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius); // Usar el radio personalizado
            super.paintComponent(g2);
            g2.dispose();
        }
    }
}
