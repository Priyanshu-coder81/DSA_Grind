import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        sc.close();

        if (isAllUpper(word) || (isAllUpper(word.substring(1)) && Character.isLowerCase(word.charAt(0)))) {
            System.out.println(swapCase(word));
        } else {
            System.out.println(word);
        }
    }

    
    private static boolean isAllUpper(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isUpperCase(c)) return false;
        }
        return true;
    }

    
    private static String swapCase(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                result.append(Character.toLowerCase(c));
            else
                result.append(Character.toUpperCase(c));
        }
        return result.toString();
    }
}
