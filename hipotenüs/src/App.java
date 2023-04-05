import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int d1,d2;
        double h,u,alan;
        Scanner inp=new Scanner(System.in);

        System.out.println("Dik kenarları giriniz");
        d1=inp.nextInt();
        d2=inp.nextInt();

        h=Math.sqrt((d1*d1)+(d2*d2));
        System.out.println("Hipotenüsün uzunluğu="+h);

        u=(d1+d2+h)/2;
        alan=Math.sqrt(u * (u - d1)* (u - d2) * (u - h));

        System.out.println("Üçgenin çevresi="+2*u);
        System.out.println("Üçgenin alanı="+alan);

    }
}
