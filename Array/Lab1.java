//Class Lab1
class Lab1{
  //Static library is loaded	
  static{
    System.loadLibrary("arithmeticMean");
  }
   private native double getArithmeticMean(int[] arrayNumbers);

   public static void main(String[] args){
     int[] arrayOfNumbers = new int[args.length];
     int len = args.length;
     for (int i = 0; i < len; i++){
       arrayOfNumbers[i] = Integer.parseInt(args[i]);
     }
     new Lab1().getArithmeticMean(arrayOfNumbers);
	}
}
