package com.company.CreationalDP.BuilderPattern;

public class SiparisManager {
    SiparisBuilder builder;

    public Araba createOrder (String marka, String model, String renk , int beygirGucu){
        if (marka.equals("Ford")){
            builder = new FordSiparisBuilder();
        }else if (marka.equals("Audi")){
            builder = new AudiSiparisBuilder();
        }
        builder.setBeygirGucu(beygirGucu);
        builder.setMarka(marka);
        builder.setModel(model);
        builder.setRenk(renk);

        return builder.getAraba();
    }


    public void printOrder(){
        System.out.println("Marka "+builder.getAraba().getMarka());
        System.out.println("Model "+builder.getAraba().getModel());
        System.out.println("Renk "+builder.getAraba().getRenk());
        System.out.println("Beygir Gucu "+builder.getAraba().getBeygirGucu());
    }
}
