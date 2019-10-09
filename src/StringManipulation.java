import java.util.Arrays;

public class StringManipulation {

    public static void main(String[] args) {

        /*String[] arrayChar = mySplitChar("This is a test", ' ');
        for (String s : arrayChar) {
            System.out.println(s);
        }*/

        String[] arrayString = mySplitString("This is a test", "is");
        for(String s : arrayString){
            System.out.println(s);
        }
    }

    //Exercise 1
    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    //Exercise 2
    public static boolean isEqual(String s1, String s2) {
        boolean isEqual = true;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                isEqual = false;
            }
        }
        return isEqual;
    }

    //Exercise 3
    public static boolean isPalindrome(String s) {
        String reversedString = "";
        boolean isPalindrome = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString += s.charAt(i);
        }
        if (s.equals(reversedString)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }

    //Exercise 4
    public static String[] mySplitChar(String s, char c) {
        //Checking for the size of the array we'll create
        int length = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != c){
                length++;
                i = s.indexOf(c, i);
                if(i == -1){
                    i = s.length()+1;
                }
            }
        }
        //Adding words to array
        String[] stringArray = new String[length];
        int counter = 0;
        boolean complete = false;
        for (int i = 0; i < s.length() && !complete; i++) {
            if (s.charAt(i) != c) {
                if(s.indexOf(c, i) != -1){
                    stringArray[counter] = s.substring(i , s.indexOf(c, i));
                    i = s.indexOf(c, i);
                    counter++;
                } else {
                    stringArray[counter] = s.substring(i);
                    complete = true;
                }
            }
        }
        return stringArray;
    }

    //Exercise 5
    public static String[] mySplitString(String s1, String s2) {
        String[] stringArray = mySplitChar(s1, ' ');
        String[] copiedArray = new String[stringArray.length-1];
        for(int i=0; i<stringArray.length; i++){
            if(stringArray[i].equals(s2)){
                //Arrays.copyOf(stringArray, stringArray.length-1);
                //System.arraycopy(original, 0, n, 0, element );
                //System.arraycopy(stringArray, element+1, n, element, stringArray.length -1);
                //System.arraycopy(stringArray, 0, copiedArray, 2, stringArray.length-1);
                for(int j=i+1; j<=stringArray.length-1; j++){
                    stringArray[i] = stringArray[j];
                }
            }
        }
        return stringArray;
    }
}
