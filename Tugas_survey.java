import java.util.Scanner;
public class Tugas_survey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] survei = new int[10][6];
        System.out.println(" INPUT HASIL SURVEI ");
        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Pertanyaan ke-" + (j + 1) + ": ");
                survei[i][j] = input.nextInt(); 
            }
        }
        System.out.println(" RATA-RATA TIAP RESPONDEN ");
        for (int i = 0; i < survei.length; i++) {
            int totalResponden = 0;
            for (int j = 0; j < survei[i].length; j++) {
                totalResponden += survei[i][j];
            }
            double rataRataResponden = (double) totalResponden / survei[i].length;
            System.out.printf("Responden ke-%d: %.2f%n", (i + 1), rataRataResponden);
        }
        System.out.println(" RATA-RATA SETIAP PERTANYAAN ");
        for (int j = 0; j < survei[0].length; j++) {
            int totalPertanyaan = 0;
            for (int i = 0; i < survei.length; i++) {
                totalPertanyaan += survei[i][j];
            }
            double rataRataPertanyaan = (double) totalPertanyaan / survei.length;
            System.out.printf("Pertanyaan ke-%d: %.2f%n", (j + 1), rataRataPertanyaan);
        }
    }
}

