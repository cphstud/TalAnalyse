import java.io.*;

public class GetArrFromFile implements GetArr {

    @Override
    public int[] createNumberArr(int size, int seed) {
        int[] myInts = new int[size];
        String line = getFromFile();
        String lineArr[] = line.split(";");
        if (lineArr.length < size) {
            System.out.println("Rrr");
            // TODO: kast en custom exception
        } else {
            myInts = doParse(lineArr,size);
        }
        return myInts;
    }
    private  int[] doParse(String[] inputArr, int size) {
        int[] retValArr = new int[size];
        for(int i = 0; i<size;i++) {
            try {
                retValArr[i] = Integer.parseInt(inputArr[i]);
            } catch (IllegalArgumentException ie) {
                System.out.println("Problem med " + inputArr[i]);
            }
        }
        return retValArr;
    }

    private String getFromFile() {
        String retVal = "";
        File fh = new File("Data/numbers.csv");
        try {
            FileReader fin = new FileReader(fh);
            try {
                BufferedReader br = new BufferedReader(fin);
                retVal = br.readLine();
                fin.close();
            } catch (IOException ie) {
                System.out.println(ie.getMessage());
            }
        } catch (FileNotFoundException fe) {
            System.out.println("Error: " + fe.getMessage());
        }
        return  retVal;
    }
}
