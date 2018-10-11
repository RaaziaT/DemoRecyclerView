package com.raaziatariq.demorecyclerview;

/**
 * Created by Raazia Tariq on 10/11/2018.
 */

public class VerticalModel {

    private String header, subHeader;
    private int image;

    public VerticalModel( ) {

    }

    public VerticalModel(String header, String subHeader, int image) {
        this.header = header;
        this.subHeader = subHeader;
        this.image = image;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getSubHeader() {
        return subHeader;
    }

    public void setSubHeader(String subHeader) {
        this.subHeader = subHeader;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
