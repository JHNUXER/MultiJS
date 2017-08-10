package multijs;

import javax.script.*;

public class JSThread extends Thread implements Runnable {
  public ScriptEngine engine;
  public String fl;
  
  public JSThread(String[] jsFile) {
    engine = new ScriptEngineManager().getEngineByName("Javascript");
    fl = "";
    for (int i = 0; i < file.length; i++) {
      fl += file[i];
    }
  }
  public Thread startJSThread(String[] file) {
    String conc_finl = "";
    for (int i = 0; i < file.length; i++) {
      conc_finl += file[i];
    }
    return new Thread(new Runnable() {public void run() {engine.eval(conc_finl)});
  }
  @Override
  public void run() {
    engine.eval(fl);
  }
}
