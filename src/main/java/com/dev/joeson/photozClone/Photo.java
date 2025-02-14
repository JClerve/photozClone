package com.dev.joeson.photozClone;

public class Photo {
    private String ID;
    private String fileName;


    public Photo(String ID, String fileName) {
        this.ID = ID;
        this.fileName = fileName;
    }

    public String getID() {
        return ID;
    }

    // Raw Data
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
