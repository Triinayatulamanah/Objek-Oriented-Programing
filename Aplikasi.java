
package Praktek5;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Tri Inayatul Amanah
 */
public class Aplikasi {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Halo");
        frame.setSize(300, 200);
        
        frame.setLayout(new BorderLayout());
        
        JLabel lbNama = new JLabel();
        lbNama.setText("Tri Inayaytul Amanah"
                        +" 17090046"
                        +" 4D");
        frame.add(lbNama, BorderLayout.WEST);
        
       
        JButton btnSimpan = new JButton("Simpan");
        frame.add(btnSimpan, BorderLayout.EAST);
        
        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(3, 1));
        
        frame.add(lbNama);
       
        
        
        frame.setVisible(true);
    }
     
}
