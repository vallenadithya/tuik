public class Segitiga {

    public static String nama;

    public static double hitungLuas(double alas, double tinggi){
        return alas * tinggi / 2;
    }

    public static double hitungLuas(double a, double b, double c){
        double S = (a + b + c) / 2;
        return Math.sqrt(S * (S - a) * (S - b) * (S - c));
    }
}
