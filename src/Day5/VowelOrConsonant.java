package Day5;
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character ;");
        String word = sc.nextLine();
        char character = word.charAt(0);

        String vowels = "AEIOU";
        char[] charArr = vowels.toCharArray(); //Array Containing the voewls
        for (int num : charArr) { // Remeb
            if (character == num) {     // if the array containing the input then vowel or consonent
                System.out.println("Vowel");
                break;
            }
            else if (character != num){
                    System.out.println(" Consonent ");
                    break;
                }

            }
        }
    }



