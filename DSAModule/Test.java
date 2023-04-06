public class Test {
        public static void main(String []args) {
            
           System.out.println("Hello World");
           int limit = 25;
           int sum = 60;
           double randomValue = 2.77;
           int outerCounter = 0;
           int innerCounter = 0;
       
           for (int var = 1; var < limit; var = var + 3) {
                outerCounter++;
               System.out.println("randomValue: " + randomValue);
               for (int j = 1; j < limit; j = j + 2) {
                    System.out.print(j + ".");
                   sum++;
                   innerCounter++;
               }
               System.out.println("Inner: " + innerCounter);
           System.out.println("Sum === " + sum);
           }
           System.out.println("Outer Counter: " + outerCounter);
           System.out.println("Inner Counter: " + innerCounter);
        }
}