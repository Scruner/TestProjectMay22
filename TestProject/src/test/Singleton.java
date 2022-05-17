package test;

public class Singleton {
  private static volatile Singleton instance;

  public static Singleton getInstance() {
    Singleton localInstance = instance;
    if (localInstance == null) { // first check
      synchronized (Singleton.class) {
        localInstance = instance;
        if (localInstance == null) { // second check
          instance = localInstance = new Singleton();
        }
      }
    }
    return localInstance;
  }
}
