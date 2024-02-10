package main.java.string;

public class ReplaceNums {

    public String solution(String s){
        StringBuilder sb = new StringBuilder();

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if(Character.isDigit(charArray[i])){
                sb.append("number");
            }else {
                sb.append(charArray[i]);
            }

        }
       return sb.toString();
    }
}
