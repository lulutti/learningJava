import server.Iserie;
import server.impl.SerieException;
import server.impl.SerieProxy;

public class Main {
    public static void main(String[] args) throws SerieException {

        String[] series = {"greysanatomy", "thebigbangtheory", "thewalkingdead", "thesinner"};

        Iserie service = new SerieProxy();

        for(String serie: series){
            service.getSerie(serie);
        }

    }
}
