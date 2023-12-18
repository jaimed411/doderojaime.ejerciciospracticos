/*
Ejercicio Nº 2 - Tipos de Datos - Grupal

b) Ahora, asigna valores que no correspondan al tipo de dato.
    Por ejemplo, un int en un String o un String en un double…
    ¿Qué sucede con el programa? ¿Se produce algún error?
    ¿En qué situaciones se genera error y en cuáles no?
    Justificar el por qué de cada caso. Debatir con otros compañeros.
 */

/*public class IntString {

    public static void main(String[] args) {
        // int a String
        String cadenaDesdeEntero = (String) 42;
    }
}
/*
ERROR:
error en tiempo de compilación al no ser compatibles los dos datos.
*/


/*public class StringDouble {

    public static void main(String[] args) {
        // String a double
        double decimalDesdeCadena = Double.parseDouble("Hey, its an error!");
    }
}
/*
ERROR:
Se compila xq es valida la conversión pero sale error en tiempo de ejecuciion
*/

