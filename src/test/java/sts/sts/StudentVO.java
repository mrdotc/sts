/*
 * aspire-tech.com Inc.
 * Copyright (c) 2000-2019 All Rights Reserved.
 */
package sts.sts;

import java.util.List;

/**
 * 11
 *
 * @author Admin
 * @version $id:StudentVO.java, v 11 2019/11/11 12:38:36, Admin Exp $
 */
public class StudentVO {

    private  String id;

    private  String  name;

    private List<String> hobbys;


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

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    @Override
    public String toString() {
        return "StudentVO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", hobbys=" + hobbys +
                '}';
    }
}
