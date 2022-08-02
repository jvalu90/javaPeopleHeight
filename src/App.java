import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
          
        Scanner inputs = new Scanner(System.in).useLocale(Locale.US);
        int i, N, countPlus = 0, countLess = 0;
        float average = 0, sum = 0;

        try {
        
            do {

                System.out.print("Please type the number of people: ");
                N = inputs.nextInt();
            
            } while (N <= 0);

            float[] heights = new float[N];

            System.out.println("Reading the height of each person");

            for (i = 0; i < N; i++) {
                System.out.print("Please indicate the height of person number " + (i+1) + ": " );
                heights[i] = inputs.nextFloat();
                sum += heights[i];
            }

            System.out.println("People heights have been loaded");

            average = sum / N;

            for (i = 0; i < N; i++) {
                if (heights[i] >= average) {
                    countPlus++;
                } else {
                    countLess++;
                }
            }

            System.out.println("Average height: " + average);
            System.out.println("People above average height: " + countPlus);
            System.out.println("People with less than average height: " + countLess);

        } catch (Exception ex) {
            System.out.println("An error has ocurred" + ex.getMessage());
        } finally {
            inputs.close();
        }


    }
}
