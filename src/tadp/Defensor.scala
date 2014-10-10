package tadp

trait Defensor {

  var energia = 100

  def potencialDefensivo = 75

  def teAtacoUnAtacante(atacante: Atacante) = {
    if (atacante.potencialOfensivo >
      this.potencialDefensivo) {
      val danio = atacante.potencialOfensivo -
        this.potencialDefensivo
      this.recibirDanio(danio)
    }
  }

  def teAtacoUnTanque(tanque: Tanque) =
    this.teAtacoUnAtacante(tanque)

  def recibirDanio(danio: Int) =
    this.energia = Math.max(0, energia - danio)

}