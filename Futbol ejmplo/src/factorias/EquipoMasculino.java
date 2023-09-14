package factorias;

import partes.Arquero;
import partes.ArqueroHombre;
import partes.Atacante;
import partes.AtacanteHombre;
import partes.Defensor;
import partes.DefensorHombre;

public class EquipoMasculinoFactory extends Equipo


public Arquero crearArquero() {
return new ArqueroHombre();
}