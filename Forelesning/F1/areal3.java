
import static javax.swing.JOptionPane.*;

 class Arealberegning1 {

    public static void main(String[] args) {
        String lengdeLest = showInputDialog("Lengde(meter): ");
        String breddeLest = showInputDialog("Bredde(meter): ");
        int lengde = Integer.parseInt(lengdeLest);
        int bredde = Integer.parseInt(breddeLest);
        int arealet = lengde * bredde;
        showMessageDialog(null, "Arealet av rektangelt er" + arealet + "m2.");
    }
}
