package tadp

class Muralla extends Defensor {

  energia = 500


  override def recibirDanioFuerte(danioNormal: Int, danioFuerte: Int) = {
    this.recibirDanio(danioFuerte)
  }

}