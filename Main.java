import java.util.Stack;

public class Main {

    public static void main(String[] args){
        Stack<String> prev = new Stack<String>();
        Stack<String> next = new Stack<String>();

        prev.push("www.google.com");
        prev.push("www.drive.com");
        prev.push("www.theodinproject.com");
        prev.push("www.github.com");

        next.push(goBack(prev));
        System.out.println(next);
        System.out.println(prev);
    }

    public static String goBack(Stack<String> prev){
       String prevPg = prev.pop();
       System.out.println("Now rerouting to prev address: " + prevPg);
       return prevPg;
    }

}
