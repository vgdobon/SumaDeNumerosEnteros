import java.util.Scanner;

public class DivisoresDeUnNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime de que número quieres saber sus divisores");
        int numero=input.nextInt();

        while(numero<0){
            System.out.println("No estas introduciendo un numero positivo");
            System.out.println("Dime de que número quieres saber sus divisores");
            numero=input.nextInt();
        }
        System.out.print("Los divisibles de "+numero+" son: ");

        for(int i=1;i<=numero;i++) {


            if (numero % i == 0) {
                if (i == 1) {
                    System.out.print(i);
                } else if (i < numero) {
                    System.out.print(", " + i);
                } else {
                    System.out.print(" y " + i+".");
                }

            }

        }
    }
}
