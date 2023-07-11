## 设计模式
#### 1. 迭代器模式
##### 1.1 迭代器模式有什么用
简化操作者使用，操作者遍历整个集合不再需要了解内部具体的数据结构，如数组和链表的遍历肯定是不一样的。
只需要集合内部提供hasNext()和next()的实现，使用者便可以简单遍历整个集合。

##### 1.2 java中的迭代器模式

`Collection`接口继承了`Iterable`接口，并且指定了抽象方法`Iterator<E> iterator();` 因此，所有实现`Collection`的集合类（`List`、`Set`）都需要指定各自的迭代器。

拿`ArrayList`举例，在`ArrayList`中，有一个普通的迭代器`Itr`，`ArrayList`在`Itr`中给出了`hashNext()`与`next()`方法的实现，因此我们无需关系ArrayList底层存储数据的究竟是数组还是链表。当然`ArrayList`还提供了一个功能更加强大的`ListItr`,本质上与`Itr`是一样的。

##### 1.3 小结

迭代器模式较为简单，它将集合对象的遍历功能从集合对象中分离出来，外部使用者可以透明访问集合内部数据，但也因此导致了类个数的增加。
