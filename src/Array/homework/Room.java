package Array.homework;

/**
 * 酒店房间
 */
public class Room extends Object{

    /**
     *  房间编号
     *  1楼：101，102，103...
     *  2楼：201，202，203...
     *  3楼：301，302，303...
     *  ...
     */
    private int no;

    //房间类型:标准间，单人间，总统套房
    private String type;

    //房间是否空闲，状态
    //true表示空闲，房间可以被预定
    //false表示占用，房间不能被预定
    private boolean status;

    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //equals方法重写
    //equals是用来比较连个对象是否相同的。
    //至于怎么比较，这个还是程序员自己定
    //你认为两个房间的编号相同，就表示同一个房间，那么你写代码比较房间编号就行
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Room)) return false;
        if (this == obj) return true;
        Room room = (Room) obj;
        //当前房间编号等于传过来的房间对象的房间编号。认为是同一个房间。
        return this.getNo() == room.getNo();
    }


    //toString方法重写
    //toString方法的目的就是将java对象转换成字符串形式
    //怎么转，转换成什么格式，程序员自己定。目的就是简单，清晰明了
    //我不要看对象内存地址。我要看具体的信息
    public String toString() {
//        return "[101,单人间，空闲]";
        //动态(把一个变量塞到一个字符串当中，口诀：加一个双引号，双引号中间加两个加号，两个加号中间加变量名)
        return "["+no+","+type+","+(status ? "空闲":"占用")+"]";
    }

    //编写一个临时程序测试一下
    //一会可以删除这个main方法
    public static void main(String[] args) {
        Room room = new Room(101,"单人间",false);
        //room是一个引用，println输出引用的时候会自动调用引用的toString方法。
        System.out.println(room.toString());
        System.out.println(room);

        Room room1 = new Room(101,"单人间",false);
        System.out.println(room.equals(room1));
    }
}
