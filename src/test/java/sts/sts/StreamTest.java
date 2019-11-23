/*
 * aspire-tech.com Inc.
 * Copyright (c) 2000-2019 All Rights Reserved.
 */
package sts.sts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1
 *
 * @author Admin
 * @version $id:StreamTest.java, v 1 2019/11/11 12:20:27, Admin Exp $
 */
public class StreamTest {

    public static void main(String[] arg) {


        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < 6; i++) {

            Student student = new Student();

            student.setId("id-" + i);
            student.setName("name-" + i);
            student.setHobby("booty-" + i + "," +
                    "booty-two-" + i + "," + "booty-three" + i + "," + "booty-four" + i);

            studentList.add(student);

        }


        System.out.println(studentList);
        System.out.println("=====================================");

        List<StudentVO> StudentVOs = studentList.stream().map(e -> {
            StudentVO studentVO = new StudentVO();
            studentVO.setId("vo" + e.getId());
            studentVO.setName("vo" + e.getName());
            studentVO.setHobbys(Arrays.asList(e.getHobby().split(",")));
            return studentVO;

        }).collect(Collectors.toList());

        System.out.println(StudentVOs);


    }
}
