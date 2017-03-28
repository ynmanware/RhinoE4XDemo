import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;

public class E4XRhinoDemo {

  /**
   * Simple Rhino demo which uses Rhino Jar downloaded from :
   * https://developer.mozilla.org/en-US/docs/Mozilla/Projects/Rhino/Download_Rhino
   * https://developer.mozilla.org/en-US/docs/Mozilla/Projects/Rhino/Documentation
   * https://developer.mozilla.org/en-US/docs/Archive/Web/E4X/Processing_XML_with_E4X
   * 
   * @throws IOException
   * 
   * 
   */
  public static void main(String[] args) throws IOException {

    Context mozillaJsContext = Context.enter();
    Scriptable scriptable = mozillaJsContext.initStandardObjects();

    String javaScripCode = new String(Files.readAllBytes(Paths.get("./playwithXML.js")));

    Script compiledScript = mozillaJsContext.compileString(javaScripCode, "DemoScript", 1, null);

    /* Result is a Javascript Object */
    Object ResultObject = compiledScript.exec(mozillaJsContext, scriptable);
    String result = Context.toString(ResultObject);
    System.out.println("Outcome of execution of java script is: \n" + result);
  }

}
