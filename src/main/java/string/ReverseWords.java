package main.java.string;

public class ReverseWords {
    public String solution(String s){
        s = removeSpace(s);
        System.out.println(s);
        s = reverseStr(s, 0, s.length() - 1);
        System.out.println(s);

        return reverseWord(s);
    }

    private String reverseWord(String s) {
        int start = 0;
        s = s +  " ";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                int end = i - 1;
                s = reverseStr(s, start, end);
                start = i + 1;
            }

        }
        return s.substring(0, c.length-1);
    }

    private String reverseStr(String s,int left, int right) {
        char[] c = s.toCharArray();
        while (left <= right) {
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }

        return new String(c);
    }

    private String removeSpace(String s) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        int end = s.length()-1;
        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;
        while (start <= end) {
            if (s.charAt(start) != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(s.charAt(start));
            }
            start++;
        }


        return sb.toString();
    }
}
