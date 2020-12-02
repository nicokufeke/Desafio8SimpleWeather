package com.example.desafio8_simpleweather;

public class DailyWeather {

    private String ciudad;
    private String fecha;
    private int imagenDeClima;
    private String temperatura;
    private String gradosCelsius;

    @Override
    public String toString() {
        return "DailyWeather{" +
                "ciudad='" + ciudad + '\'' +
                ", fecha='" + fecha + '\'' +
                ", imagenDeClima=" + imagenDeClima +
                ", temperatura=" + temperatura +
                ", gradosCelsius='" + gradosCelsius + '\'' +
                '}';
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getImagenDeClima() {
        return imagenDeClima;
    }

    public void setImagenDeClima(int imagenDeClima) {
        this.imagenDeClima = imagenDeClima;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getGradosCelsius() {
        return gradosCelsius;
    }

    public void setGradosCelsius(String gradosCelsius) {
        this.gradosCelsius = gradosCelsius;
    }

    public DailyWeather(String ciudad, String fecha, int imagenDeClima, String temperatura, String gradosCelsius) {
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.imagenDeClima = imagenDeClima;
        this.temperatura = temperatura;
        this.gradosCelsius = gradosCelsius;
    }
}
