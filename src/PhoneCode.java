import java.util.Scanner;

public class PhoneCode {

    private static final Scanner keyboard = new Scanner(System.in);

 // Create 2 arrays: One of characters and the other is int
 // firstLetter
 // numberOfLetters
    private static final int AREA_CODE = 305;

    public static void main(String[] args) {

        int phoneNumber;

        do {
            System.out.print("Please enter your 305 phone number: ");
            phoneNumber = keyboard.nextInt();
        }
        while (phoneNumber == 7);

        String areaCode = numberEncoding(AREA_CODE);
        StringBuilder part2 = new StringBuilder(areaCode).reverse();
        String number = numberEncoding(phoneNumber);
        StringBuilder part1 = new StringBuilder(number).reverse();

        System.out.print("The phone number " + AREA_CODE + phoneNumber + " can be encoded as " + part2 + part1);
        }


private static String numberEncoding(int phoneNumber) {

    char[] firstLetter = new char[]{'0','1','A','D','G','J','M','P','T','W'};
    int[] numberOfLetters  = new int[]{1,1,3,3,3,3,3,4,3,4};
    String result = "";
    int digit;
    int numberPerDigit;
    char letters;

while (phoneNumber > 0) {

    digit = phoneNumber % 10;
    numberPerDigit = (int)Math.floor(Math.random() * numberOfLetters[digit]);
    letters = (char)((int)firstLetter[digit] + numberPerDigit);
    result = result + letters;

    phoneNumber = phoneNumber / 10;

}

return result;
    }
}
