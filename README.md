# AtCoder 調査まとめ

#### 参考資料

[java コード入門](https://java-code.jp/)

## 1,文字列を配列に入れる方法

String word = "あいうえお";
String[] wordList = word.split("");

## 2,long 型,double 型を超えた型

java.Math の BigInteger と BigDecimal

## 3,三項演算子

<条件式> ? <true の時> : <false の時>

## 4,BigDecimal の切り上げ・切り捨て・四捨五入

参考資料 : https://www.sukerou.com/2018/09/java9bigdecimal.html

## 5,10 進数 → 2 進数変換

```ruby
do {
    if (0 == (num % 2)) {
        bin = "0" + bin;
    } else {
        bin = "1" + bin;
    }
    num = num / 2;
} while(0 < num);
```

## 6,ビット演算子とシフト演算子

https://www.javadrive.jp/start/ope/index8.html

## 7,sort や indexOf()を配列で使いたい時の対応方法

```ruby
Integer[] array = new Integer[n];
// index番号を格納
int number = Arrays.asList(array).indexOf(値);
```

## 8,ネストした for 文の中で break;したいとき

```ruby
myLoop: // ラベルを貼り
for (int i = o, i < 10, i++) {
    for (int j = 0, j < 10, j++) {
        // 処理を書く
        break myLoop; ←これで二つのfor文を抜ける
    }
}
```

## 9,配列の要素を比較

```ruby
Arrays.equals(配列1, 配列2);
要素数・順番・値が一緒だったらtrueが返される。
```

## 10,様々な進数から 10 進数に直す方法

```ruby
String strNumber = "進数";
int intNumber = Integer.parseInt(strNumber, 進数)
```

## 11,charAt メソッド

文字列から n 番目の文字列を抜き出すには、charAt メソッドを利用する

```ruby
public class StrCharAt {
  public static void main(String[] args) {
    String str = "こんにちは、世界！";
    System.out.println(str.charAt(3));  // 結果：ち
  }
}
```

## 12,substring メソッド

substring メソッドを利用することで、文字列の begin+1 ～ end 文字目をぬきだすことができる

```ruby
package com.example.mynavi.string;

public class StrSubstring {
  public static void main(String[] args) {
    String str = "Good Morning Everyone.";
    System.out.println(str.substring(5));   // 結果：Morning Everyone.
    System.out.println(str.substring(5, 12));   // 結果：Morning
  }
}
```

## 13,0 埋め

数値を 0 埋めする方法

```ruby
String.format(書式文字列, 値)
String.format("%04d", 4)
```

出力結果は

'''
0004
'''
