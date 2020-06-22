package com.company.StructuralDP.FlyWeightDesignPattern;

public class Main {
    public static void main(String[] args) {

        Piece piece = null;

        for (int i = 0  ; i<20; i++) {
            int a = i%3;
            if(a==0){
                piece = PiecesFactory.getPiece("I");
                piece.create("red",i*3,true);
            }else if (a==1){
                piece = PiecesFactory.getPiece("J");
                piece.create("blue",i*3,false);

            }else if (a==2){
                piece = PiecesFactory.getPiece("T");
                piece.create("yellow",i*3,true);

            }

        }
    }
}
