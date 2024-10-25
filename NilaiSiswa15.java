import java.util.Scanner;

public class NilaiSiswa15 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);
         
        int jumlahSiswa = 0, totalNilai = 0, diAtasRataRata = 0;
        String namaSiswa;
        int nilai;

        System.out.println("    Program Manajemen Nilai Siswa    ");

        System.out.println("Masukkan Nama Anda dan Nilai Anda (Ketik 'selesai' untuk berhenti)");
        while (true) {
            System.out.print("Masukkan Nama Anda: ");
            namaSiswa = util.nextLine();

            if (namaSiswa.equalsIgnoreCase("selesai")) {
                break;
            }
            System.out.print("Masukkan Nilai Anda: ");
            nilai = util.nextInt();
            util.nextLine();

            jumlahSiswa++;
            totalNilai+=nilai;

            if (nilai > totalNilai/jumlahSiswa){
                diAtasRataRata++;
            }
        }
        double rataRata = totalNilai / jumlahSiswa;
        
        System.out.println("Rata-rata Nilai di kelas anda : "+rataRata);
        System.out.println("Jumlah Siswa yang di atas Rata-rata : "+jumlahSiswa);

        if (diAtasRataRata/ jumlahSiswa > 0.50) {
            System.out.println("Mayoritas Siswa memiliki Nilai di Atas Rata-rata");
        } else {
            System.out.println("Mayoritas Nilai Siswa di Bawah Rata-rata.");
        }
    }
}
