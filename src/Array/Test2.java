package Array;

/**
 * 第二题：
 *  为某个酒店编写程序：酒店管理系统，模拟订房，退房，打印所有房间状态功能。
 *      1.该系统的用户是：酒店前台
 *      2.酒店使用一个二维数组来模拟。   "Room[][] rooms";
 *      3.酒店中的每个房间应该是一个java对象：room
 *      4.每一个房间room应该有：房间编号，房间类型属性，房间是否空闲。
 *      5.系统应该对外提供的功能：
 *          可以预定房间：用户输入房间编号，订房。
 *          可以退房：用户输入房间编号，退房。
 *          可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间的状态。
 */
public class Test2 {
    public static void main(String[] args) {
        Room[][] rooms = new Room[3][8];
        Room room = new Room();
        room.setNo(1);
        room.setType("标间");
        room.setIdle(true);
        System.out.println(rooms[2]);
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class Room{

    //房间编号
    private int no;
    //房间属性类型
    private String type;
    //房间是否空闲  true:空闲   false：不空闲
    private boolean idle;

    public Room() {
    }

    public Room(int no, String type, boolean idle) {
        this.no = no;
        this.type = type;
        this.idle = idle;
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

    public boolean isIdle() {
        return idle;
    }

    public void setIdle(boolean idle) {
        this.idle = idle;
    }
}
