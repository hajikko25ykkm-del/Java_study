public class Object02 {
  public static void main(String[] args) {
    Object01 obj1 = new Object01();
    Object01 obj2 = new Object01();

    obj1.name = "田中";
    obj2.name = "山田";
    obj1.setScore(90, 80);
    obj2.setScore(65, 70);
    
    obj1.display();
    System.out.println("平均" + obj1.getAvg() + "点");
    obj2.display();
    System.out.println("平均" + obj2.getAvg() + "点");
  }
}

// コンパイルはメインメソッドが含まれているクラスを指定する
// 設計図の方は一緒にコンパイルしてもらえるので、分けてコンパイルしなくてよい！
