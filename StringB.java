package task06_02;

public class StringB {
    public static void main(String[] args) {
        String a = "srztf";
        System.out.println(reverse(a));
    }

    public static String reverse(String a) {
        int l = a.length();
        int b = l % 2;
        if (b == 0) {
            int h = l / 2;
            String s = a.substring(0, h);
            String s1 = a.substring(h, l);
            String s2 = s1 + s;
            return s2;
        } else {
            int h = l / 2;
            String s = a.substring(0, h);
            String s1 = a.substring(h + 1, l);
            String s2 = s1 + a.charAt(h) + s;
            return s2;
        }
    }
}
