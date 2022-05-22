import java.util.Map;
import java.util.TreeMap;

class NumberService {

    private final static TreeMap < Integer, String > romanString = new TreeMap<>();

    static {
        romanString.put(1, "I");
        romanString.put(4, "IV");
        romanString.put(5, "V");
        romanString.put(9, "IX");
        romanString.put(10, "X");
        romanString.put(40, "XL");
        romanString.put(50, "L");
        romanString.put(90, "XC");
        romanString.put(100, "C");
    }

    static NumObject parseAndValidate(String symbol) throws Exception {
        int value;
        Type type;

        try {
            value = Integer.parseInt(symbol);
            type = Type.ARABIC;
        }catch (NumberFormatException e) {
            value = toArabicNumber(symbol);
            type = Type.ROMAN;
        }
        if (value < 1 || value > 10) {
            throw new Exception();
        }
        return new NumObject(value, type);
    }

    static NumObject parseAndValidate(String symbol, Type type) throws Exception {
        NumObject number = parseAndValidate(symbol);
        if (number.getType() != type) {
            throw new Exception();
        }
        return number;
    }

    private static int letterToNumber(char letter) {
        int result = -1;
        for (Map.Entry < Integer, String > entry: romanString.entrySet()) {
            if (entry.getValue().equals(String.valueOf(letter))) result = entry.getKey();
        }
        return result;
    }

    static String toRomanNumber(int number) {
        int i = romanString.floorKey(number);
        if (number == i) {
            return romanString.get(number);
        }
        return romanString.get(i) + toRomanNumber(number - i);
    }

    static int toArabicNumber(String roman) throws Exception {
        int result = 0;
        int i = 0;

        while (i < roman.length()) {
            char letter = roman.charAt(i);
            int num = letterToNumber(letter);

            if (num < 0) {
                throw new Exception();
            }
            i++;
            if (i == roman.length()) {
                result += num;
            }
            else {
                int nextNum = letterToNumber(roman.charAt(i));
                if(nextNum > num) {
                    result += (nextNum - num);
                    i++;
                }
                else result += num;
            }
        }
        return result;
    }
}
