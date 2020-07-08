import java.util.Scanner;

public class SumaNaturales {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        boolean error=true;
        int suma=0;

        System.out.println("Hasta que numero quieres sumar");
        int numero=input.nextInt();
        while (error){

            if(numero<1){
                System.out.println("No has metido un numero correcto.Introduce un numero mayor que 1");
                numero=input.nextInt();
            }else{
                error=false;
            }

        }

        for(int i=1;i<=numero;i++){
            suma=suma+i;
        }

        System.out.println("el resultado de todos los numeros del 1 al "+numero+" es "+suma);

    }
}
