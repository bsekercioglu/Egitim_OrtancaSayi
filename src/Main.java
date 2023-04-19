public class Main {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, c;

        // Klavyeden üç farklı sayı giriliyor.
        System.out.print("a' yı giriniz : ");
        a = kb.nextInt();
        System.out.print("b' yi giriniz : ");
        b = kb.nextInt();
        System.out.print("c' yi giriniz : ");
        c = kb.nextInt();
/*
*       ŞARTLAR
*       a > b > c
*       a > c > b
*       b > a > c
*       b > c > a
*       c > a > b
*       c > b > a
*
* */
        if ( a > b)
            if ( b > c)
                System.out.println("Ortanca Sayı : "+b);

            else
            if ( a > c)
                if ( c > b)
                    System.out.println("Ortanca Sayı : "+c);

        if (b > a)
            if (a > c)
                System.out.println("Ortanca Sayı : "+a);

            else
            if (b > c)
                if (c > a)
                    System.out.println("Ortanca Sayı : "+c);

        if (c > a)
            if (a > b)
                System.out.println("Ortanca Sayı : "+a);

            else
            if (c > b)
                if (b > a)
                System.out.println("Ortanca Sayı : "+b);

    }
}