package ads.poo;

public class Horario {


    private int hr;
    private int min;
    private int seg;
    
    private final String[] hrE = {  "zero", "uma", "duas", "tres", "quatro", "cinco", "seis", "sete", "oito", 
                                    "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove", "vinte", 
                                    "vine e um", "vinte e dois", "vinte e três", "vinte e quatro" };
    
    private final String[] minesegE = { "zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", 
                                    "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove",};

    private final String[] dezennasE = { "vinte", "trinta", "quarenta", "cinquenta"};
 
    public Horario() {
        this.hr = 0;
        this.min = 0;
        this.seg = 0;
    }

    public Horario(int hr) {
        if(hr >= 0 && hr < 24) {
            this.hr = hr;
        } else {
            this.hr = 0;
            this.min = 0;
            this.seg = 0;
        }
    }

    public Horario(int hr, int min) {
        if(hr >= 0 && hr < 24 && min >= 0 && min < 60) {
            this.hr = hr;
            this.min = min;
        } else {
            this.hr = 0;
            this.min = 0;
            this.seg = 0;
        }

    }

    public Horario(int hr, int min, int seg) {
        if(hr >= 0 && hr < 24 && min >= 0 && min < 60 && seg >= 0 && seg < 60) {
            this.hr = hr;
            this.min = min;
            this.seg = seg;
        } else {
            this.hr = 0;
            this.min = 0;
            this.seg = 0;
        }
    }

    public boolean setHr(int hr) {
        if(hr >= 0 && hr < 24) {
        this.hr = hr;
        return true;
        } else {
            return false;
        }
    }

    public boolean setMin(int min) {
        if(min >= 0 && min < 60) {
        this.min = min;
        return true;
        } else {
            return false;
        }
    }

    public boolean setSeg(int seg) {
        if(seg >= 0 && seg < 60) {
        this.seg = seg;
        return true;
        } else {
            return false;
        }
    }

    
    public String toString() {
        return hr + ":" + min + ":" + seg;
    }

    public String porExtenso() {
        String extenso = hrE[hr] + " horas," ;
        return extenso;
    }
    
    
    
    
    public long horarioEmSegundos() {
        long segE = hr*60*60 + min*60 + seg;
        return segE;
    }

    public long diferença(Horario outro) {
        return Math.abs(this.horarioEmSegundos() - outro.horarioEmSegundos());
    }

    // public String porExtenso(){
    //     StringBuilder sb = new StringBuilder();
    //     sb.append(hrE[this.hr]);
    //     sb.append("horas(s)");
    //     sb.append(minE[this.min]);
    //     sb.append(null)
    // }

 


}


