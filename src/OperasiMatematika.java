/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 23/03/23
 * Time: 15:29
 * To change this template use File | Settings | File Templates.
 */
public class OperasiMatematika {
    public static void main(String[] args) {
        //operator                  ket
        //    +                 penjumlahan
        //    -                 pengurangan
        //    *                 perkalian
        //    /                 perbagian
        //    %                 modulus/ sisa bagi

        Integer x = 40;
        Integer y = 10;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        //augmented assigment
        //operasi matematika                augmented assigment
        //  a = a + 10                           a += 10
        //  a = a - 10                           a -= 10
        //  a = a * 10                           a *= 10
        //  a = a / 10                           a /= 10
        //  a = a % 10                           a %= 10

        int a = 100;
        a += 10;
        System.out.println(a);

        a -= 10;
        System.out.println(a);

        a *= 10;
        System.out.println(a);

        //unary operator
        //operator                  ket
        //  ++                  a = a + 1
        //  --                  a = a - 1
        //  -                   negative
        //  +                   positive
        //  !                   boolean kebalikan

        int f = 10;
        f++;
        System.out.println(f);

        f--;
        System.out.println(f);

        boolean c = !true;
        System.out.println(c);



    }
}
