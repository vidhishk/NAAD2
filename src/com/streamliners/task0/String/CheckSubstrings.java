public class CheckSubstrings {
    public static void main(String[] args){
        String txt="we are indians.";
        String str1="we";
        String str2="are";
          boolean result=txt.contains(str1);
           if (result){
               System.out.println(str1 + " is present in " +txt);
           }
           else{
               System.out.println(str1 +" is not present in "+txt);
           }
        result = txt.contains(str2);
        if(result) {
            System.out.println(str2 + " is present in the string.");
        }
        else {
            System.out.println(str2 + " is not present in the string.");
        }
    }
}
