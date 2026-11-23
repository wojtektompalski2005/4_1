public class Student {

  private String Name;
  private int Age;
  private int IndexNumber;

  public Student(String name, int age, int indexNumber) {
    Name = name;
    Age = age;
    IndexNumber = indexNumber;
  }

  public String GetName() { return Name; }
  public int GetAge() { return Age; }
  public int GetIndexNumber() { return IndexNumber; }

  public String ToString() {
    return Name + " " + Integer.toString(Age) + " " + Integer.toString(IndexNumber);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if (data.length != 3) 
      return new Student("Parse Error", -1, -1);
    return new Student(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
  }
}