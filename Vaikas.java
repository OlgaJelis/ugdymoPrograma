public class Vaikas {

    private int Id;
    private String vaikoVardas;
    private int vaikoAmzius;
    private int vaikoUgis;
    private int vaikoSvoris;

    public Vaikas(int id, String vaikoVardas, int vaikoAmzius, int vaikoUgis, int vaikoSvoris) {
        Id = id;
        this.vaikoVardas = vaikoVardas;
        this.vaikoAmzius = vaikoAmzius;
        this.vaikoUgis = vaikoUgis;
        this.vaikoSvoris = vaikoSvoris;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getVaikoVardas() {
        return vaikoVardas;
    }

    public void setVaikoVardas(String vaikoVardas) {
        this.vaikoVardas = vaikoVardas;
    }

    public int getVaikoAmzius() {
        return vaikoAmzius;
    }

    public void setVaikoAmzius(int vaikoAmzius) {
        this.vaikoAmzius = vaikoAmzius;
    }

    public int getVaikoUgis() {
        return vaikoUgis;
    }

    public void setVaikoUgis(int vaikoUgis) {
        this.vaikoUgis = vaikoUgis;
    }

    public int getVaikoSvoris() {
        return vaikoSvoris;
    }

    public void setVaikoSvoris(int vaikoSvoris) {
        this.vaikoSvoris = vaikoSvoris;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Vaikas{" +
                "Id=" + Id +
                ",Vardas='" + vaikoVardas + '\'' +
                ", Amzius=" + vaikoAmzius +
                ", Ugis=" + vaikoUgis +
                ", Svoris=" + vaikoSvoris +
                '}';
    }
}
