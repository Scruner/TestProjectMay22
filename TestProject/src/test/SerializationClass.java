package test;

import java.io.*;

public class SerializationClass implements Serializable {
  private static final long serialVersionUID = 1L;

  private String[] territoriesInfo;
  private String[] resourcesInfo;
  private String[] diplomacyInfo;

  public SerializationClass(
      String[] territoriesInfo, String[] resourcesInfo, String[] diplomacyInfo) {
    this.territoriesInfo = territoriesInfo;
    this.resourcesInfo = resourcesInfo;
    this.diplomacyInfo = diplomacyInfo;
  }

  public static void main(String[] args) throws IOException {
    // создаем наш объект
    String[] territoryInfo = {
      "У Испании 6 провинций", "У России 10 провинций", "У Франции 8 провинций"
    };
    String[] resourcesInfo = {"У Испании 100 золота", "У России 80 золота", "У Франции 90 золота"};
    String[] diplomacyInfo = {"Франция воюет с Россией, Испания заняла позицию нейтралитета"};

    SerializationClass saveGame =
        new SerializationClass(territoryInfo, resourcesInfo, diplomacyInfo);

    File fileName =
        new File("C:\\Users\\aoved\\IdeaProjects\\TestProject" + "\\src\\test\\fileSerial.txt");
    FileOutputStream outputStream = new FileOutputStream(fileName);
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
    objectOutputStream.writeObject(fileName);
    outputStream.close();
    objectOutputStream.close();
  }
}
