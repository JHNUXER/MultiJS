package multijs;

import javax.script.*;

public class JSInterpreter {
  public Thread startJSThread(String[] file) {
    String conc_finl = "";
    for (int i = 0; i < file.length; i++) {
      conc_finl += file[i];
    }
    ScriptEngine engine = new ScriptEngineManager().getEngineByName("Javascript");
    return new Thread(new Runnable() {public void run() {engine.eval(conc_finl)});
  }
}
