package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.Random;

public class MeteoData {
    ArrayList<Display> Displays = new ArrayList<Display>();

    public ArrayList<Display> getDisplays() {
        return Displays;
    }
    public void agregarDisplay(Display d1){Displays.add(d1);}

    private final EstacionMeteorologica estacionMeteorologica;

    public MeteoData(EstacionMeteorologica estacionMeteorologica) {
        this.estacionMeteorologica = estacionMeteorologica;
    }

    public double getHumedad() {
        return new Random().nextDouble();
    }

    public double getTemperatura() {
        return new Random().nextDouble();
    }

    public double getPresion() {
        return new Random().nextDouble();
    }

    /**
     * No nos interesa saber como MeteData obtiene los datos de la estación meteorológica.
     * Solo nos interesa saber que cada vez q algún dato se actualiza, se ejecuta el método
     * informacionActualizada
     */
    public void informaciónActualizada() {
    Displays.forEach(x->x.actualizarDatos(getTemperatura(),getPresion(),getHumedad()));
    }
}
