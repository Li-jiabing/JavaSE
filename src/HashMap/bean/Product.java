package HashMap.bean;

public class Product {
    private int no;
    private String name;

    public Product() {
    }

    public Product(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //重写hashcode+equlas
    //假设业务要求：商品编号相同，并且商品名字一样，表示同一个商品

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (no != product.no) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result = no;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
