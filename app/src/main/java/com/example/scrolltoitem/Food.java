package com.example.scrolltoitem;

public class Food {
    public static final int TYPE_CAFE=1;
    public static final int TYPE_TRASUA=2;
    public static final int TYPE_SUACHUA=3;

    private int img;
    private String name;
    private int type;

    public Food(int img, String name, int type) {
        this.img = img;
        this.name = name;
        this.type = type;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
