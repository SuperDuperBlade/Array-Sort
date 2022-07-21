import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // the initiation
        Scanner scanner = new Scanner(System.in);

        System.out.println("how long would you like the array to be?");
        int pre[] = new int[scanner.nextInt()];

        //a loop that the user keeps putting the number until a invalid response is inputted

        for (int i = 0; i > -1; i++) {
            System.out.println("Enter a number");
            try {
                pre[i] = scanner.nextInt();
            } catch (Exception e) {
                break;
            }

        }

        int[] post = new int[pre.length];

        //asks the user if they would like form the most to the lest or least to the most
        System.out.println("Max or min");
        String output = scanner.next();

        // prints the array before the sort
        System.out.print("pre : ");
        for (int i = 0; i < pre.length; i++) {

            System.out.print(pre[i] + " , ");
        }
        System.out.println(" ");

     //checks if the user has wanted from highest to lowest or lowest to highest and then performs the algorithm
        switch (output.toLowerCase()) {

            case "min":
                for (int i = 0; i < pre.length; i++) {

                    post[i] = pre[getMin(pre)];
                    pre[getMin(pre)] = Integer.MAX_VALUE;

                }
                break;

            case "max":
                for (int i = 0; i < pre.length; i++) {

                    post[i] = pre[getMax(pre)];
                    pre[getMax(pre)] = Integer.MIN_VALUE;

                }
                break;

            default:
                System.out.println("Invalid response");
                System.exit(-1);
        }

        System.out.print("post : ");
        for (int i = 0; i < post.length; i++) {

            System.out.print(post[i] + " , ");
        }

    }
//sorting algorithm that gets the position of an array of the highest number
    public static int getMax(int[] array) {
        int temp = 0;
        int least = -2147483646;
        for (int i = 0; i < array.length; i++) {

            int h = array[i];

            if (h > least) {
                temp = i;
                least = h;
            }
        }

        return temp;


    }
    //sorting algorithm that gets the position of an array of the lowest number
    public static int getMin(int[] array) {
        int temp = 0;
        int least = 2147483646;
        for (int i = 0; i < array.length; i++) {

            int h = array[i];

            if (h < least) {
                temp = i;
                least = h;
            }
        }

        return temp;
    }
}