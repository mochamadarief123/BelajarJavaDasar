/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 27/03/23
 * Time: 23:56
 * To change this template use File | Settings | File Templates.
 */
public class Scope {
    public static void main(String[] args) {
        /*
        * variable hanya dapat diakses jika berada satu blok, ini di sebut dengan scope
        */

        sayHello("Jhon");
    }

    //misal
    static void sayHello(String name){
        if (!name.isEmpty()){
            String hi = "Hi " + name;
            //mencetak variable hi didalam scope
            System.out.println(hi);
        }
        //System.out.println(hi); // error, karna diluar scope variable hi berada
    }
}
