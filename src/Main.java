public class Main {
    public static void main(String[] args) {

        Integer[] arrayNumber = {5,2,7,1};
        int targetSum = 9;
        int actualSum = 0;

        for(int i = 1; i <= arrayNumber.length; i++){
            int number = arrayNumber[i];
            int number2 = arrayNumber[i+1];
            actualSum = number = number2;
            if(actualSum == targetSum){
                System.out.print(actualSum);
            }else
                System.out.println("Number1 is " + number + "\n");
        }





    }
}