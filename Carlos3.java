
package carlos3;
import java.util.Scanner;
public class Carlos3 {

    public static void main(String[] args) {
       int numero =0;
       Scanner sm = new Scanner(System.in);
       System.out.println("porfavor ingrese un numero: ");
       numero = sm.nextInt();
       int suma = 0;
       for(int i = 0;i<=numero;i++)
       suma = suma +i;
       {
       System.out.println("la suma de los numeros es: " + suma);

    }
}
}
