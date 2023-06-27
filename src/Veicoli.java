public class Veicoli {
      private String  modello;
      private String marca ;
      private boolean ibrida ;

    public Veicoli(String modello, String marca, boolean ibrida) {
        this.modello = modello;
        this.marca = marca;
        this.ibrida = ibrida;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isIbrida() {
        return ibrida;
    }

    public void setIbrida(boolean ibrida) {
        this.ibrida = ibrida;
    }

    @Override
    public String toString() {
        return "Veicoli{" +
                "modello='" + modello + '\'' +
                ", marca='" + marca + '\'' +
                ", ibrida=" + ibrida +
                '}';
    }
}
