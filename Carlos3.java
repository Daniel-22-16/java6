
package carlos3;
import java.util.Scanner;
public class Carlos3 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre");         
        String nombre =sc.nextLine();
        System.out.println("hola " + nombre);
        
        int suma = 0;
        for (int i = 0; i<=5; i++){
            System.out.println(suma + "+" +i );
            suma = suma +i;
            System.out.println("la suma de los 5 ptimeros numeros es: " + suma);
        }
    }
}
