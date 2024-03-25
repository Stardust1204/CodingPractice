public class Main {
    public static void main(String[] args) {

        Integer[] arrayNumber = {5,2,7,1};
        int targetSum = 9;
        int actualSum = 0;
        int number1 = arrayNumber[0];

        for(int i = 1; i <= arrayNumber.length -1; i++){
            actualSum = number1 + arrayNumber[i];
            if(actualSum == targetSum){
                System.out.println("Number 1 is "+number1+" \n "+"Number 2 is "+arrayNumber[i]);
            }
        }

    }
}
//int number = arrayNumber[i];
//int number2 = arrayNumber[i+1];
//actualSum = number = number2;
//            if(actualSum == targetSum){
//        System.out.print(actualSum);
//            }else
//                    System.out.println("Number1 is " + number + "\n");