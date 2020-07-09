import java.util.Scanner;

public class CifrasDeUnNumero {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Dime un numero desde el 0 al 9999");
        int numero=input.nextInt();

        String cantidadDeCifras;
        int registro;

        while(numero<0||numero>9999){
            System.out.println("No estas introduciendo un numero correcto");
            System.out.println("Dime un numero desde el 0 al 9999");
            numero=input.nextInt();
        }
        registro=numero;
        int numeroDeCifras=1;

        for(int i =0;i<1;i++){
            registro=registro/10;
            if(registro>0){
                i--;
                numeroDeCifras++;
            }
        }

        System.out.println(numero+" tiene "+ numeroDeCifras+" cifras");

        if(numero>999){
            cantidadDeCifras="4";
        }else if(numero>99){
            cantidadDeCifras="3";
        }else if(numero>9){
            cantidadDeCifras="2";
        }else{
            cantidadDeCifras="1";
        }

        System.out.println("El numero "+numero+" tiene "+cantidadDeCifras+" cifras");

    }
}
