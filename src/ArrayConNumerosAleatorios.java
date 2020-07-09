import java.util.Random;

public class ArrayConNumerosAleatorios {
    public static void main(String[] args) {

        int [] myArray=new int[500];

        for(int i=0;i<myArray.length;i++){
            myArray[i] = new Random().nextInt(10000);
            System.out.println(myArray[i]);
        }
    }

}
