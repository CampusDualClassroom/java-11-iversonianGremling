package com.campusdual.classroom;

public class TVRemote {
  /*  La clase TVRemote proporcionada está vacía. Será necesario copiar todo lo que se muestra en la diapositiva número 29 del temario de POO dentro de esta clase: sus atributos y métodos. De esta forma, al ejecutar el código proporcionado del main() de la clase Exercise11 no habrá ningún error.
    A mayores del código proporcionado en el main(), también dentro de este método, será necesario:
    Encender la TV
    Subir un canal
    Bajar un canal
    Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede
    Subir el volumen
    Bajar el volumen
    Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede
    Obtener el color del mando a distancia y mostrarlo por pantalla
    Apagar la TV
*/
    public Boolean on = false;
    public Integer channel = 0;
    public Integer volume = 0;

    private String color;


    public TVRemote(String color) {
      this.color = color;
    }
    public String getColor() {
      return this.color;
    }

    void turnOn() {
      this.on = true;
    }

    void turnOff() {
      this.on = false;
    }

    void channelUp() {
      this.channel++;
    }

    void channelDown() {
      if (this.channel > 0) {
        this.channel--;
      }
    }

    void volumeUp() {
      this.volume++;
    }

    void volumeDown() {
      if (this.volume > 0) {
        this.volume--;
      }
    }
}
