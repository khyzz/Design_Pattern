package iterator;

/**
 * @Description : 迭代器顶层接口，返回一个特定集合的迭代器
 * @Author:
 */
public interface MyIterator<E> {
    boolean hasNext();

    E next();
}
