/*
programa x teclado con limite numerico (100) muestre en pantalla todos
los numeros hasta el limte empezando x 1
 */
import java.util.Scanner;

class LimiteNumeros {
  public static void main(String[] args) {
   /*
   tenemos un limite hasta que el que tenemos que contar
   ingresa ese limite
    */

   System.out.println("ingrese el limite hasta el que quiere contar");
   Scanner teclado = new Scanner(System.in);
   int limite = teclado.nextInt();
   int cont = 1;

   while (cont <= limite){
        System.out.println(cont);
        cont = cont + 1;
   }
  }



}
