package maven-quick-start;

 /* Hello world!
 */
import java.util.ArrayList;
import java.util.List;

public class App {
 public void greet (){
    List<String> greetings = new ArrayList<>();
    greetings.add("Hello");

    for (String greeting : greetings) {
      System.out.println("inside Application");
    }
 }
  public static void main( String[] args ){

        System.out.println( "Hello World!" );
    }
}
