import java.util.Arrays;
import java.util.Scanner;

//Dize Uzunluğu: Kullanıcı tarafından girilen bir dizenin uzunluğunu bulup görüntülemek için bir Java programı yazın.
public class Main {
    public static void main(String[] args){
        Scanner get= new Scanner(System.in);

        System.out.print("Bir dize giriniz: ");
        String dize= get.nextLine();

        int uzunluk = dize.length();

        System.out.println("Dizenin uzunluğu = "+ uzunluk);

    }
}