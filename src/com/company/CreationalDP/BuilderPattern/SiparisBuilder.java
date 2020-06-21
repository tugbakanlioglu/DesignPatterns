package com.company.CreationalDP.BuilderPattern;

public abstract class SiparisBuilder {

    private Araba araba = null;

    public SiparisBuilder() {
    }

    public Araba getAraba(){
        if(araba==null){
            araba=  new Araba();
        }
        return araba;
    }

    public abstract void setMarka(String marka);
    public abstract void setModel(String model);
    public abstract void setRenk(String renk);
    public abstract void setBeygirGucu(int beygirGucu);
}
