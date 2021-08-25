package Collection;


import java.util.HashMap;
import java.util.Map;

/**
 * java.util.map接口中常用的方法
 *  1.Map和Collection没有继承关系
 *  2.Map集合以key和value的方式存储数据：键值对
 *      key和value都是引用数据类型
 *      key和value都是存储对象的内存地址
 *      key起到主导地位，value是key的一个附属品。
 *
 *  3.Map方法中常用方法：
 *      void clear()
 *      boolean containsKey(Object key)
 *      boolean containsValue(Object value)
 *      V get(Object key)
 *      boolean isEmpty()
 *      Set<K> keySet()
 *      V put(k key,v value)
 *      v remove(Object key)
 *      int size()
 *      Collection<V> values()
 *      Set<Map.Entry<K,V>> entrySet()
 */
public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        //V put(k key,v value)
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"zhaoliu");

        //V get(Object key)
        //通过key获取value
        System.out.println(map.get(1));

        //获取键值对的数量
        System.out.println("存储键值对的数量:"+map.size());

        //通过key删除value
        map.remove(1);
        System.out.println("存储键值对的数量:"+map.size());

        System.out.println(map.isEmpty());

        //判断map中是否包含某个key
        //contains方法底层调用的都是equals进行对比的，所以自定义的类型需要重写equals方法
        System.out.println(map.containsKey("1"));

        //判断是否包含某个value
        System.out.println(map.containsValue("lisi"));

        //获取map集合所有的key
        System.out.println(map.keySet());

        //获取map集合所有的value，返回一个Collection
        System.out.println(map.values());

        //将map集合转换成set集合
        System.out.println(map.entrySet());

        //清空map集合
        map.clear();

        System.out.println(map.size());
    }
}
