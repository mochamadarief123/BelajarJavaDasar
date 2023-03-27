/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 27/03/23
 * Time: 14:59
 * To change this template use File | Settings | File Templates.
 */
public class Method {
    public static void main(String[] args) {
        //cara memanggil method\
        sayHello();
        sayHello();
        sayHello();

    }

    /*
    method / function adalah blok kode program yg hanya di jalankan jika method itu di panggil
    cara membuat method dengan cara menuliskan keyword void
    method bisa digunakan berulang kali
    */

        //contoh
        static void sayHello(){
            System.out.println("Hallo World 1");
            System.out.println("Hallo World 2");
        }
}
