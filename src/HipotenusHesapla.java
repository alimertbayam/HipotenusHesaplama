import java.util.Scanner;

public class HipotenusHesapla
{
    public static void main(String[] args)
    {
        double a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz. :");
        a = input.nextInt();

        System.out.print("2. Kenarı Giriniz. :");
        b = input.nextInt();

        c= Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c);

        double cevre = a+b+c;
        System.out.println("Üçgenin Çevresi :" + cevre);

        double u = cevre/2;
        double alan = u* (u-a)*(u-b)*(u-c);

        System.out.println("Çevre : " + cevre);
        System.out.println("Alan : " + alan);

    }
}
