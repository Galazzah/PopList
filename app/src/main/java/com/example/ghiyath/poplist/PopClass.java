package com.example.ghiyath.poplist;

/**
 * Created by Ghiyath on 5/28/2015.
 */
public class PopClass {
    private String stringData;
    private int intData;
    //imageData int must be int reference to image from R.drawables
    private int imageData;


    //Init PopClass instance with 3 required parameters from each ArrayList of data
    public PopClass (String stringData, int intData, int imageData) {
        this.stringData = stringData;
        this.intData = intData;
        this.imageData = imageData;
    }

    //stringData
    public String getStringData() { return stringData; }
    public void setStringData (String stringData ) { this.stringData = stringData; }

    //intData
    public int getIntData() { return intData; }
    public void setIntData (int intData ) { this.intData = intData; }

    //imageData
    public int getImageData() { return imageData; }
    public void setImageData (int imageData ) { this.imageData = imageData; }

}
