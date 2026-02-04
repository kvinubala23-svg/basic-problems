public class Array {
    public static void main(String[] args) {
       
        int[] numbers = {10, 20, 30, 40, 50};

   
        System.out.println("First number: " + numbers[0]);  // 10
        System.out.println("Third number: " + numbers[2]);  // 30

      
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Number: " + numbers[i]);
        }
    }
}
