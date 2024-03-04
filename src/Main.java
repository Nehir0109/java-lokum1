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

/*public class Main{
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
}*/


//Dize Karşılaştırma: İki kullanıcı tarafından girilen diziyi karşılaştıran bir program oluşturun.
// Eğer diziler aynı ise "Diziler aynıdır" mesajını verin, aksi takdirde "Diziler farklıdır" mesajını görüntüleyin.

/*public class Main{
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Birinci dizeyi giriniz: ");
        String input1 = get.nextLine();
        System.out.print("İkinci dizeyi giriniz: ");
        String input2 = get.nextLine();

        String[] dize1 = input1.split(" ");
        String[] dize2 = input2.split(" ");

        if(dize1 == dize2){
            System.out.println("Dizeler aynıdır.");
        }else{
            System.out.println("Dizeler aynı değildir");
        }

    }

    private static boolean equalTest (String[] dizi1, String[] dizi2){

        Arrays.sort(dizi1);
        Arrays.sort(dizi2);

        return Arrays.equals(dizi1, dizi2);
    }
}*/


//Dize Birleştirme: Kullanıcı tarafından girilen iki diziyi birleştiren ve sonucu görüntüleyen bir Java programı yazın.

public class Main{
    public static void main(String[] args) {
        Scanner get= new Scanner(System.in);

        System.out.print("Birinici diziyi giriniz: ");
        String dize1= get.nextLine();
        System.out.print("İkinci diziyi giriniz: ");
        String dize2 = get.nextLine();

        String birlesikDize = birlestir(dize1,dize2);

        System.out.println("Birleşik dizi: "+ birlesikDize);
    }
    private static String birlestir(String dizi1, String dizi2) {

        return dizi1 + " " + dizi2;
    }
}