import java.util.ArrayList;
import java.util.List;

public class Etapai {
    public int vaikoAmzius;
    public int miegoRezimas;
    public String vaikoJudesiai;
    public String psichika;
    public String socialinisTobulejimas;
    public int svorioVidurkis;
    public int ugioVidurkis;
    public String lavinamiejiZaidimai;

    List <Etapai> menesioPasiekimai;

    public int getVaikoAmzius() {
        return vaikoAmzius;
    }

    public int getMiegoRezimas() {
        return miegoRezimas;
    }

    public String getVaikoJudesiai() {
        return vaikoJudesiai;
    }

    public String getPsichika() {
        return psichika;
    }

    public String getSocialinisTobulejimas() {
        return socialinisTobulejimas;
    }

    public int getSvorioVidurkis() {
        return svorioVidurkis;
    }

    public int getUgioVidurkis() {
        return ugioVidurkis;
    }

    public String getLavinamiejiZaidimai() {
        return lavinamiejiZaidimai;
    }

    public Etapai(int vaikoAmzius, int miegoRezimas, String vaikoJudesiai, String psichika,
                  String socialinisTobulejimas, int svorioVidurkis, int ugioVidurkis, String lavinamiejiZaidimai) {
        this.vaikoAmzius = vaikoAmzius;
        this.miegoRezimas = miegoRezimas;
        this.vaikoJudesiai = vaikoJudesiai;
        this.psichika = psichika;
        this.socialinisTobulejimas = socialinisTobulejimas;
        this.svorioVidurkis = svorioVidurkis;
        this.ugioVidurkis = ugioVidurkis;
        this.lavinamiejiZaidimai = lavinamiejiZaidimai;
        this.menesioPasiekimai = new ArrayList<>();

    }
}
