package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历
 */
public class MapTest02 {
    public static void main(String[] args) {
        //第一种方式：获取所有的key，通过遍历key，来获取value
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"wangwu");
        map.put(3,"lisi");
        map.put(4,"zhaoliu");
        //遍历map集合
        //现获取所有的key
/*        Set<Integer> keys = map.keySet();
        //遍历key，通过key获取value
        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()){
            //取出其中一个key
            Integer key = iterator.next();
            //通过key获取value
            String value = map.get(key);
            System.out.println(key+"="+value);
        }*/

        //Set集合中元素的类型是：Map.Entry
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        //遍历Set集合，每一次取出一个Node
        //迭代器
        /*Iterator<Map.Entry<Integer,String>> iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> node = iterator.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key+"="+value);
        }*/

        //foreach
        //这种方式效率比较高，因为获取key和value都是直接从node对象中获取的属性值
        //这种方式比较适合于大数据量
        for (Map.Entry<Integer,String> node : set) {
            System.out.println(node.getKey()+"-->"+node.getValue());
        }
    }
}
