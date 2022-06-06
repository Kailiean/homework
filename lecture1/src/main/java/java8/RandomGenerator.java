package java8;

import java.util.Random;


//TODO
//Write unit-tests for this class
//that check its functionality and especially that the class returns random values
public class RandomGenerator {

    private final Random random = new Random();

    public int generate(int max) {
        return random.nextInt(max);
    }

//    public int[] numbers(RandomGenerator ranGen) {
//        int randomArray[] = new int[1001];
//        int countArray[] = new int[10];
//        for (int i : randomArray) {
//            randomArray[i] = ranGen.generate(10);
//        }
//        for (int r : randomArray)
//            countArray[r]++;
//        return countArray;
//
//    }
}
