public class SoalUAS4 {
    public static void main(String args[]) {
        int n = 5;
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 2 * (n - i); j >= 0; j--) {
                // Mambuat Jarak dari kiri sesuai
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                // Mencetak Bintang
                System.out.print(j + " ");
                // j += 1;
            }
            // Membuat baris baru
            System.out.println();
        }
    }
}