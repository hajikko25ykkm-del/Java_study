// 整数はint型、文字列はString型、真偽値はboolean型など、データの種類を表すものを「データ型」と呼ぶ
// 変数はデータを格納するための入れ物
// 変数を宣言するには、データ型と変数名を指定
// 変数名は、英字、数字、アンダースコア（_）、ドルマーク（$）を使用できる
// 大文字、小文字は区別される

// 先頭が数字、上記以外の記号は変数名として使用できない
// 予約語も使用できない 役割の決まった変数(return, for, while, class, public など)

class Lesson01 {
  public static void main(String[] args) {
    int var = 1;
    int var01 = 2;
    int var_01 = 3;
    int var$01 = 4;
    int VAR = 5;
    int Var = 6;
    // int var-01 = 1;
    // int 01var = 1;

    System.out.println(var);
    System.out.println(var01);
    System.out.println(var_01);
    System.out.println(var$01);
    System.out.println(VAR);
    System.out.println(Var);
    // System.out.println(var-01);
    // System.out.println(01var);
  }
}

// javac Lesson01.java コンパイル
// java Lesson01 実行