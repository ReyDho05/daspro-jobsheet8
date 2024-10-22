import java.util.Scanner;
public class RataNilai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1, nilaimhs,total;
        double rata;
        while (i<=5) {
            total = 0;
            System.out.println("Input Nilai Mahasiswa ke-"+i);
            for (int j=1;j<=5;j++){
                System.out.print("Nilai ke-" +j+ " = ");
                nilaimhs=sc.nextInt();
                total+=nilaimhs;
            }  
            rata=total/5;
            System.out.println("Rata-rata Nilai Mahasiswa ke-"+i+" adalah "+ rata);
            i++;
        }
    }  
}