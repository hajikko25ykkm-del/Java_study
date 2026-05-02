// 変数は一つの値のみ扱える
// 配列は一つの変数に複数の値を格納できるデータ構造
//   1列の配列を一次元配列
//   2列以上の配列を多次元配列
//   一つのデータはインデックス番号でアクセスできる、0から配置されているので注意

// 配列の書き方は二種類ある
// arrはarrayの略で、配列を表す変数名としてよく使われるもの

// 一つ目の書き方
// データ型[]配列変数名;
// 配列変数名 = new データ型[要素数];

// 二つ目の書き方
// データ型[]配列変数 = {データ1,データ2...};

class Lesson03 {
  public static void main(String[] args) {
    // 1次元配列
    String[] arr;
    arr = new String[3];

    arr[0] = "sato";
    arr[1] = "suzuki";
    arr[2] = "takahashi";

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

      // 2次元配列
    String[][] arr1;
    arr1 =new String[2][2];

    arr1[0][0] = "sato";
    arr1[0][1] = "suzuki";
    arr1[1][0] = "takahashi";
    arr1[1][1] = "tanaka";

    System.out.println(arr1[0][0]);
    System.out.println(arr1[0][1]);
    System.out.println(arr1[1][0]);
    System.out.println(arr1[1][1]);

    // 1次元配列
    String[] arr2 = {"sato", "suzuki", "takahashi"};

    arr2[2] = "tanaka";

    System.out.println(arr2[2]);
    System.out.println(arr2[1]);
    System.out.println(arr2[0]);


    // 2次元配列
    String[][] arr3 = {{"sato", "suzuki"}, {"takahashi", "tanaka"}};

    System.out.println(arr3[0][0]);
    System.out.println(arr3[0][1]);
    System.out.println(arr3[1][0]);
    System.out.println(arr3[1][1]);
  }
}


// Array Index OutOfBounds Exception
// 配列 番号(要素数) 範囲外 例外
// 配列の要素数を超えるインデックス番号にアクセスしようとすると発生するエラー！