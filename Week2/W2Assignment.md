### AppWorks School Android Class Remote Assignment W2

##### 1.What is **Inheritance**? Try to explain in Mandarin

當某些物件的特徵是可以被共用的時候（Ex. 人類的特徵是已知用火，若小明為“台灣人”則意味著小明也要會用火）與其重複宣告，我們便可以用繼承。在 Class 內的參數(特徵)可以被其他的子類 Class繼承，但在 Kotlin 內的預設值為非開放，所以若要進行繼承則需要先在宣告時將其開放"open"才可以讓其他子 Class 繼承。

##### 2.How to ​**split​** a string in Android? Explain your understanding, and even better to attach some sample code.

When a string is input, take DATE as an example: 2020/4/26, when the string is input it has only a variable, however we may need Year, Month, Date. With "split" we are able to achieve that, by separating the symbol "/", the out put would be (2020,4,26)

fun main() {
  val str = "DATE = 2020/4/26"

  val separate2 = str.split("/").map { it.trim() }
  println(separate2)
}

##### 3.What kind of ​**key-value**​ pair collection we use in Android? Attach a sample code that usefor-loop to print each key-value pair. 

    val x = Pair(listOf("one", "two", "three"), listOf("x", "y", "z"))
    for (i in 0..x.first.size) {
        println("${x.first[i]}:${x.second[i]}")


##### 4.What’s the ​**difference**​ between ArrayList and LinkedList? Try to explain in Mandarin.

ArrayList 是使用數組的方式呈現，而 LinkedList 則是使用鍊表的方式呈現（有頭尾），並且在使用差異上大多都是以查詢及刪減為主，在查詢上，因為 LinkedList 需要從頭或從尾開始做查詢，所以比較慢，而 Arraylist 則可以直接使用組數的位置進行查詢，所以比較快。在刪減上，LinkedList 直接將指針指到相對應得位置就可以直接進行刪除，而 Arraylist 則必須要將所有組數重新的 Index 重新編輯以達到刪除效果。

##### 5.What are ​**Value Type**​ variables? List out the Value Type variables you know.

A data type which holds content in its memory, meaning the variables directly contain their value. Int I= 100

##### 6.What’s the **​maximum**​ value of **​Int**​? If you want to represent integers larger than the limit, what should you do instead of using int variables?

The maximum value of Int is 2137483647
To able to represent integers above the limit, we should use the value of "Long"

	

