import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Image;

public class AppDemoHerencia implements IUComputadora, IUSmartphone, IUTelevision {
    private Computadora pc;
    private Television tv;
    private Smartphone cel;
    private Pantalla pantalla;
    private ArrayList<ComponenteElectronico> componente = new ArrayList<>();

    public AppDemoHerencia() {
        pantalla = new Pantalla("TVLG", "LG", "250series", "Lithium", 30000, componente);
        pc = new Computadora("Ryzen 3", "AMD", "5000series", "Ryzen", 2500, componente);
        tv = new Television(pantalla);
        cel = new Smartphone("Razor Mobile", "Razor", "300series", "Razor", 3000, componente);
    }

    public void crearInterfaz() {
        JFrame frame = new JFrame("Interfaz de Usuario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        // Crea un botón con una imagen (Asegúrate de tener la ruta correcta)
        JButton button = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        
        // Configura el tamaño de los botones
        int buttonSize = 70;
        button.setBounds(0, 0, buttonSize, buttonSize);
        button2.setBounds(80, 0, buttonSize, buttonSize);    
        button3.setBounds(160, 0, buttonSize, buttonSize);
        
        ImageIcon clic1 = new ImageIcon("Images/tele.jpg");
        ImageIcon clic2 = new ImageIcon("Images/pc.png");
        ImageIcon clic3 = new ImageIcon("Images/celular.jpg");
        
        button.setIcon(new ImageIcon(clic2.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH)));
        button2.setIcon(new ImageIcon(clic1.getImage().getScaledInstance(button2.getWidth(), button2.getHeight(), Image.SCALE_SMOOTH)));
        button3.setIcon(new ImageIcon(clic3.getImage().getScaledInstance(button3.getWidth(), button3.getHeight(), Image.SCALE_SMOOTH)));
        // Agrega el ActionListener a cada botón
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Maneja el evento de clic
                onClickComputadora();
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Maneja el evento de clic
                onClickTelevision();
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Maneja el evento de clic
                onClickSmartphone();
            }
        });

        // Agrega los botones al panel
        panel.add(button);
        panel.add(button2);
        panel.add(button3);

        // Agrega el panel al content pane del frame
        frame.getContentPane().add(panel);

        // Configura el tamaño del frame
        frame.setSize(800, 800);

        // Hace visible el frame
        frame.setVisible(true);
    }

    // Implementa el método de la interfaz IUComputadora
    @Override
    public void onClickComputadora() {
        // Muestra la información del sensor al hacer clic en una computadora
        System.out.println(pc.toString());
    }

    // Implementa el método de la interfaz IUSmartphone
    @Override
    public void onClickSmartphone() {
        // Muestra la información del sensor al hacer clic en un smartphone
        System.out.println(cel.toString());
    }

    // Implementa el método de la interfaz IUTelevision
    @Override
    public void onClickTelevision() {
        // Muestra la información del sensor al hacer clic en una televisión
        System.out.println(tv.toString());
    }

    public static void main(String[] args) {
        AppDemoHerencia interfaz = new AppDemoHerencia();
        interfaz.crearInterfaz();
    }
}