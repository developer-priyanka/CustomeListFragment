package my.assignment.customelistfragment;

/**
 * Created by root on 8/31/16.
 */

public class Item {
    String name;
    String desc;
    int id;

    public Item(String name,String desc,int id){
        this.name=name;
        this.desc=desc;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
