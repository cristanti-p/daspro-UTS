import java.util.Scanner;

public class StokBarang15 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);

        String namaBarang;
        int jumlahStok, permintaan, jumlahBarang, hargaBarang;
        
        System.out.println("   Program Stok Barang Toko   ");

        while (true) {
            System.out.print("Masukkan nama barang (ketik 'selesai' untuk berhenti): ");
            namaBarang = util.nextLine();
            
            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            } else {
                System.out.print("Masukkan jumlah Stok: ");
                jumlahStok = util.nextInt();

                System.out.print("Masukkan harga barang per unit: ");
                hargaBarang  = util.nextInt();

                int totalNilaiStok = jumlahStok * hargaBarang;
                System.out.println("Total Nilai Stok: " + totalNilaiStok);

                System.out.print("Masukkan jumlah permintaan: ");
                permintaan = util.nextInt();

                if (permintaan <= jumlahStok) {
                    jumlahStok -= permintaan;
                    System.out.println("Permintaan dapat dipenuhi. Stok tersisa: ");
                } else {
                    System.out.println("Stok tidak mencukupi.");
                }
                util.nextLine();
            }
        }
        System.out.println("   Program Selesai   ");
    }
}
