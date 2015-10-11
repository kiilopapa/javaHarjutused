package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("kui suurt lauda vaja?");
    int lauaSuurus = sc.nextInt();
    int[] laud = new int[lauaSuurus];
    int[] mangijaLaud = new int[lauaSuurus];
    /*for (int i=0; i<lauaSuurus; i++){

    }*/
        for (int i=0 ; i < lauaSuurus; i++) {
            laud[i] = (int) (Math.random() * 2);
            System.out.print(laud[i]);

        }
 //       System.out.println(Arrays.toString(laud));

 //        while (!gameover(lauaSuurus)){
            System.out.println("\nÜtle number nullist ühest " + (lauaSuurus));
            int esimenePomm = sc.nextInt()-1;
            System.out.println(Arrays.toString(laud));

            if (laud[esimenePomm] == 1) {
                System.out.println(laud[esimenePomm]);
                System.out.println("Pihtas!!!");
                laud[esimenePomm] = 2;
            } else if (esimene ){
                System.out.println("Haha, möödas");
            }
    //             for (int i = 0; i < laud.length; i++){
    //             if (laud[i])
    //         }
        }

}
//    public static boolean gameover(int [])
}

