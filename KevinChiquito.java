public class KevinChiquito {
    private int edat;
    private String tel;

    public KevinChiquito(int e, String t) {
        edat = e;
        tel = t;
    }

    // Constructor buit
    public Constructorbuit() {
        edat = 0;
        tel = "";
    }

    // Constructor copiador
    public Constructorcopiador (KevinChiquito altre) {
        edat = altre.edat;
        tel = altre.tel;
    }

    // Funció toString()
    @Override
    public String toString() {
        return "KevinChiquito [edat=" + edat + ", tel=" + tel + "]";
    }

    // Funció equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KevinChiquito altre = (KevinChiquito) obj;
        return edat == altre.edat && tel.equals(altre.tel);
    }
}
