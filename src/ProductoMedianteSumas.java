import java.util.Scanner;

public class ProductoMedianteSumas {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        boolean error=true;
        int numeroMenor;
        int numeroMayor;
        int suma=0;


        System.out.println("Dame un numero positivo");
        int numero=input.nextInt();
        System.out.println("Dame otro numero positivo");
        int numero2=input.nextInt();

        while (error) {

            if (numero < 0 || numero2 < 0) {
                System.out.println("No has metido un numero correcto.Introduce un numero positivo");
                System.out.println("Dame un numero positivo");
                numero = input.nextInt();
                System.out.println("Dame otro numero positivo");
                numero2 = input.nextInt();
            } else {
                error = false;
            }
        }

            if(numero>numero2){
                numeroMenor=numero2;
                numeroMayor=numero;
            }else{
                numeroMenor=numero;
                numeroMayor=numero2;
            }
            System.out.print(numero+"*"+numero2+"=");

            for(int i =0;i<numeroMenor;i++){
                suma=suma+numeroMayor;
                if(i==numeroMenor-1){
                    System.out.print(numeroMayor+"="+suma);
                }else{
                    System.out.print(numeroMayor+"+");
                }

            }

    }
}

