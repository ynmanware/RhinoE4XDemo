import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Map.Entry;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

public class JavaInbuiltRhinoDemo {


  /**
   * Rhino sample using Java inbuilt support for Rhino
   * http://docs.oracle.com/javase/6/docs/technotes/guides/scripting/programmer_guide/
   * 
   * @param args
   * @throws ScriptException
   * @throws FileNotFoundException
   * @throws NoSuchMethodException
   */
  public static void main(String[] args) throws ScriptException, FileNotFoundException,
      NoSuchMethodException {

    // prepare Java Script Engine
    ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
    ScriptEngine javaScriptEngine = scriptEngineManager.getEngineByName("javascript");
    javaScriptEngine.put("out", System.out);

    // read js file
    File jsSourceFile = new File("./findNumbers.js");
    Reader fileReader = new FileReader(jsSourceFile);
    javaScriptEngine.eval(fileReader);

    Invocable invocableEngine = (Invocable) javaScriptEngine;

    // invoke the function from JS file
    ScriptObjectMirror scriptObjectMirror =
        (ScriptObjectMirror) invocableEngine.invokeFunction("findNumbers", "C0nsultt@123");

    System.out.println("Numbers in the given string are: ");
    for (Entry<String, Object> entry : scriptObjectMirror.entrySet()) {
      System.out.println(entry.getValue());
    }
  }
}
