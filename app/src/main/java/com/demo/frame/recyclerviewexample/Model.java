package com.demo.frame.recyclerviewexample;


public class Model {
    private String name;  // for showing os name in layout_android_list textview
    private int image;    // for showing image

    public Model(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
