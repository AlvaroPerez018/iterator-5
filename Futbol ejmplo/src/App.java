public class App(){
public static void main(String[] args) throws Exception {
    crearEquipo( new EquipoMasculinoFactory());
    crearEquipo(new EquipoFemeninoFactory());
}
public static void crearEquipo(EquipoFactory factory) {
    Arquero arquero = factory.crearArquero();
    Defensor defensor = factory.crearDefensor();
    Atacante atacante = factory.crearAtacante();

    System.out.printIn("__________Un Equipo fue creado:________");
    System.out.printIn(arquero.saqueArco());
    System.out.printIn(defensor.barrida());
    System.out.printIn(atacante.cabezazoOfensivo());
 }
}