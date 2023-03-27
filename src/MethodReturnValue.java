/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 27/03/23
 * Time: 15:24
 * To change this template use File | Settings | File Templates.
 */
public class MethodReturnValue {
    public static void main(String[] args) {

        System.out.println(sum(10,50));
        System.out.println(sum(80,10));

        System.out.println(hitung(20, " + ", 30));
        System.out.println(hitung(20, " - ", 30));
        System.out.println(hitung(20, " * ", 30));
        System.out.println(hitung(30, " / ", 30));
        System.out.println(hitung(20, " operasi salah ", 30));
    }

    /*
    * didalam method juga dapat mengembalikan value, caranya cukup ubah kata kunci void dengan tipe data yg sesuai dgn value yg akan di return kan
    * dan gunakan keyword return. keyword return ini bisa digunakan beberapa kali dalam method*/

    //misal
    static int sum(int nilai1, int nilai2){
        int total = nilai1 + nilai2;
        return total;
    }

    //misal method dengan beberapa return
    static int hitung(int nilai1, String operasi, int nilai2){

        if (operasi.equals(" + ")) {
            return nilai1 + nilai2;
        } else if (operasi.equals(" - ")) {
            return nilai1 - nilai2;
        } else if (operasi.equals(" * ")) {
            return nilai1 * nilai2;
        } else if (operasi.equals(" / ")) {
            return nilai1 / nilai2;
        } else {
            return 0;
        }
    }
}
