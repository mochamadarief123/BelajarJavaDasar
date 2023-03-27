/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 27/03/23
 * Time: 23:10
 * To change this template use File | Settings | File Templates.
 */
public class RecursiveMethod {
    public static void main(String[] args) {
        /*
        * recursive method adalah kemampuan untuk memanggil methodnya sendiri
        * jika penggunaan recursive / pemanggilan method sendiri nya terlalu banyak maka akan terjadi error stack overflow
        */


        System.out.println(factorialLoop(3));

        System.out.println(factrialRecursive(3));

        sayHello(10000);
    }

    //contoh kasus faktorial tanpa menggunakan recursive mmethod/ menggunakan for loop
    static int factorialLoop (int value){
        int result = 1;
        for (int counter = 1; counter <= value; counter++ ){
             result = result * counter;
        }
        return result;
    }

    //kasus faktorial menggunakan recursive method
    static int factrialRecursive (int value) {
        if(value == 1){
            return 1;
        } else {
            return value * factrialRecursive(value - 1);
        }
    }

    //kasus recursive yg stak overflow
    static void sayHello(int value){
        if( value == 0 ){
            System.out.println("Selesai");
        }else {
            System.out.println("Looping ke " + value);
            sayHello(value - 1);
        }
    }
}
