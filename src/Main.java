import java.util.Arrays;
import java.util.Scanner;

//Dize Uzunluğu: Kullanıcı tarafından girilen bir dizenin uzunluğunu bulup görüntülemek için bir Java programı yazın.
/*public class Main {
    public static void main(String[] args){
        Scanner get= new Scanner(System.in);

        System.out.print("Bir cümle giriniz: ");
        String dize= get.nextLine();

        int uzunluk = dize.length();

        System.out.println("Dizenin uzunluğu = "+ uzunluk);

    }
}*/

// Büyük ve Küçük harfe dönüşüm: Giriş olarak bir dize alan ve bu diziyi tamamen büyük harf ve tamamen küçük harf olarak görüntüleyen bir program oluşturun.

public class Main{
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Bir cümle giriniz: ");
        String dize = get.nextLine();

        String kucuk = dize.toLowerCase();
        String buyuk = dize.toUpperCase();

        System.out.println("Küçük harflerle: "+kucuk);
        System.out.println("Büyük harflerle: "+ buyuk);

    }
}