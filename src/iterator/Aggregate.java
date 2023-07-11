package iterator;

/**
 * @Description: 集合的顶层接口（类似于Collection）
 * @Author:
 */
public interface Aggregate<E> {

    /**
     * 返回迭代器
     */
    MyIterator<E> iterator();
}
