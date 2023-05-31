package ArraysAssignment1;

import java.util.Arrays;

/**Q4.** You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

        Increment the large integer by one and return the resulting array of digits.

        **Example 1:**
        Input: digits = [1,2,3]
        Output: [1,2,4]
*/
public class Question4 {
    public static void main(String[] args) {
        int[] digits={1,2,3};
        addOne(digits);
        System.out.println(Arrays.toString(digits));
    }
    public static void addOne(int[] digits){
        StringBuilder strInt=new StringBuilder();
        for(Integer element:digits){
            strInt.append(element);
        }
        Integer num=Integer.parseInt(String.valueOf(strInt));
        num=num+1;
        String str=Integer.toString(num);
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            digits[i]=Character.getNumericValue(ch);
        }
    }
}
