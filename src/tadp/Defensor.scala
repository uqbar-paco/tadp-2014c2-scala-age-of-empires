package tadp

trait Defensor {

  var energia = 100

  def potencialDefensivo = 75

  def recibirDanio(danio: Int) =
    this.energia = Math.max(0, energia - danio)

  def recibirDanioFuerte(danioNormal: Int, danioFuerte: Int) = {
    this.recibirDanio(danioNormal)
  }
}