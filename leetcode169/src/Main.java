// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // go through the array and for each number, count the amount of
        // times it is shown in the array, store n in a variable and return it
        //on the solution i added an if statement just to make sure we dont exceed the time limit

        int[] nums = {1};
        int n = 0;
        int x = 0;
        int majority = 0;

        for (int i = 0; i < nums.length; i++) {
            n = 0;
            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]){
                    n++;
                }if (n>100){
                    break;
                }

            }

            if (n > x ){
            majority = nums[i];
            x = n;
            }
        }

        System.out.println(majority);

    }
}