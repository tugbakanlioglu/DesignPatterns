package com.company.StructuralDP.CompositePattern;

import java.util.ArrayList;

public class Directory implements IFile {

    ArrayList<IFile> files = new ArrayList<>();

    public void addFile(IFile file){
        files.add(file);
    }

    @Override
    public int getSize() {
        int size = 0;

        for (IFile file : files) {

            size = size + file.getSize();

        }
        return size;
    }

    @Override
    public String getType() {
        return "directory";
    }
}
