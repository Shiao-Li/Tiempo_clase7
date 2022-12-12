public class time1 {
    private int horas, minutos, segundos;

    public void settime1(int horas, int minutos, int segundos) {
        if (horas<0||horas>=24||minutos<0||minutos>=60||segundos<0||segundos>60){
            throw new IllegalArgumentException("Usario ingresar valores dentro de los rangos validos");
        }

        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public  String toUniversalString(){
        return  String.format("%02d:%02d:%02d", horas, minutos, segundos); //imprime 2 numeros y separe el ":"
    }
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((horas == 0 || horas == 12) ? 12 : horas % 12),
                minutos, segundos, (horas < 12 ? "AM" : "PM"));
    }
}
