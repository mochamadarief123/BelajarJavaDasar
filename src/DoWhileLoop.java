/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 26/03/23
 * Time: 15:45
 * To change this template use File | Settings | File Templates.
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        /*
        do while loop akan dijalankan minimal satu kali walaupun kondisi nya false

        */

        int a = 1;
        do{
            System.out.println("ini perulangan do while ke " + a);
            a++;
        }while (a < 10);
    }
}
