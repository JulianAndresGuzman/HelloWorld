package Scanner;
import java.util.Scanner;
public class Julian {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu nombre: ");
        String username = sc.nextLine();
        
        int num1, num2;
        
        System.out.print("Dime un número entero: ");
        num1 = sc.nextInt();
        
        System.out.print("Dime un número entero: ");
        num2 = sc.nextInt();
                
        //suma = num1+num2;

                
               System.out.println("Hola " + username + " Tu Suma es: " + (num1+num2));




    }
    
}
