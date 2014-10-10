package tadp

trait Atacante {

  def potencialOfensivo = 80

  def atacarA(defensor: Defensor) = {
    defensor.teAtacoUnAtacante(this)
  }

}