package sol.estiversol;

import javax.swing.JOptionPane;

/**
 *
 * @author Joao Victor
 */
public class EstiverSol {

    public static void main(String[] args) {
       boolean Statusprevisao = Boolean.parseBoolean(JOptionPane.showInputDialog("Está Muito Sol?"));
  
       if(Statusprevisao == true) {
           System.out.println("Vou para a Praia");
       } 
       else
            System.out.println("Vou Assistir Televisão");
  }
}
