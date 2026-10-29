import java.util.Scanner;
public class Tugas226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int jumlahKeseluruhan = 0;

        for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= n; j++) {
             System.out.printf("%4d", i * j);
             jumlahKeseluruhan = jumlahKeseluruhan + i * j;
            }

         System.out.println();
        }
        System.out.print("Jumlah seluruh angka: " +jumlahKeseluruhan);
            sc.close();
    }
}