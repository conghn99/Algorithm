public class _796 {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        char[] ch = s.toCharArray();
        String a, b;
        for (int i = 0; i<ch.length;i++) {
            a = s.substring(0, 1);
            b = s.substring(1);
            s = b.concat(a);
            if (s.equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
