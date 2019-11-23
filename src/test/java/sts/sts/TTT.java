/*
 * aspire-tech.com Inc.
 * Copyright (c) 2000-2019 All Rights Reserved.
 */
package sts.sts;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 1
 *
 * @author Admin
 * @version $id:TTT.java, v 1 2019/11/9 17:03:27, Admin Exp $
 */
public class TTT {

    public static  void  main(String[] arg){
        Date date= new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.DATE,-1);


        date=calendar.getTime();

        System.out.println("date:"+date);

    }}
