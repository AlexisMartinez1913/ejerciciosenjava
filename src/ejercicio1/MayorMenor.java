/*Elabore una clase que me permita leer 5 números y calcule el máximo y
el mínimo entre los 5 números, la raíz  del 3 número, 
la potencia del primero con el último número.
*/
package ejercicio1;
import java.util.*;

public class MayorMenor {
    
    private int num1, num2, num3,num4, num5;
    
    //constructor

    public MayorMenor(int num1, int num2, int num3, int num4, int num5) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }
    
    
    
    public void numeroMayor(){
        if (num1>num2 && num1>num3 && num1>num4 && num1>num5){
            System.out.println("El valor mayor es el valor # 1, el: " + num1);
        }
        else{
            if(num2>num1 && num2>num3 && num2>num4 && num2 >num5){
                
                System.out.println("El valor mayor es el valor # 2, el: " + num2);
            }
            else{
                if(num3>num1 && num3>num2 && num3>num4 && num3>num5){
                    System.out.println("El valor mayor es el valor # 3, el: " + num3);
                }
                else{
                    if(num4>num1 && num4>num2 && num4>num3 && num4>num5){
                        System.out.println("El valor mayor es el valor # 4, el: " + num4);
                    }
                    else{
                        System.out.println("El valor mayor es el valor # 5, el: " + num5);
                    }
                }
            }
        }
    }
    
    public void numeroMenor(){
        
        if (num1<num2 && num1<num3 && num1<num4 && num1<num5){
            System.out.println("El valor MENOR es el valor # 1, el: " + num1);
        }
        else{
            if(num2<num1 && num2<num3 && num2<num4 && num2 <num5){
                
                System.out.println("El valor MENOR es el valor # 2, el: " + num2);
            }
            else{
                if(num3<num1 && num3<num2 && num3<num4 && num3<num5){
                    System.out.println("El valor MENOR es el valor # 3, el: " + num3);
                }
                else{
                    if(num4<num1 && num4<num2 && num4<num3 && num4<num5){
                        System.out.println("El valor MENOR es el valor # 4, el: " + num4);
                    }
                    else{
                        System.out.println("El valor MENOR es el valor # 5, el: " + num5);
                    }
                }
            }
        }
    }
    
    public void raiz(){
        double raizTecerNumero;
        raizTecerNumero = Math.sqrt(num3);
        System.out.println("La raiz de "+ num3 + " es: "+ raizTecerNumero);
    }
    
    public void potencia(){
        double elevado;
        elevado = Math.pow(num1, num5);
        System.out.println("el numero1 -> " + num1 + " elevado al numero5 -> " + num5 + " es igual a: "+ elevado);
    }
    
    
    
    

    
}
