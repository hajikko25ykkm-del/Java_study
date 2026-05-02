// データ型 (整数int, 少数double, ブール型boolean, 文字列String など)

// 整数
// byte -100~100
// short -3万~3万
// int -20億~20億
// long -9000兆~9000兆,京の桁以上（最後にLを付ける）

// 少数
// float(単精度、最後にFを付ける)
// double(floatの倍の精度)

// 文字
// char 文字一つ（''で囲む）
// String 文字二つ以上（""で囲む）

// ブール型
// boolean trueかfalseのどちらか、真偽、0,1のようなもの

class Lesson02 {
  public static void main(String[] args) {
    byte var01 = 1;
    short var02 = 12345;
    int var03 = 1234567890;
    long var04 = 123456789000L;

    double var05 = 1.23456789;
    float var06 = 1.234F;

    char var07 = 'c';
    String var08 = "Hello World!";

    int var_a = 10;
    int var_b = 1;
    boolean var_bool;

    var_bool = (var_a < var_b);

    System.out.println(var01);
    System.out.println(var02);
    System.out.println(var03);
    System.out.println(var04);

    System.out.println(var05);
    System.out.println(var06);

    System.out.println(var07);
    System.out.println(var08);

    System.out.println(var_bool);
  }
}