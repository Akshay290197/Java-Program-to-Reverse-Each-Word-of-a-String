public class ReverseStringEachWord {
    public static void main(String[] args) {
        String str = "Hello we all are working for single Objective";
        reverseWord(str);
    }
    public static void reverseWord(String str){
        String words[] = str.split(" ");
        StringBuilder stri = new StringBuilder();
        for(int i=0;i<words.length;i++){
            StringBuilder sb = new StringBuilder(words[i]);
            stri.append(sb.reverse().append(" "));
        }
            System.out.print(stri);
    }
}
