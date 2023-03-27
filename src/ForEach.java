/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 27/03/23
 * Time: 14:36
 * To change this template use File | Settings | File Templates.
 */
public class ForEach {
    public static void main(String[] args) {
        /*
        for each digunakan untuk perulangan array
        */

        String [] names = {
                "Hery", "Daniel", "Ayu", "Ara", "Pandji"
                };

        //mengakses data tidak mnggunakan foreach / manual
        int panjangAray = names.length;

        for(int i = 0; i < panjangAray; i++){
            System.out.println(names[i]);
        }

        System.out.println("FOREACH");

        //dengan menggunakan foreach
        for(String name : names){
            System.out.println(name);
        }
    }
}
