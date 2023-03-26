/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 26/03/23
 * Time: 23:05
 * To change this template use File | Settings | File Templates.
 */
public class Break {
    public static void main(String[] args) {
        /*
         kata kunci break berfungsi untuk menghentikan total perulangan bahkan disaat kondisi invinite loop sekalipun
        */

        //contoh penggunaan kata kunci break
        int x = 1;
        while(true){
            System.out.println("ini invinite loop yg akan berhenti total di perulangan ke " + x);

            break;
        }

        for(int y = 1; y <= 100; y++){
            System.out.println("ini perulagan ke "+ y);

            if(y >= 10){
                break;
            }
        }


        int z = 1;
        do{
            System.out.println("ini perulangan while yg ke " + z);
            z++;

            if(z > 5){
                break;
            }
        }while (z < 200);
    }
}
