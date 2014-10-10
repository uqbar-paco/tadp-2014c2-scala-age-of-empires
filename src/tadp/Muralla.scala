package tadp

class Muralla extends Defensor {

  energia = 500

  override def teAtacoUnTanque(tanque: Tanque) =
    this.recibirDanio(1000)

}