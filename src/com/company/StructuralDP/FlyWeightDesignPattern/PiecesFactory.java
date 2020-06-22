package com.company.StructuralDP.FlyWeightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class PiecesFactory {
    private final static Map<String,Piece> pieces = new HashMap<>();

    public static Piece getPiece(String pieceType){
        Piece piece = null;
        if (pieces.get(pieceType) != null){
            piece =  pieces.get(pieceType);
        }else{
            if(pieceType.equalsIgnoreCase("I")){
                piece = new I();
            }else if (pieceType.equalsIgnoreCase("J")){
               piece = new J();
            }else if(pieceType.equalsIgnoreCase("T")){
                piece = new T();
            }
        }
        pieces.put(pieceType,piece);

        return piece;
    }
}
