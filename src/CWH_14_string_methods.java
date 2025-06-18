import java.util.Locale;

public class CWH_14_string_methods {
    public static void main(String[] args) {
        String name = "Harshit";
//        System.out.println(name);
        int value = name.length();
//        System.out.println(value);
        //TLO
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        // TUC
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        //Trimmed
        String nonTrimmedString = "     Harshit      ";
        System.out.println(nonTrimmedString);
        //nonTrimmed
        String Trimmedstring = nonTrimmedString.trim();
        System.out.println(Trimmedstring);
        //substring
        System.out.println(name.substring(3));
        System.out.println(name.substring(1,5));
        // replace
        System.out.println(name.replace( 'r','p'));
        System.out.println(name.replace("Har" , "car"));
        // starts with
        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("pit"));
        //charAt
        System.out.println(name.charAt(2));
        //modified ind
        String modifiedName = "harshithit";
        System.out.println(modifiedName.indexOf("s"));
        System.out.println(modifiedName.indexOf("hit",4));
        System.out.println(modifiedName.lastIndexOf("hit", 4));
        //
        System.out.println(name.equals("Harshit"));
        System.out.println(name.equalsIgnoreCase("harshit"));
        //
        System.out.println("I am escape sequence \n double quote");
    }
}