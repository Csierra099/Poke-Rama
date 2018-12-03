package memorama;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class juego {
    JFrame Ventana;
    JPanel panelPre;
    JLabel fondoMenu;
    JLabel BotonJugar;
    
    
    //Constructor
    public juego(){
        
        //ventana
        Ventana = new JFrame("Poké-Rama");
        Ventana.setSize(584,245);//tamaño
        Ventana.setLayout(null);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//evita error al cerrar
        Ventana.setLocationRelativeTo(null);
        Ventana.setResizable(false);//mantener la ventana siempre minimizada
        
        //panel de la ventana
        panelPre = new JPanel();
        panelPre.setSize(Ventana.getWidth(),Ventana.getHeight());//tamaño
        panelPre.setLocation(0,0);//comienzo del panel
        panelPre.setLayout(null);
        panelPre.setVisible(true);
        
        
        
        //imagen de fondo del menú
        fondoMenu = new JLabel();
        fondoMenu.setSize(Ventana.getWidth(), Ventana.getHeight());
        fondoMenu.setLocation(0,0);
        fondoMenu.setIcon(new ImageIcon("images/menu.png"));
        fondoMenu.setVisible(true);
        panelPre.add(fondoMenu);
        Ventana.add(panelPre);//agregando el panel a la ventana
        
        Ventana.setVisible(true);
        
    }
    
}
