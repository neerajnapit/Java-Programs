package String;



public class ReverseString {
    public static void main(String[] args) {
        // Reverse string using loop
        String str = "NEERAJ";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.toLowerCase().charAt(i));// print reverse in loweCase
        }
        System.out.println();

        // Replacing value - print only letters, numbers or special character

        String mixStr = "test1@gmail.com";
        String letters=mixStr.replaceAll("[^0-9]",""); // ^ means only that type of value will print
        System.out.println(letters);

    }

}
