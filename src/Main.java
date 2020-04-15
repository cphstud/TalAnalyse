import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    /*
    Skriv et program (en klasse), der kan finde antal tal over gennemsnittet af alle tal.

Du skal således:
Indlæse et antal tal (fx fra tastatur, fil, eller tilfældigt genereret) i et array. Antal tal skal være fleksibelt.
Finde gennemsnittet af tallene.
Finde antallet af tal, som er højere end gennemsnittet.
     */
    public static void main(String[] args) {
        //int[] numbers = {1,3,5,32,1,7};

        GetArr getArr = new GetArr();
        int[] numbers = getArr.createNumberArr(10,100);
        System.out.println(Arrays.toString(numbers));
        Talanalyse talanalyse = new Talanalyse();
        int antalTalOverAvg = talanalyse.getNumbersAboveAvg(numbers);
        System.out.println("Antal: "+antalTalOverAvg);
    }
}
