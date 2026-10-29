import java.util.Scanner;
public class Tugas326 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String pelanggan;
        int totalBarang = 0;
        int jumlahToko = 0;
        int jumlahPelanggan;
        int jumlahBarang = 0;

        System.out.print("Masukkan jumlah toko: ");
        jumlahToko = sc.nextInt();

        while (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1. Masukkan ulang: ");
            jumlahToko = sc.nextInt();
        }

        int totalBarangSeluruhToko = 0;
        int maxBarang = -1;
        int tokoTerbanyak = -1;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("\n---- Toko ke-" + i + "----");
            System.out.print("Masukkan jumlah pelanggan: ");
            jumlahPelanggan = sc.nextInt();

        while (jumlahBarang < 0) {
            System.out.print("Jumlah barang tidak boleh negatif. Masukkan ulang: ");
            jumlahBarang = sc.nextInt();
        } 
        totalBarang = 0;
    
        if (totalBarang > maxBarang) {
            maxBarang = totalBarang;
            tokoTerbanyak = i;
        }
        totalBarang = 0;

        for (int j = 1; j <= jumlahPelanggan; j++) {
            System.out.print("Jumlah barang yang dibeli pelanggan ke- " + j + ": ");
            jumlahBarang = sc.nextInt();

        while (jumlahBarang < 0) {
            System.out.print("Jumlah barang tidak boleh negatif. Masukkan ulang: ");
            jumlahBarang = sc.nextInt();
        } 
        totalBarang += jumlahBarang;
    }
        System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarang);
        totalBarangSeluruhToko += totalBarang;

        if (totalBarang > maxBarang) {
            maxBarang = totalBarang;
            tokoTerbanyak = i;
        }
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}