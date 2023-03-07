import java.util.Scanner;

public class Potencia {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Calcular potencias:");
        
        System.out.println("Ingrese la base:");
        int base = sc.nextInt();
        
        System.out.println("Ingrese el exponente:");
        int exponente = sc.nextInt();
        
        int resultado = calcularPotencia(base, exponente);
        System.out.println("El resultado de " + base + "^" + exponente + " es: " + resultado);
    }
    
    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, exponente - 1);
        }
    }
}