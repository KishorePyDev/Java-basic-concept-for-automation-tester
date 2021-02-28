# Collection

The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects. 



<img src="https://miro.medium.com/max/5492/1*xppdneMo3fdisX-T8sEvbQ.png" alt="Data Structures in Java — Collections Framework | by Betül İrem Sedef |  Medium" style="zoom: 25%;" />

| LIST               | SET                  |
| ------------------ | :------------------- |
| Duplicate Value    | Unique Value         |
| Ordered Collection | Unordered Collection |



### **What is Array List in Java?**



![How to use Java Arraylist](https://www.guru99.com/images/Array_list.png)

It can grow as, and when required to accommodate the elements it needs to store and when elements are removed, it can shrink back to a smaller size.

```java
List<String> arrlist = new ArrayList<String>();

arrlist.add("hello");
arrlist.add("human");//output : ["hello","human"]

//remove by element
arrlist.remove("human");//output : ["hello"]
//remove by index
arrlist.remove(2);//output : ["hello"]
```



## Tree Set

return element in sorting order(Ascending)



