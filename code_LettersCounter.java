import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        System.out.println("Hey! Write something and I'll tell you how many letters it has ;)");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toLowerCase();
        int count;
        for (int i =97; i<123; i++)
        {
            count = 0;
            for (int j = 0; j<str.length(); j++)
            {
                if (str.charAt(j)==(char)i)
                {
                    count ++;
                }
            }
            if(count>0)
            {
                System.out.println("#" + (char)i+ " " + count);
            }
        }
    }
}
