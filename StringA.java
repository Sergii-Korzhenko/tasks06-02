package task06_02;

public class StringA {
    public static void main(String[] args) {
        String a = "setchj";
        System.out.println(returnMiddle(a));
    }
    public static String returnMiddle (String a){
        char s;
        char s1;
        int b = a.length() % 2;
        if( b == 0){
            int h = a.length()/2;
            s = a.charAt(h-1);
            s1 = a.charAt(h);
            String d = "" + s + s1;
            return d;
        }else {
            int h = a.length()/2;
            s = a.charAt(h);
            String d = "" + s;
            return d;
        }
    }
}
