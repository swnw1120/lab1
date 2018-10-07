import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!222222222222");
        Scanner s = new Scanner(System.in);
        System.out.println("Name:");
        if (s.hasNextLine()){
          String name = s.nextLine();
          if (name != null){
            System.out.println("Hi, " + name);
          }
        }
        else{
            System.out.println("Hi, Noname");
        }

    }
}
