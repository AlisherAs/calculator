public class RomanToInt {
    enum RomanNumeral {
        I("I", 1), II("II", 2), III("III", 3), IV("IV", 4), V("V", 5),
        VI("VI", 6), VII("VII", 7), VIII("VIII", 8), IX("IX", 9), X("X", 10);

        private String key;
        private Integer value;

        RomanNumeral(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }

        public static int RomToInt(String key) {
            for (RomanNumeral i: values())
                if (i.getKey().equals(key))
                    return i.getValue();
            return -1;
        }
    }
}