import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();
        List<Integer> list = getlist(s);
        System.out.println("result:" + list);
    }
    public static List<Integer>getlist(String s){
        String[] str= s.split(";");
        List<Integer>list=new ArrayList<>();
        for (String s1 : str){
            list.add(Integer.parseInt(s));
        }
return list;
    }
}
