package lab1;

public class bonus {

	public static void main(String[] args) {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int len = 5;
        iterate(chars, len, new char[len], 0);
    }

    public static void iterate(char[] chars, int len, char[] build, int pos) {
        if (pos == len) {
            String word = new String(build);
            
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            build[pos] = chars[i];
            iterate(chars, len, build, pos + 1);
        }
    }
}
