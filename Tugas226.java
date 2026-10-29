import java.util.Scanner;
public class Tugas226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= n; j++) {
             System.out.print(j + " ");
             System.out.print(" ");
             for (i = 1; i <= n; j += 2) {
                System.out.print(i + " ");
             }
            }
         System.out.println();
        }
            sc.close();
    }
}