/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 26/03/23
 * Time: 15:10
 * To change this template use File | Settings | File Templates.
 */
public class WhileLoop {
    public static void main(String[] args) {
        /*
        while loop hanya memerlukan kondisi saja tanpa harus menginisiasi init statement dan post statement
        bisa dibilang while adalah penyederhanaan dari for loop
        */

        int a = 1;
        int b = 10;


        while(a < b){
            System.out.println("ini perulangan while ke " + a);
            a++;
        }
    }
}
