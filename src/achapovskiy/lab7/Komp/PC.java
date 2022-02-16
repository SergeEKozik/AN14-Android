package achapovskiy.lab7.Komp;

public class PC {
    public String proccesor;
    public int ram;
    public int hd;
    public int resursOfCicle;

    public PC(String proccesor, int ram, int hd, int resursOfCicle){
        this.proccesor=proccesor;
        this.ram = ram;
        this.hd = hd;
        this.resursOfCicle = resursOfCicle;
    }

    public String getPCproc() {
        return proccesor;
    }
    public int getPCram() {
        return ram;
    }
    public int getPChd() {
        return hd;
    }

    public void turnOnPC(ITurnON object){
        if(object.guessTheNumber()){
            object.pcSwitchOf();
        }
        else{
            object.pcBurnedDown();
        }

    }





}
