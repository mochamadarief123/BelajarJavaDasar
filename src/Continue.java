/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 26/03/23
 * Time: 23:25
 * To change this template use File | Settings | File Templates.
 */
public class Continue {
    public static void main(String[] args) {
        /*
        kata kunci Continue berfungsi untuk menghentikan perulangan saat ini kemudian melanjutkan perulangan kembali
        */

        for(int x = 1; x <= 10; x++){
           if(x % 2 == 0){
              continue;
           }
            System.out.println(x);
        }
    }
}
