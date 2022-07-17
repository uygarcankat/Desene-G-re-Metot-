import java.util.Scanner;


public class Desen {

        static void negatif_sifir (int n,int i) {

            if (n <= 0) {

                System.out.println("Çıktısı :" + n);

                toplam(n+5,i);
            }
        }


    static void Cıkarım (int n,int i) {

            if(0<n) {

                System.out.println("Çıktısı : " + n);
                 Cıkarım(n-5,i);
             }

            negatif_sifir(n, i);
        }

    static void toplam(int n,int i) {

        if (0 < n && n <= i) {

            System.out.println("Çıktısı : " + n);
            toplam(n + 5, i);
        }
    }

        public static void main (String[]args){
            Scanner input = new Scanner(System.in);
            int n;
            System.out.println("lütfen bir sayı giriniz");
            n = input.nextInt();

            int i = n;

            Cıkarım(n, i);

        }
    }

