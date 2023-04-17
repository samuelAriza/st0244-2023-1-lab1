import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Class Lab1
class Lab1{
    static{
        System.loadLibrary("ArithmeticMean");
    }
    
   private native double getArithmeticMean(int[] arrayNumbers);
   public static void main(String[] args) {
    List<Integer> array = new ArrayList<Integer>();
    int number = 0;
    File f = new File(args[0]);
    try (Scanner entrada = new Scanner(f)) {
      while(entrada.hasNextLine()){
        number = entrada.nextInt();
        array.add(Integer.valueOf(number));
      }
      int[] arrayOfNumbers = new int[array.size()];

      for (int i = 0; i < array.size(); i++){
        arrayOfNumbers[i] = array.get(i);
      }
        new Lab1().getArithmeticMean(arrayOfNumbers);
    } catch (FileNotFoundException e) {
        System.out.println(e.toString());
    }
   }
}
