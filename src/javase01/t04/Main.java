package javase01.t04;

public class Main {
    public static void main(String[] args) {
        double[] doubleArray = new double[args.length];

        for(int i=0; i<args.length; i++)
        {
            doubleArray[i] = Double.parseDouble(args[i]);
        }
        maxSum(doubleArray);
    }

    private static void maxSum(double[] array) {

        int arrLength = array.length - 1;
        double max = array[0] + array[arrLength];

        for(int i = 0; i < array.length / 2; i++) {
            double mbMax = array[i] + array[arrLength - i];
            if (mbMax > max) {
                max = array[i] + array[arrLength - i];
            }
        }

        System.out.println("max = " + max);
    }
}
