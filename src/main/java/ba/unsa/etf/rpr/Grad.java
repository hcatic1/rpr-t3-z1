package ba.unsa.etf.rpr;

enum Grad{
    TRAVINIK(30), ORAŠJE(31), ZENICA(32), SARJAJEVO(33), LIVNO(34), TUZLA(35), MOSTAR(36), BIHAĆ(37), GORAŽDE(38), ŠIROKIBRIJEG(39), BRČKO(49);
    private int numVal;
    Grad(int numVal) {
        this.numVal = numVal;
    }
    public int getNumVal(){
        return numVal;
    }
};