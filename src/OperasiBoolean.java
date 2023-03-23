/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 24/03/23
 * Time: 5:37
 * To change this template use File | Settings | File Templates.
 */
public class OperasiBoolean {
    public static void main(String[] args) {
        // operasi              keterangan
        //  &&                  nilai true jika value keduanya true, selain itu false
        //  ||                  nilai false jika value keduanya false, selain itu true
        //  !                   kebalikan dari nilai value

        int nilai = 75;
        int nilaiAbsen = 75;

        boolean nilaiAkhir = nilai >= 75 && nilaiAbsen >= 75;
        System.out.println(nilaiAkhir);
    }

}
