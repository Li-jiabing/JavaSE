package Collection;

import java.util.TreeSet;

public class TreeSetTest03{
        public static void main(String[] args) {
            Customer c1 = new Customer(32);
            Customer c2 = new Customer(20);
            Customer c3 = new Customer(30);
            Customer c4 = new Customer(25);

            TreeSet<Customer> customers = new TreeSet<>();
            customers.add(c1);
            customers.add(c2);
            customers.add(c3);
            customers.add(c4);
            for (Customer customer : customers
            ) {
                //此处出现异常：java.lang.ClassCastException
                //出现这个异常的原因是没有实现"java.lang.Comparable"这个接口
                System.out.println(customer);
            }
        }
    }

    class Customer implements Comparable<Customer>{
        int age;

        public Customer() {
        }

        public Customer(int age) {
            this.age = age;
        }

        //需要在这个方法中编写比较的逻辑，活着说比较的规则，按照什么进行比较！
        //k.compareTo(t.key)
        //拿着参数k和集合中的每个k进行比较，返回值可能是>0 、<0、=0
        //比较规则最终还是由程序员指定的：例如按照年龄升序或者按照年龄降序
        @Override
        public int compareTo(Customer c) {//c1.compareTo(c2)
            //this就是c1
            //c是c2
            //c1和c2比较的时候，就是this和c比较。
//            int age1 = this.age;
//            int age2 = c.age;
//            if (age1 == age2){
//                return 0;
//            }else if(age1>age2){
//                return 1;
//            }else {
//                return -1;
//            }
            return c.age - this.age;
        }

        //重写toString()方法
        @Override
        public String toString() {
            return "Customer{" +
                    "age=" + age +
                    '}';
        }
    }