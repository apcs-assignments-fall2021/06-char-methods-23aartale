public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if(ch>= 'A' && ch<= 'Z') {
            ch = (char) (ch + 32);
            return ch;
        }
        else{
            return ch;
        }
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            ch = (char) (ch - 32);
            return ch;
        } else {
            return ch;
        }
    }

    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x < '0' || x > '9') {
                str2 = str2 + x;
            }
        }
        return str2;
    }

    // Write some code to test your methods!
    public static void main(String[] args) {
        System.out.println(toLower('B'));
        System.out.println(toUpper('v'));
        System.out.println(removeNumbers("He11o W0r1d"));
    }
}
