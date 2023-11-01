package java101;
import java.util.Scanner;

public class GirisveDordunKati {
    public static void main(String[] args) {
        int n,toplam=0;
        Scanner inp = new Scanner(System.in);

        do{
            System.out.println("Sayı giriniz: ");
            n = inp.nextInt();
            if(n%4 == 0){
                toplam += n;
            }
        }while(n%2 != 1);
        System.out.println("Toplam deger: "+toplam);

    }
}
