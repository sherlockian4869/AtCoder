## AtCoder調査まとめ

##### 1,文字列を配列に入れる方法
String word = "あいうえお";
String[] wordList = word.split("");

---

##### 2,long型,double型を超えた型
java.MathのBigIntegerとBigDecimal

---

##### 3,三項演算子
<条件式> ? <trueの時> : <falseの時>

---

##### 4,BigDecimalの切り上げ・切り捨て・四捨五入
参考資料 : https://www.sukerou.com/2018/09/java9bigdecimal.html

---

##### 5,10進数 → 2進数変換
~~~ruby
do {
    if (0 == (num % 2)) { 
        bin = "0" + bin;
    } else {
        bin = "1" + bin;
    }
    num = num / 2;
} while(0 < num);
~~~

---

##### 6,ビット演算子とシフト演算子

https://www.javadrive.jp/start/ope/index8.html

---

##### 7,sortやindexOf()を配列で使いたい時の対応方法

~~~ruby
Integer[] array = new Integer[n];
// index番号を格納
int number = Arrays.asList(array).indexOf(値);
~~~

---

##### 8,ネストしたfor文の中でbreak;したいとき

~~~ruby
myLoop: // ラベルを貼り
for (int i = o, i < 10, i++) {
    for (int j = 0, j < 10, j++) {
        // 処理を書く
        break myLoop; ←これで二つのfor文を抜ける
    }
}
~~~

---

##### 9,配列の要素を比較

~~~ruby
Arrays.equals(配列1, 配列2);
要素数・順番・値が一緒だったらtrueが返される。
~~~

---