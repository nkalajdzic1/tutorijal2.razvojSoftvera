package sample;

import javafx.scene.control.*;

public class zadatak2 {
   
    public TextField inputText;
    public Label labela;
    public Button dugme;
    public TextArea tekst;

    private boolean sumaCifara(int broj) {
        int suma_cifara = 0;
        int pocetni_broj = broj;
        while( broj > 0){
            suma_cifara += broj%10;
            broj/=10;
        }
        return pocetni_broj % suma_cifara == 0;
    }
    public void ispisi() {
        String s = inputText.getText();
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("Greška");
        a.setHeaderText("Napravili ste pogrešan unos.");

        if( s.length() == 0 ) {
            a.setContentText("Niste ništa unijeli!");
            a.show();
            return; // samo je ovdje potreban return da ne bi se bacio izuzetak
        }

        double realan = Double.parseDouble(s) * 10;

        if ( realan < 0 ){
            a.setContentText("Unijeli ste negativan broj!");
            a.show();
        } else if( realan % 10 != 0 ){
            a.setContentText("Unijeli ste realan broj!");
            a.show();
        } else if ( realan == 0){
            a.setContentText("Unijeli ste nulu!");
            a.show();
        }
        else {
            int broj = Integer.parseInt(s);
            tekst.setText("Brojevi dijeljivi sa zbirom cifara su: " + '\n');
            int j = 0; // da broji brojeve koje treba ispisati tako da bi napravili ljepsi ispis
            for( int i = 1; i <= broj; i++){
                if( i == broj && sumaCifara(i)){
                    tekst.appendText( i + ".");  // moze i String.valueof(i)
                    j++;
                    break;
                }
                if(sumaCifara(i)) {
                    tekst.appendText( i + ", ");
                    j++;
                }
                if( j % 9 == 0 )  tekst.appendText("\n"); // mozemo i navodnike koristiti, svjedeno je jer je jedan char upitanju, tj \n
            }
                  // nisam jos neke unose razmotrio pored navedenih slucajeva :)
        }
    }

}