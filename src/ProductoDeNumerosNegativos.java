import java.util.Scanner;

public class ProductoDeNumerosNegativos {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        boolean error=true;
        boolean resultadoPositivo=false;
        boolean resultadoNegativo=false;
        int suma=0;
        int numeroAbsoluto=Math.abs();

        System.out.println("Dame un numero negativo/positivo");
        int numero=input.nextInt();
        System.out.println("Dame otro numero negativo/positivo");
        int numero2=input.nextInt();

        if((numero>=0&&numero>=0)||(numero<=0&&numero2<=0)){
                resultadoPositivo=true;
        }else{
            resultadoNegativo=true;
        }





    }
}
