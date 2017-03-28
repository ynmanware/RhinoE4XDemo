import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 */
public class JavaInbuiltRhinoSimpleDemo {

  /**
   * @param args
   * @throws ScriptException
   */
  public static void main(String[] args) throws ScriptException {

    ScriptEngineManager factory = new ScriptEngineManager();
    ScriptEngine jsEngine = factory.getEngineByName("javascript");

    String source = "{a :{10*30}}";
    Object result = jsEngine.eval(source);
    System.out.println("Outcome of execution of java script is: " + result);
  }
}
