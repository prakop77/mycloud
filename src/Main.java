import java.util.Random;

public class Main {
    public static void main(String[] args) {

        final int size = 12;
        Random random = new Random();
        int countNumb = 0;
        int count = 0;
        int[] numbs = new int[size];


        while (count < numbs.length) {
            int numb = (int) (Math.random() * 21) - 10;
            if (numb != 0) {
                numbs[count] = numb;
                count++;
            }
        }

        while (countNumb != 6) {
            for (int i = 0; i < numbs.length; i++) {
                numbs[i] = Math.abs(numbs[i]);
                if (!random.nextBoolean())
                    numbs[i] *= -1;
            }
            countNumb = 0;
            for (int numb : numbs) {
                if (numb > 0)
                    countNumb++;
            }
        }

        for (int numb : numbs)
            System.out.println(numb);


    }
}
