// File: HugeInteger.java
public class HugeInteger {
    private final int[] digits = new int[40];

    public HugeInteger() {}

    public HugeInteger(String val) {
        parse(val);
    }

    public void parse(String val) {
        int len = val.length();
        int startPos = 40 - len;
        for (int i = 0; i < len; i++) {
            digits[startPos + i] = Character.getNumericValue(val.charAt(i));
        }
    }

    public HugeInteger add(HugeInteger val) {
        HugeInteger result = new HugeInteger();
        int carry = 0;
        for (int i = 39; i >= 0; i--) {
            int sum = this.digits[i] + val.digits[i] + carry;
            result.digits[i] = sum % 10;
            carry = sum / 10;
        }
        return result;
    }

    public HugeInteger subtract(HugeInteger val) {
        HugeInteger result = new HugeInteger();
        int borrow = 0;
        for (int i = 39; i >= 0; i--) {
            int diff = this.digits[i] - val.digits[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.digits[i] = diff;
        }
        return result;
    }

    public boolean isEqualTo(HugeInteger val) {
        for (int i = 0; i < 40; i++) {
            if (this.digits[i] != val.digits[i]) return false;
        }
        return true;
    }

    public boolean isNotEqualTo(HugeInteger val) { return !isEqualTo(val); }

    public boolean isGreaterThan(HugeInteger val) {
        for (int i = 0; i < 40; i++) {
            if (this.digits[i] > val.digits[i]) return true;
            if (this.digits[i] < val.digits[i]) return false;
        }
        return false;
    }

    public boolean isLessThan(HugeInteger val) {
        return !isGreaterThan(val) && !isEqualTo(val);
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger val) {
        return isGreaterThan(val) || isEqualTo(val);
    }

    public boolean isLessThanOrEqualTo(HugeInteger val) {
        return isLessThan(val) || isEqualTo(val);
    }

    public boolean isZero() {
        for (int d : digits) if (d != 0) return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (int d : digits) {
            if (d != 0) leadingZero = false;
            if (!leadingZero) sb.append(d);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}