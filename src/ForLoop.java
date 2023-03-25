import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 25/03/23
 * Time: 2:36
 * To change this template use File | Settings | File Templates.
 */
public class ForLoop {
    public static void main(String[] args) {
        /*
        for( init statement; kondisi; post statement){
            kode blok yg akan di eksekusi jika kondisi bernilai true
        }
        */


        for(int counter = 1; counter <= 10; counter++){
            System.out.println("ini perulangan ke " + counter);
        }
        /*
        output
        1
        22
        333
        4444
        55555
        666666
        7777777
        88888888
        999999999
        */
        int x, y;
        for( x = 1; x < 10; x++){
            System.out.println();

            for( y = 0; y < x; y++){
                System.out.print(x);
            }
        }

        System.out.println();

        /*
        output
        999999999
        88888888
        7777777
        666666
        55555
        4444
        333
        22
        1
        */
        int a, b;
        for(a = 9; 0 < a; a--){
            System.out.println();

            for(b = 0; b < a; b++){
                System.out.print(a);
            }
        }

        System.out.println();

        /*
        output
                 *
                **
               ***
              ****
             *****
            ******
           *******
          ********
         *********
        */

        int f, g, h;
        for(f = 10; 1 < f;){
            System.out.println();
            f--;

            for(g = 1; g < f;){
                System.out.print(" ");
                g++;
            }

            for(h = 10; h > f;){
                System.out.print('*');
                h--;
            }
        }

        System.out.println();

        /*
        output
        111111111
         22222222
          3333333
           444444
            55555
             6666
              777
               88
                9
        */
        int i, j, k;
        for(i = 1; i < 10; i++){
            System.out.println();

            for(j = 1; j < i; j++){
                System.out.print(" ");
            }

            for(k = 10; k > i; k--){
                System.out.print(i);
            }
        }
    }
}
