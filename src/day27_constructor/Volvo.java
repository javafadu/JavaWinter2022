package day27_constructor;

public class Volvo {

    // her araba icin ortak olanlar
String marka = "Volvo";
String mensei = "Isvec";
String model;

// her araba icin degisen
boolean elektrikliMi;
int yil;
String yakit;

// arabanin turune gore method
boolean otomatikPilot = otomatikPilotSorgusu();

int maxHiz = maxHizAta();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {

        model = mdl;
        elektrikliMi = elk;
        yil = yl;
        yakit = ykt;

    }
    // parametreli constructor olusturmustuk
    // default gidince bunu mutlaka yapmamiz parametresiz olusturuyoruz
    public Volvo() {

    }

    public int maxHizAta() {
        int maxHiz=0;
        if(elektrikliMi) {
            maxHiz = 160;
        } else {
            maxHiz = 240;
        }
    return maxHiz;
    }


    public boolean otomatikPilotSorgusu() {
        boolean sonuc = false;
        if(elektrikliMi) {
           sonuc = true;
        } else {
            sonuc = false;
        }

        return sonuc;
    }


    public String toString() {
        String arabaOzellikleri = "Model : "+model+
                                    " Yakit : "+yakit+
                                    " Max Hiz : "+maxHiz;




        return arabaOzellikleri;
    }



}
