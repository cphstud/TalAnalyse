import java.util.Random;

public class GetArrFromRandom implements GetArr{
    private Random rd;

    public GetArrFromRandom() {
        rd = new Random();
    }

    public int[] createNumberArr(int size, int seed) {
        int[] retValArr = new int[size];
        for(int i = 0;i<size;i++) {
            retValArr[i] = rd.nextInt(seed);
        }
        return retValArr;
    }
}
