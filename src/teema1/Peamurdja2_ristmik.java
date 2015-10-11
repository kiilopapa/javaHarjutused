package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.PAREM, primaryStage);
        Foor foor4 = new Foor(Foor.VASAK, primaryStage);

        tsykkel(foor1, 0);
        tsykkel(foor2, 0);
        tsykkel(foor3, 1);
        tsykkel(foor4, 1);



/*      vertikaal(foor1, foor2);
        horisontaal(foor3, foor4);
*/
    }

    public void tsykkel(Foor foor, int suund){
        int count = suund;
        while (count < 10){
            if (count != 0){
                foor.vahetaPunast();
                foor.paus(6);
                foor.vahetaKollast();
                foor.paus(0.6);
                foor.vahetaPunast();
                foor.vahetaKollast();
            }
            foor.vahetaRohelist();
            foor.paus(2);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaKollast();
            foor.paus(0.5);
            foor.vahetaKollast();

                count +=1;





        }

    }







/*
    public void vertikaal (Foor foor1, Foor foor2){
        foor1.vahetaRohelist();
        foor2.vahetaRohelist();
        rohelisestPunaseks(foor1);
        rohelisestPunaseks(foor2);
        punasestRoheliseks(foor1);
        punasestRoheliseks(foor2);
    }

    public void horisontaal (Foor foor3, Foor foor4) {
        foor3.vahetaPunast();
        foor4.vahetaPunast();
        punasestRoheliseks(foor3);
        punasestRoheliseks(foor4);
        rohelisestPunaseks(foor3);
        rohelisestPunaseks(foor4);

    }

    public void rohelisestPunaseks(Foor foor){
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.vahetaPunast();
        foor.paus(3);



    }

    public void punasestRoheliseks(Foor foor){
        foor.vahetaKollast();
        foor.paus(1);
        foor.vahetaPunast();
        foor.vahetaKollast();
        foor.vahetaRohelist();


    }
*/
}


