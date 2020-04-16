import java.util.Arrays;
import java.util.Scanner;

public class MainController {
    GetArr getArr;
    Scanner sc;



    public MainController() {
        getArr = new GetArrFromRandom();
        sc = new Scanner(System.in);
    }

    public void runProgram() {
        int mainChoice =  0;
        int exitValue =  9;
        printMainMenu();
        while (mainChoice!=exitValue) {
            mainChoice=sc.nextInt();
            switch (mainChoice) {
                case 1:changeSource();break;
                case 2:doTalAnalyse();break;
                default:mainChoice=9;
            }
        }
    }
    public void doTalAnalyse() {
        int[] numbers = getArr.createNumberArr(10,100);
        System.out.println(Arrays.toString(numbers));
        Talanalyse talanalyse = new Talanalyse();
        int antalTalOverAvg = talanalyse.getNumbersAboveAvg(numbers);
        System.out.println("Antal: "+antalTalOverAvg);
        printMainMenu();
    }

    public void changeSource() {
        int choice = 0;
        printSourceMenu();
        choice = sc.nextInt();
        switch (choice) {
            case 1: getArr = new GetArrFromRandom();break;
            case 2: getArr = new GetArrFromFile();break;
            case 3: getArr = new GetArrFromUser();break;
            default:
                System.out.println("Nothing chosen");
        }
        printMainMenu();
    }
    public void  printMainMenu() {
        System.out.println("Tast et tal for valg af action: ");
        System.out.println("1) vælg kilde til tal");
        System.out.println("2) udfør talanalyse");
        System.out.println("3) exit");
    }

    public void  printSourceMenu() {
        System.out.println("Tast et tal for valg af kilde: ");
        System.out.println("1) random");
        System.out.println("2) file");
        System.out.println("3) user");
    }
}