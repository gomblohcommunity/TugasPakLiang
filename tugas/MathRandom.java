public class MathRandom{
    public static void main (String[]args){
        //. alphabet variable initiation
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        //. randomNumber variable initiation and get random number to hit the alphabet index
        int randomNumber = (int)(Math.random() * 27);
        //. print the uppercase alpahbet character after hit the index by randomNumber
        System.out.println(Character.toUpperCase(alphabet.charAt(randomNumber)));
    }
}