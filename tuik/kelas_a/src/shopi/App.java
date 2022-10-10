package shopi;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan ! ");
        int bilangan = scanner.nextInt();
        
        // KOde ...
        boolean isPrima = true;
        for(int i = 2; i < bilangan; i++){
            if(bilangan % i == 0){
                isPrima = false;
                break;
            }
        }

        if(!isPrima){
            System.out.println(bilangan + " bukan bilangan prima");
        }else{
            System.out.println(bilangan + " adalah bilangan prima");
        }

        //End



    }
}
