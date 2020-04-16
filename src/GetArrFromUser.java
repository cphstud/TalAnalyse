import java.util.Scanner;

public class GetArrFromUser implements GetArr, UI {
    Scanner ms = new Scanner(System.in);
    @Override
    public int[] createNumberArr(int size, int seed) {
        int[] retValArr = new int[size];
        int counter=0;
        printMessage("Indtast " + size + " heltal");
        while(counter < size) {
            retValArr[counter] = getInt();
            counter++;
        }
        printMessage("tak for det");
        return retValArr;
    }

    @Override
    public int getInt() {
        int retVal = 0;
        retVal = ms.nextInt();
        return retVal;
    }

    @Override
    public String getString() {
        String retVal = "";
        retVal = ms.nextLine();
        return retVal;
    }

    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }
}
