import java.util.Scanner;
class StringBuilder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        sb.append("hello bro");
        sb.insert(5, "good boy");
        sb.replace(0, 2, "sc");
        sb.delete(1,3);
        sb.reverse();
        String ss=sb.toString();
        System.out.println(ss);

        
    }
}