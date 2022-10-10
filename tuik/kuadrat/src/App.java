import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inputkan bilangan ! ");
        int bil = scanner.nextInt();

        // Hitung kuadrat jumlah
        int kuadratJumlah = 0;
        for(int i = 1; i <= bil; i++){
            int hasil = i * i;
            kuadratJumlah = kuadratJumlah + hasil;
        }
        System.out.println(kuadratJumlah);

        // Hitung jumlah kudrat
        int jumlahKuadrat = 0;
        int jumlah = 0;
        for(int i = 1; i <= bil; i++){
            jumlah = jumlah + i;
        }
        jumlahKuadrat = jumlah * jumlah;

        int selisih = Math.abs(jumlahKuadrat - kuadratJumlah);

        System.out.println(selisih);


    }
}
