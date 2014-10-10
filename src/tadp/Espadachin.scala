package tadp

class Espadachin(val espada: Arma) extends Guerrero(100) {

  var habilidad: Double = 0.6

  override def potencialOfensivo =
    super.potencialOfensivo +
      (espada.potencialOfensivo * habilidad).toInt

}