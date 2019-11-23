/*
 * aspire-tech.com Inc.
 * Copyright (c) 2000-2019 All Rights Reserved.
 */
package sts.sts;

/**
 * 1
 *
 * @author Admin
 * @version $id:Student.java, v 1 2019/11/11 12:20:58, Admin Exp $
 */
public class Student {

    private  String id;

    private  String  name;

    private  String  hobby;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
