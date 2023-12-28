/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase1_complementario1;

/**
 *
 * @author Jaime
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dividendo = 30, divisor = 0, cociente;
        
        try  {
            cociente = dividendo / divisor;
            System.out.println("RESULTADO: " + cociente);
        }
        catch(ArithmeticException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
    
    
}
