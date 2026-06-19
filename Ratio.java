import java.util.Scanner;

public class Ratio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); 

        int i = 0;
        while (i < m) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int gap = x + y;
            int ratio = (x * 100) / gap;

            System.out.println(gap + " seconds");
            System.out.println("Time Gap Ratio: " + ratio + "%");

            i++;
        }

        sc.close();
    }
}
