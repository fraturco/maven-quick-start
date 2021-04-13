/*  package maven-quick-start;


 * Hello world!
 *

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}*/

package clinic.programming.training;

public class Application {

    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
    }
}
