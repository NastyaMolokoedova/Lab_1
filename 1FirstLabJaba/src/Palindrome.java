public class Palindrome {
    public static String reverseString(String str) {
        //ставим символы в строке в обратном порядке
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }
    public static boolean isPalindrome(String str) {
        //сравниваем с первонач. данными
        if (str.equals(reverseString(str)))
            return true;
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String[] n_args = {"шалаш", "скука", "ноутбук"}; //массив из строк
        for (String line : n_args) {
            if (isPalindrome(line))
                System.out.println(line + " - слово является палиндоромом");
            else {
                System.out.println(line + " - слово не является палиндоромом");
            }
        }
    }
}