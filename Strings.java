
/**
 * Write a description of class RenameThisClass here.
 *
 * @author Aidan Henss
 * @version 9/26/22
 */
public class RenameThisClass
{
    /**
     * Method main
     *
     * @param args A parameter
     */
    public static void main(String[] args) {
        int i;
        double f = 2.5;
        boolean flag= true;
        i=10;
        f=i+f;
        flag=false;
        i++;

        System.out.println(Integer.toString(i));
        System.out.println(Double.toString(f));
        System.out.println(Boolean.toString(flag));

        String str1= "I am a string";
        String str2 = str1;
        String str3 = "I am also a string";
        Boolean stringsEqual = str1.equals(str2);
    }
}
