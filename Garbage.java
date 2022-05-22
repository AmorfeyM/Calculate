import java.util.Map;

public class Garbage {
    String[] rimNums = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    //        for (String s : rimNums) {
//            System.out.println(s);
//        }
//            try {
//        int num1 = Integer.parseInt(String.valueOf(inputArr[0]));
//        int num2 = Integer.parseInt(String.valueOf(inputArr[2]));
//        String operand = String.valueOf(inputArr[1]);
//    }
//        catch (Exception e) {
//        System.out.println("throws Exception: input not Integer");
//    }
}
//
//    private static int letterToNumber(char letter) {
//
//        int result = -1;
//
//        for (Map.Entry < Integer, String > entry: romanString.entrySet()) {
//            if (entry.getValue().equals(String.valueOf(letter))) result = entry.getKey();
//        }
//        return result;
//    }
//
//    static int toArabicNumber(String roman) throws Exception {
//        int result = 0;
//
//        int i = 0;
//        while (i < roman.length()) {
//            char letter = roman.charAt(i);
//            int num = letterToNumber(letter);
//            i++;
//            if (i == roman.length()) {
//                result += num;
//            }else {
//                int nextNum = letterToNumber(roman.charAt(i));
//                if(nextNum > num) {
//                    result += (nextNum - num);
//                    i++;
//                }
//                else result += num;
//            }
//        }
//        return result;
//    }
//*************************
//    int num1;
//    int num2;
//    String operand = null;
//    String[] operands = new String[]{"-", "+", "*", "/"};
//    String[] inputArr = input.split("[-+*/]");
//        for (char c : input.toCharArray()) {
//                for (String s : operands) {
//                if (String.valueOf(c).equals(s)) {
//                operand = String.valueOf(c);
//                }
//                }
//                }
//
//                num1 = Integer.parseInt(inputArr[0]);
//                num2 = Integer.parseInt(inputArr[1]);
//
//
//                if (inputArr.length > 2 || (num1 > 10 || num2 > 10) || operand==null) {
//                throw new Exception();
//                }
//
//                return switch (operand) {
//                case "-" -> String.valueOf(num1 - num2);
//                case "+" -> String.valueOf(num1 + num2);
//                case "*" -> String.valueOf(num1 * num2);
//                case "/" -> String.valueOf(num1 / num2);
//default -> null;
//        };