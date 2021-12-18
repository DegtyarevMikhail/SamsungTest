package com.example.samsungtest;

import android.os.Parcel;
import android.os.Parcelable;

public class Storage implements Parcelable {
    private String txt1 = "";
    private String txt2 = "";

    public Storage(String txt1) {
        this.txt1 = txt1;
    }


    protected Storage(Parcel in) {
        txt1 = in.readString();
        txt2 = in.readString();
    }

    public static final Creator<Storage> CREATOR = new Creator<Storage>() {
        @Override
        public Storage createFromParcel(Parcel in) {
            return new Storage(in);
        }

        @Override
        public Storage[] newArray(int size) {
            return new Storage[size];
        }
    };

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(txt1);
        parcel.writeString(txt2);
    }
}

