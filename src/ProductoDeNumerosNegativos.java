import java.util.Scanner;

public class ProductoDeNumerosNegativos {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        boolean error=true;
        boolean resultadoNegativo=false;
        int suma=0;


        System.out.println("Dame un numero negativo/positivo");
        int numero=input.nextInt();
        System.out.println("Dame otro numero negativo/positivo");
        int numero2=input.nextInt();
        int numeroAbsoluto=Math.abs(numero);
        int numero2Absoluto=Math.abs(numero2);

        if((numero<0&&numero>0)||(numero>0&&numero2<0)){
                resultadoNegativo=true;
        }

        for(int i=0;i<numeroAbsoluto;i++){
            suma=suma+numero2Absoluto;
        }

        if(resultadoNegativo){
            suma=suma*-1;
        }

        System.out.println("El resultado de "+numero+"*"+numero2+"="+suma);

    }
}
