import java.util.Random;
import java.util.Scanner;
class PasswordGenerator{
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS   = "23456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()_+";
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter password length(8-32):");
        int length = scan.nextInt();
        scanner.close();
        if(length<8||length>32){
            System.out.println("Invalid length(12).");
            length = 12;
        }
        String password = generatePassword(length,random);
        System.out.println("Generated Password: " + password);
    }
    private static String generatePassword(int length,Random random){
        StringBuilder password = new StringBuilder(length);
        password.append(UPPERCASE.charAt(random.nextInt(UPPERCASE.length())));
        password.append(LOWERCASE.charAt(random.nextInt(LOWERCASE.length())));
        password.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
        password.append(SPECIAL_CHARS.length(random.nextInt(SPECIAL_CHARS.length())));
        String allChars = UPPERCASE + LOWERCASE + NUMBERS + SPECIALS_CHARS;
        for(int i =4;i<length;i++){
            password.append(allChars.charAt(random.nextInt(allChars.length())));
            String passwordStr = password.toString();
            char[] passwordArray = passwordStr.toCharArray();
            shuffleArray(passwordArray,random);
            return new String(passwordArray);
        }
        private static String shuffleArray(char[]array,Random random){
            int index;
            char temp;
            for(int i = array.length-1;i>0;i--){
                index = random.nextInt(i+1);
                temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
    }
