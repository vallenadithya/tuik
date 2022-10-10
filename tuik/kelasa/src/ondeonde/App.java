package ondeonde;

import java.util.Scanner;

public class App { //Driver Class

    public static void main(String[] args) throws Exception {

        int n = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan Bilangan : ");
        n = input.nextInt(); //exp : 12

        if(n < 0){
            System.out.println("Invalid Input");
        }else{
            int jumlah = 0;
            for(int i = 1; i <= n; i++){
                jumlah = jumlah + i;
            }
            int jumlahKuadrat = jumlah * jumlah;
            
            int kuadratJumlah = 0;
            for(int i = 1; i <= n; i++){
                int kuadrat = i * i;                        // 1: kuadrat = 1
                kuadratJumlah = kuadratJumlah + kuadrat;    // 1: kuadratJumlah = 0 + 1;
            }                                               // 2: kuadrat = 4
                                                            // 2: kuadratJumlah = 1 + 4; 

            int selisih = Math.abs(kuadratJumlah - jumlahKuadrat);

            System.out.println("Selisih : " + selisih);
        }
    
    }
}
