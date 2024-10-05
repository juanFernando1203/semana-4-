public class conceptosjava {
public static void main(String[]args) {
    int entero = 10;
    double doble= entero; // conversion automatica
    System.out.println("conversion implicita de int a double:");
    System.out.println("Entero: " + entero + " -> Doble: " + doble);
    System.out.println();

    double numeroDoble = 9.89;
    int numeroEntero = (int) numeroDoble; // conversion explicita
    System.out.println("conversion explicita de double a int:");
    System.out.println("Doble: " + numeroDoble + " -> Entero: " + numeroEntero);
    System.out.println();

    int x = 123;
    double y = 456.789;
    String cadena1 = Integer.toString (x);
    String cadena2 = Double.toString(y);
    System.out.println ("conversion de numeros a cadenas");
    System.out.println("Entero: " + x + "-> Cadena: \"" + cadena1 +"\"");
    System.out.println("Doble: "  + y+ "-> Cadena: \"" + cadena2 +"\"");
    System.out.println();

String cadenaEntero= "789";
String cadenaDouble= "1064.1213";

try {
    int convertidoEntero = Integer.parseInt(cadenaEntero);
double convertidoDouble = Double.parseDouble(cadenaDouble);
    System.out.println ("Conversionn cadenas)
    System.out.println
    System.out.println