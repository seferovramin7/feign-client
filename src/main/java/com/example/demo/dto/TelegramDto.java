package com.example.demo.dto;

import java.util.ArrayList;

public class TelegramDto {
    public boolean ok;
    public ArrayList<Result> result;


    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public ArrayList<Result> getResult() {
        return result;
    }

    public void setResult(ArrayList<Result> result) {
        this.result = result;
    }
}
