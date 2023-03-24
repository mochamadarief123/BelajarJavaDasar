/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 24/03/23
 * Time: 13:50
 * To change this template use File | Settings | File Templates.
 */
public class TernaryOperator {
    public static void main(String[] args) {
        //ternary operator digunakan untuk mempersingkat penggunaan if else statement

        //tanpa ternary operator
        int nilai = 50;
        String ucapan;

        if(nilai >= 70){
            ucapan = "Selamat anda lulus";
        }else{
            ucapan = "Silahkan mencoba kembali";
        }
        System.out.println(ucapan);

        //dengan ternary operator
        int nilai2 =71;
        String ucapan2 = nilai2 >= 70 ? "Selamat anda lulus" : "Silahkan mencoba kembali";

        System.out.println(ucapan2);

        int nAbsen = 80;
        int nMatkul = 80;
        String message = nAbsen >= 75 && nMatkul >= 75 ? "Selamat anda lulus bro" : "Silahkan mencoba kembali bro";

        System.out.println(message);
    }
}
