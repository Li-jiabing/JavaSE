package HashMap;

import java.util.Hashtable;

/**
 * HashTable可以为null吗
 *  HashTable的key和value都不能为null
 *
 *  HashTable的方法都带有synchronized：线程安全的
 *  线程安全有其他方案，这个Hashtable对线程的处理导致
 *  效率较低，使用较少了。
 *
 *  HashTable和HashMap一样，底层都是哈希表数据结构。
 *  HashTable的初始化容量是11，默认加载因子是0.75f
 *  HashTable的扩容是原容量*2+1
 *
 */
public class HashTableTest01 {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put(null,"124");

    }
}
