package org.rplbo.utsnota;

public class Item {
    default KertasHVS[] krhvs;
    default BukuTulis[] bktulis;
    default Pulpen[] pen;

    public Item(KertasHVS[]){

    }

    public Item(BukuTulis[]){

    }

    public Item(Pulpen[]){

    }

    public Item(BukuTulis[],Pulpen[]){

    }

    public Item(KertasHVS[],Pulpen[]){

    }

    public Item(BukuTulis[],KertasHVS[]){

    }

    public Item(BukuTulis[],KertasHVS[],Pulpen[]){

    }

    public int getJumlahBukuTulis(){

    }

    public int getJumlahPen(){

    }

    public Pulpen[] getPen(){

    }

    public int getJumlahKertasHVS(){

    }

    public BukuTulis[] getBktulis(){

    }

    public KertasHVS[] getKrhvs(){

    }
}
