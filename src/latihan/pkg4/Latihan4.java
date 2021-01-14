//Package
package latihan.pkg4;
//Mengimport Scanner
import java.util.Scanner;

/**
 *
 * @author Yusuf Isra
 */
//Class
public class Latihan4 {
    //Method main
    public static void main(String[] args) {
        //Membuat scanner
        Scanner masukan = new Scanner (System.in);
        //Deklarasi variabel
        int bil, hasil;
        System.out.print("Masukkan suatu bilangan : ");
        //Menggunakan scanner
        bil = masukan.nextInt();
        hasil = faktorial(bil);
        System.out.println("Nilai faktorial "+ bil + " adalah "+hasil);
        
    }
    //Method #2
    private static int faktorial(int a){
        //Percabangan IF/ELSE
        if (a==1){
            //Return = untuk mengembalikan nilai milik fungsi
            return 1;
        }else{
            return (a*faktorial(a-1));
        }
    }
}
