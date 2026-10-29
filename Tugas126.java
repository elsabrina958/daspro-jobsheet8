import java.util.Scanner;
public class Tugas126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int totalAngka = 0;
        int i = 1;

        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
            i++;
            System.out.println();
        }
        totalAngka = i * n / 2;
        System.out.print("total angka tercetak: " + totalAngka);
        sc.close();
    }
}