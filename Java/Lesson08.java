class Lesson08 {
  public static void main(String[] args) {
    int[] numbers = {9,15,20,5,7};

    int max = numbers[0];  //最大値に仮の値を入れる
    int min = numbers[0];  //最小値に仮の値を入れる
    int average = 0;      //平均値を計算するための変数

    for (int i = 0; i < numbers.length; i++) {  //配列の要素を順番に処理するためのループ
      if (numbers[i] > max) {   //ifでmaxの値を比べて入れ替える、forでnumbers.length分繰り返す
        max = numbers[i];
      }
      if (numbers[i] < min) {   //ifでminの値を比べて入れ替える、forでnumbers.length分繰り返す
        min = numbers[i];
      }
      average += numbers[i];    //averageにnumbers[i]の値を足していく、forでnumbers.length分繰り返す
    }

    double avg = (double) average / numbers.length;
    //平均値を計算するために、averageをnumbers.lengthで割る。平均値は小数点以下もある可能性があるため、double型にキャストする。

    System.out.println("最大値：" + max);
    System.out.println("最小値：" + min);
    System.out.println("平均値：" + avg);

    System.out.print("平均値以下の数値：");
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] <= avg) {              //平均値以下の値を表示するための条件、forでnumbers.length分繰り返す
        System.out.print(numbers[i] + ",");
      }
    }
    System.out.println();
  }
}