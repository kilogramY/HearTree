package com.example.zingzing.heartree;

import android.graphics.Bitmap;

/**
 * Created by zingzing on 2015-08-06.
 */
public class node {
    int date;
    String content;
    //Bitmap photo;
    node next;

    /*public Node () {
        date=0;
        content="";
        photo=null;
        next=null;
    }*/

    public void setDate(int date){
        this.date = date;
    }

    public void setContent(String content){
        this.content = content;
    }

   /* public void setPhoto(Bitmap photo){
        this.photo = photo;
    }*/

    public void setNext(node next){
        this.next = next;
    }
}