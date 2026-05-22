public class Object01 {
  // メンバ変数
  String name;
  int engScore;
  int mathScore;

  // メソッド操作
  void display() {
    System.out.println (name + "さん");
    System.out.println ("英語" + engScore + "点、" + "数学" + mathScore + "点");
  }
  void setScore(int eng, int math) {
    engScore = eng;
    mathScore = math;
  }
  double getAvg() {
    double avg = (engScore + mathScore ) / 2.0; // 2.0で割ることで小数点以下も表示
    return avg;                                 // returnはメソッドの処理結果を呼び出し元に返す
  }
}

/*オブジェクト指向、設計書と実行を分ける
修正や機能追加がらくちん、情報ごとにクラス分けしてるので処理が早い*/

// 引数はメソッドに渡す値
// voidは返り値がない、持っているデータを表示する

// 戻り値はメソッドの処理結果を呼び出し元に返す値（return）