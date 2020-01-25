public class stringreverse
{
    public static void main(String[] args) {
        String a ="welcome";
        String revrse ="  ";
        for(int i=a.length()-1;i>=0;i--)
        {
            revrse = revrse + a.charAt(i);

        }
        System.out.println("_______reverse string____________\n");
        System.out.println(revrse);
    }
}
