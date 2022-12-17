/*Esercizio 2
        Scriviamo un programma che determini il segno zodiacale (e lo stampi a video)
        in base all’inserimento di 4 numeri all’interno di variabili che rappresentano
        il giorno e il mese di inizio e il giorno e il mese di fine di ogni singolo segno.
        Es. per gemelli si avrebbe:
        giornoInizio = 21
        giornoFine=21
        meseInizio=5
        meseFine=6
        Per ogni segno zodiacale queste sono le fasce:
        Capricorno: 22 dicembre – 20 gennaio
        Aquario: 21 gennaio – 19 febbraio
        Pesci: 20 febbraio – 20 marzo
        Ariete: 21 marzo - 20 aprile
        Toro: 21 aprile - 20 maggio
        Gemelli: 21 maggio - 21 giugno
        Cancro: 22 giugno - 22 luglio
        Leone: 23 luglio - 23 agosto
        Vergine: 24 agosto - 22 settembre
        Bilancia: 23 settembre - 22 ottobre
        Scorpione: 23 ottobre – 22 novembre
        Sagittario: 23 novembre – 21 dicembre
*/
import java.util.Scanner;
public class Zodiacale {
    public static void main(String[] args) {
        Scanner datanasc = new Scanner(System.in);
        System.out.println("SEGNI ZODIACALI");
        System.out.println("Inserisci la data di nascita.");
        int[] Capricorno = {22, 12, 20, 1};
        int[] Aquario = {21, 1, 19, 2};
        int[] Pesci = {20, 2, 20, 3};
        int[] Ariete = {21, 3, 20, 4};
        int[] Toro = {21, 4, 20, 5};
        int[] Gemelli = {21, 5, 21, 6};
        int[] Cancro = {22, 6, 22, 7};
        int[] Leone = {23, 7, 23, 8};
        int[] Vergine = {24, 8, 22, 9};
        int[] Bilancia = {23, 9, 22, 10};
        int[] Scorpione = {23, 10, 22, 11};
        int[] Sagittario = {23, 11, 21, 12,};

        int[][] segnoA= {{22, 12, 20, 1}, {21, 1, 19, 2}, {20, 2, 20, 3}, {21, 3, 20, 4}, {21, 4, 20, 5}, {21, 5, 21, 6}, {22, 6, 22, 7}, {23, 7, 23, 8}, {24, 8, 22, 9}, {23, 9, 22, 10}, {23, 10, 22, 11}, {23, 11, 21, 12,}};
        String[] segnoLet= {"Capricorno", "Aquario", "Pesci", "Ariete", "Toro", "Gemelli", "Cancro", "Leone", "Vergine", "Bilancia", "Scorpione", "Sagittario"};

        System.out.print("Giorno: ");
        int giorno = datanasc.nextInt();
        System.out.print("Mese: ");
        int mese = datanasc.nextInt();
        String[] anno = {"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre" };
        System.out.println("Sei nato il " + giorno + " di " + anno[mese - 1]);
        System.out.println();

        System.out.println("Con Array di Array (Matrice):");
        for(int ciclo=0; ciclo<=12; ciclo++){
            if(giorno>=segnoA[ciclo][0] && mese==segnoA[ciclo][1] || giorno<=segnoA[ciclo][2] && mese==segnoA[ciclo][3]){
            System.out.println("Sei del segno " +segnoLet[ciclo]);
            break;
            }
        }
        System.out.println();

        System.out.println("Con Array:");
        if (giorno>= Capricorno[0] && mese==Capricorno[1] || giorno<= Capricorno[2] && mese==Capricorno[3]) {
            System.out.print("Il segno è Capricorno");
        } else if (giorno>= Aquario[0] && mese==Aquario[1] || giorno<= Aquario[2] && mese==Aquario[3]) {
            System.out.print("Il segno è Aquario");
        } else if (giorno>= Pesci[0] && mese==Pesci[1] || giorno<= Pesci[2] && mese==Pesci[3]) {
            System.out.print("Il segno è Pesci");
        } else if (giorno>= Ariete[0] && mese==Ariete[1] || giorno<= Ariete[2] && mese==Ariete[3]) {
            System.out.print("Il segno è Ariete");
        } else if (giorno>= Toro[0] && mese==Toro[1] || giorno<= Toro[2] && mese==Toro[3]) {
            System.out.print("Il segno è Toro");
        } else if (giorno>= Gemelli[0] && mese==Gemelli[1] || giorno<= Gemelli[2] && mese==Gemelli[3]) {
            System.out.print("Il segno è Gemelli");
        } else if (giorno>= Cancro[0] && mese==Cancro[1] || giorno<= Cancro[2] && mese==Cancro[3]) {
            System.out.print("Il segno è Cancro");
        } else if (giorno>= Leone[0] && mese==Leone[1] || giorno<= Leone[2] && mese==Leone[3]) {
            System.out.print("Il segno è Leone");
        } else if (giorno>= Vergine[0] && mese==Vergine[1] || giorno<= Vergine[2] && mese==Vergine[3]) {
            System.out.print("Il segno è Vergine");
        } else if (giorno>= Bilancia[0] && mese==Bilancia[1] || giorno<= Bilancia[2] && mese==Bilancia[3]) {
            System.out.print("Il segno è Bilancia");
        } else if (giorno>= Scorpione[0] && mese==Scorpione[1] || giorno<= Scorpione[2] && mese==Scorpione[3]) {
            System.out.print("Il segno è Scorpione");
        } else if (giorno>= Sagittario[0] && mese==Sagittario[1] || giorno<= Sagittario[2] && mese==Sagittario[3]) {
            System.out.print("Il segno è Sagittario");
        } else {
            System.out.println("Hai inserito una data non corretta");
        }
    }
}