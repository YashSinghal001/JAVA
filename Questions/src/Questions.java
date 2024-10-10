import java.util.Scanner;

public class Questions {
    public static char Character(String str) {
        //        public class Questions {
//            public static char Character(String str) {
//                if (str.length() > 8) {
//                    return str.charAt(8);
//                } else {
//                    return '\0'; // Return null character if string is too short
//                }
//            }
        if (str.length() > 8) {
            return str.charAt(8);
        } else {
            return '\0'; // Return null character if string is too short
        }
    }

    public static void Index(String str2) {
        int s1 = str2.codePointAt(0);
        int s2 = str2.codePointAt(6);
        System.out.println("Character :"+str2.charAt(0)+"\nUnicode Point : " + s1);
        System.out.println("Character :"+str2.charAt(6)+"\nUnicode Point : " + s2);
    }

    public static String Concat(String str3,String str4) {
        System.out.println("String 1: " + str3);
        System.out.println("String 2: " + str4);
        String strcon = str3.concat(str4);
        return  strcon;
    }

    public static void Squecence(String str6,String str7) {
        System.out.println("Given String : " + str6);
        System.out.println("Specified Sequence of char Values : " + str7);
        System.out.println(str6.contains(str7));
    }

    public static void SquecenceCagr(String str8,String str9) {
        CharSequence cs="example.com";
        System.out.println("Comparing '"+str8+"'"+" and '"+cs+"' : " + str8.contentEquals(cs));
        System.out.println("Comparing '"+str9+"'"+" and '"+cs+"' :"+ str9.contentEquals(cs));
    }

    public static void LenghtString(String str10) {
    int res=str10.length();
        System.out.println(res);
    }

    public static void SubstringChar(String str11) {
        String new_str = str11.substring(10, 26);
        System.out.println("old = " + str11);
        System.out.println("new = " + new_str);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String str6,str7;
        String str8,str9;
        String  str10,str11;
        str11="The quick brown fox jumps over the lazy dog.";
        str10="Yash Singhal";
        String str2 = "Yash Singhal";
        str6="Computer";
        str7="Computers";
        str8="example.com";
        str9="Example.com";
        char res = Character(str);
//        System.out.println(res);
//        Index(str2);
String str3,str4;
str3= "Hello";
        str4= "World";
//        String result=Concat(str3,str4);
//        System.out.println(result);
//        Squecence(str6,str7);
//        SquecenceCagr(str8,str9);
//        LenghtString(str10);
        SubstringChar(str11);
    }
}