package tadp

trait Atacante {

  def potencialOfensivo = 80

  def atacarA(defensor: Defensor) = {
    defensor.recibirDanio(danioCreado(defensor))
  }

  def danioCreado(defensor: Defensor) = {
    if (this.potencialOfensivo >
      defensor.potencialDefensivo) {
      this.potencialOfensivo -
        defensor.potencialDefensivo
    } else
      0
  }
}