// 関係演算子  二つの値が正しかを比較する
// > より大きい
// < より小さい
// >= より大きいか等しい
// <= より小さいか等しい
// == 等しい
// != 等しくない

// 論理演算子  二つの値が両方とも正しいかを比較する
// && 両方とも正しい
// || どちらかが正しい

// 代入演算子  変数に値を代入する
// = 代入

// 複合代入演算子  変数に値を代入する際に、演算も同時に行う
// += 足す
// -= 引く
// *= 掛ける
// /= 割る
// %= 余剰

// インクリメントとデクリメント
// ++ 増やす
// -- 減らす

class Lesson05 {
  public static void main(String[] args) {
    int x = 10;
    int y = 2;
    int z = 10;
    x++;  // xを1増やす
    y--;  // yを1減らす

    System.out.println(x == y);  // 等しければtrueになるが、xはyと等しくないのでfalseになる
    System.out.println(x != y);  // 等しくなければtrueになるが、xはyと等しくないのでtrueになる

    System.out.println(x >= 5 && x <= 15);  // どちらも正しいのでtrueになる
    System.out.println(y >= 5 && y <= 15);  // どちらも正しくないのでfalseになる

    System.out.println(x == 10 || y == 10);  // 片方が正しいのでtrueになる
    System.out.println(x == 5 || y == 5);  // どちらも正しくないのでfalseになる

    System.out.println(x += 5);
    System.out.println(z += y);

    System.out.println(x);
    System.out.println(y);
  }
}