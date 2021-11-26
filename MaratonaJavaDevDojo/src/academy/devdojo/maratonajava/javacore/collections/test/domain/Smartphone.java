package academy.devdojo.maratonajava.javacore.collections.test.domain;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    //Regras para ser sobrescrever o método equals
    //1- Reflexivo: x.equals(x) precisa resultar em true para tudo que for diferente de null
    //2- Simétrico: para x e y diferentes de null, se x.equals(y) == true, então y.equals(x) == true
    //3- Transitividade: para x,y,z diferentes de null se x.equals(y) == true e x.eqyals(z) == true, logo y.equals(z) == true
    //4- Consistente: x.equals(x) sempre retorna true se x for diferente de null
    //5- Para x diferente de null, x.equals(null) tem que retornar false
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false; // o objeto é nulo? retorna false
        if(this == obj) return true; // os dois objetos tem o mesmo valor de memória? só dale true
        if(this.getClass() != obj.getClass()) return false; // os dois objetos não são da mesma classe? então n resta dúvidas, n são equals, dale false de novo
        // se ele chegou até aqui já garantimos que ele não é nulo, são da mesma classe, mas não exatamente o mesmo objeto
        // Com a garantia de ser da mesma classe utilizamo um casting e depois comparamos o atributo que pela regra de negócio faz com que eles sejam iguais ou não, nesse caso é o serialnumber
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    // se x.equals(y) == true, y.hashCode() tem que ser igual a x.hashcode
    // se temos y.hashCode() == x.hashCode() não necessariamente o equals entre eles será true
    // se x.equals(y) == false então os hashcodes serão diferentes
    // y.hashCode() != x.hashCode(), x.equals(y) deverá ser diferente
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
