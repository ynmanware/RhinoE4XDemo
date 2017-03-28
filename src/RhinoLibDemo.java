import org.mozilla.javascript.Context;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;

public class RhinoLibDemo {

  /**
   * Simple Rhino demo which uses Rhino Jar downloaded from :
   * https://developer.mozilla.org/en-US/docs/Mozilla/Projects/Rhino/Download_Rhino
   * 
   * 
   */
  public static void main(String[] args) {

    Context mozillaJsContext = Context.enter();
    Scriptable scriptable = mozillaJsContext.initStandardObjects();

    String javaScripCode = "{a :{5*6}}";
    Script compiledScript =
 mozillaJsContext.compileString(javaScripCode, "DemoScript", 1, null);

    /* Result is a Javascript Object */
    Object ResultObject = compiledScript.exec(mozillaJsContext, scriptable);
    String result = Context.toString(ResultObject);
    System.out.println("Outcome of execution of java script is: " + result);
  }

}
