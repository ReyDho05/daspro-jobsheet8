import java.util.Scanner;
public class SquareKosong06 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();
        // Validasi input N
        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
            return;
        }
        // Cetak persegi angka
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Cetak angka di tepi persegi
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print(N + " ");
                } else {
                    // Cetak spasi di dalam persegi
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}