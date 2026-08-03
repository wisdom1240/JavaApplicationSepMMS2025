// File: IntegerSet.java
public class IntegerSet {
    private final boolean[] set;

    public IntegerSet() {
        set = new boolean[101]; // initialized to false
    }

    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet resultSet = new IntegerSet();
        for (int i = 0; i <= 100; i++) {
            resultSet.set[i] = set1.set[i] || set2.set[i];
        }
        return resultSet;
    }

    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
        IntegerSet resultSet = new IntegerSet();
        for (int i = 0; i <= 100; i++) {
            resultSet.set[i] = set1.set[i] && set2.set[i];
        }
        return resultSet;
    }

    public void insertElement(int k) {
        if (k >= 0 && k <= 100) set[k] = true;
    }

    public void deleteElement(int m) {
        if (m >= 0 && m <= 100) set[m] = false;
    }

    public boolean isEqualTo(IntegerSet other) {
        for (int i = 0; i <= 100; i++) {
            if (this.set[i] != other.set[i]) return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean empty = true;
        for (int i = 0; i <= 100; i++) {
            if (set[i]) {
                sb.append(i).append(" ");
                empty = false;
            }
        }
        return empty ? "---" : sb.toString().trim();
    }
}