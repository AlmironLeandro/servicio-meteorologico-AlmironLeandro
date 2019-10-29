package ar.edu.unahur.obj2;

import java.util.Random;

public class MeteoData {
    display display = new display() {
        @Override
        public void actualizar() {
            getHumedad();
            getPresion();
            getTemperatura();
           // System.out.println(getHumedad()+""+getPresion()+""+getTemperatura());
        }
    };

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
        display.actualizar();
    }
}
