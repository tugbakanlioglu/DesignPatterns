package com.company.CompositePattern;

public class TextFile implements IFile {

    private int size ;
    private String type;

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
