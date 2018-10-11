package com.raaziatariq.demorecyclerview;

/**
 * Created by Raazia Tariq on 10/11/2018.
 */

public class HorizontalModel {

    private int images;
    private String title;
    private String desc;
    private String pubDate;
    public HorizontalModel() {

    }

    public HorizontalModel(int images, String title, String desc, String pubDate) {
        this.images = images;
        this.title = title;
        this.desc = desc;
        this.pubDate = pubDate;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
