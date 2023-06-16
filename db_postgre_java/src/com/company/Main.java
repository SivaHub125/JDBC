package com.company;

import java.sql.Connection;

public class Main {
    public static void main(String[] args)
    {
        Dbfunctions db=new Dbfunctions();
        Connection conn=db.connect_to_db("cal","postgres","password");
        //db.createTable(conn,"employee");
        //db.insert_row(conn,"employee","Ram","Chennai");
        //db.insert_row(conn,"employee","Shiv","Hyderabad");
        //db.insert_row(conn,"employee","Siya","Delhi");
        System.out.println("Before update");
        db.select_row(conn,"employee");
        db.update_row(conn,"employee","Chennai","Tanjore");
        System.out.println("After Update");
        db.select_row(conn,"employee");
    }

}
