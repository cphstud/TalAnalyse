public class Talanalyse {
    int avg;
    public int getNumbersAboveAvg(int[] numbers) {
        int numAbAvg=0;
        double avg = computeAvg(numbers);
        for(int i = 0;i<numbers.length;i++) {
            if (numbers[i] > avg) {
                numAbAvg++;
            }
        }
        return numAbAvg;
    }

    private double computeAvg(int[] numbers) {
        double avg = 0;
        double sum = 0;
        for(int i = 0;i<numbers.length;i++) {
            sum = sum + numbers[i];
        }
        avg = sum/numbers.length;
        return avg;
    }

}
