package cn.itcast.hibernate.domain;

import java.util.Date;

/**
 * Created by spring on 2017/4/10.
 */
public class User {
    private int id;
    private String name;
    private Date birthday;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
