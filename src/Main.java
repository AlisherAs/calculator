import java.util.Scanner;

public class Main {

    static int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
    static String[] letters  = new String[] { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public static boolean isNumeric(String str) {

        if (str == null || str.length() == 0) {
            return false;
        }

        try {
            Double.parseDouble(str);
            return true;

        } catch (NumberFormatException e) {
            System.out.println("You entered arabic or roman number!");
            return false;
        }
    }

    public static void main(String[] args) {
        String val1 = null;
        String val2 = null;
        String oper = null;

        System.out.println("Input: ");
        Scanner scanner = new Scanner(System.in);
        val1 = scanner.next();
        oper = scanner.next();
        val2 = scanner.next();

            if (isNumeric(val1) && isNumeric(val2)) {
                int num1 = 0;
                int num2 = 0;
                num1 = Integer.parseInt(val1);
                num2 = Integer.parseInt(val2);

                switch (oper) {
                    case ("+"):
                        int result = num1 + num2;
                        System.out.println("Output: \n" + result);
                        break;
                    case ("-"):
                        result = num1 - num2;
                        System.out.println("Output: \n" + result);
                        break;
                    case ("*"):
                        result = num1 * num2;
                        System.out.println("Output: \n" + result);
                        break;
                    case ("/"):
                        result = num1 / num2;
                        System.out.println("Output: \n" + result);
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            } else {
                switch (oper) {
                    case ("+"):
                        int result = RomanToInt.RomanNumeral.RomToInt(val1) + RomanToInt.RomanNumeral.RomToInt(val2);
                        System.out.println("Output: \n" + ArabicToRoman.convertIntegerToRoman(result));
                        break;
                    case ("-"):
                        result = RomanToInt.RomanNumeral.RomToInt(val1) - RomanToInt.RomanNumeral.RomToInt(val2);
                        System.out.println("Output: \n" + ArabicToRoman.convertIntegerToRoman(result));
                        break;
                    case ("*"):
                        result = RomanToInt.RomanNumeral.RomToInt(val1) * RomanToInt.RomanNumeral.RomToInt(val2);
                        System.out.println("Output: \n" + ArabicToRoman.convertIntegerToRoman(result));
                        break;
                    case ("/"):
                        result = RomanToInt.RomanNumeral.RomToInt(val1) / RomanToInt.RomanNumeral.RomToInt(val2);
                        System.out.println("Output: \n" + ArabicToRoman.convertIntegerToRoman(result));
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            }
        }
    }



