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

