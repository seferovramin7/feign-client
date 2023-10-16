package com.example.demo.copartDto;

import java.util.ArrayList;

public class CopartRoot {
    public int size;
    public int page;
    public ArrayList<CopartCar> data;


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public ArrayList<CopartCar> getData() {
        return data;
    }

    public void setData(ArrayList<CopartCar> data) {
        this.data = data;
    }
}
