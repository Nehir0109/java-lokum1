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

/*public class Main{
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Bir cümle giriniz: ");
        String dize = get.nextLine();

        String kucuk = dize.toLowerCase();
        String buyuk = dize.toUpperCase();

        System.out.println("Küçük harflerle: "+kucuk);
        System.out.println("Büyük harflerle: "+ buyuk);

    }
}*/

// Alt dize çıkarma: Kullanıcıdan bir dize alıp bu dizinin belirli bir alt dizesini çıkararak görüntüleyen bir java programı yazın.

public class Main{
    public static void main(String[] args){
        Scanner get= new Scanner(System.in);

        System.out.print("Bir dize giriniz: ");
        String dize = get.nextLine();

        System.out.print("Başlangıç indeksini girin: ");
        int start = get.nextInt();
        System.out.print("Bitiş indeksini girin: ");
        int end = get.nextInt();

        if(start >= 0 && end <= dize.length() && start <= end){
            String altDize = dize.substring(start, end);
            System.out.println("Çıkarılan Alt Dize: "+ altDize);
        } else{
            System.out.println("Hata! Geçersiz indeks aralığı!");
        }

    }
}

