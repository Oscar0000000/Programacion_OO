public class Arbol {

    private String especie;
    private int altura;

    // Constructor por defecto
    public Arbol() {}

    // Constructor completo
    public Arbol(String especie, int altura) {
        this.especie = especie;
        this.altura = altura;
    }

    // Getters y Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // toString
    @Override
    public String toString() {
        return "Arbol{" +
                "especie='" + especie + '\'' +
                ", altura=" + altura +
                '}';
    }

    // equals → misma especie
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Arbol)) return false;
        Arbol arbol = (Arbol) o;
        return especie.equals(arbol.especie);
    }

    // hashCode → basado en especie
    @Override
    public int hashCode() {
        return especie.hashCode();
    }
}
