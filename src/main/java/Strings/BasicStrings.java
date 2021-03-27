package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
       StringBuilder sb = new StringBuilder();
       sb.append(string2);
       sb.append(string1);
       return sb.toString();
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< string.length(); i++){
            if(string.charAt(i) >='a' &&string.charAt(i) <='z' ||string.charAt(i) >='A' &&string.charAt(i) <='Z'){
                sb.append(" ");
            }else{
                sb.append(string.charAt(i));
            }


        }
        return sb.toString().replace("'", " ");
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< string.length(); i++){
            if(string.charAt(i) >='a' &&string.charAt(i) <='z' ){
                sb.append(Character.toUpperCase(string.charAt(i)));
            }else if(string.charAt(i) >='A' &&string.charAt(i) <='Z'){
                sb.append(Character.toLowerCase(string.charAt(i)));
            }else{
                sb.append(string.charAt(i));
            }


        }
        return sb.toString();
    }

    public String oneAtATime(String string1, String string2) {
        String result = "";

        for (int i = 0; i < string1.length() || i < string2.length(); i++) {


            if (i < string1.length())
                result += string1.charAt(i);


            if (i < string2.length())
                result += string2.charAt(i);
        }
        return result;
    }
}
