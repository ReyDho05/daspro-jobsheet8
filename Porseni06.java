import java.util.Scanner;
public class Porseni06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahPoliteknik, jumlahAtlet = 5;
        String hasil = "";  
        System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
        jumlahPoliteknik = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= jumlahPoliteknik; i++) {
            System.out.println("\nPoliteknik ke-" + i);
            hasil += "\nPoliteknik ke-" + i + ":\n";

            for (int cabor = 1; cabor <= 4; cabor++) {
                String namaCabor = "";
                switch (cabor) {
                    case 1:
                        namaCabor = "Badminton";
                        break;
                    case 2:
                        namaCabor = "Tenis Meja";
                        break;
                    case 3:
                        namaCabor = "Basket";
                        break;
                    case 4:
                        namaCabor = "Bola Voli";
                        break;
                }
                hasil += "Cabang olahraga: " + namaCabor + "\n";
                for (int j = 1; j <= jumlahAtlet; j++) {
                    System.out.print("Masukkan nama atlet ke-" + j + " untuk " + namaCabor + ": ");
                    String namaAtlet = sc.nextLine();
                    hasil += "  Atlet ke-" + j + ": " + namaAtlet + "\n";
                }
            }
        }
        System.out.println("\n--- Daftar Seluruh Atlet ---");
        System.out.println(hasil);
        sc.close();
    }
}

