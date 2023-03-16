
package ejercicio1;
import java.util.Scanner;


public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola = new Scanner(System.in);
        int num1, num2, num3 ,num4, num5;
        
        System.out.println("Digite el valor # 1: ");
        num1 = consola.nextInt();
        System.out.println("Digite el valor # 2: ");
        num2 = consola.nextInt();
        System.out.println("Digite el valor # 3: ");
        num3 = consola.nextInt();
        System.out.println("Digite el valor # 4: ");
        num4 = consola.nextInt();
        System.out.println("Digite el valor # 5: ");
        num5 = consola.nextInt();
        
        //objeto de la clase
        MayorMenor obj1 = new MayorMenor(num1,num2,num3,num4,num5);
        obj1.numeroMayor();
        obj1.numeroMenor();
        obj1.raiz();
        obj1.potencia();
    }
    
}
