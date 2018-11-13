public class MathRandom{
    public static void main (String[]args){
        int randomNumber = (int)(Math.random() * 27);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(Character.toUpperCase(alphabet.charAt(randomNumber)));
    }
}