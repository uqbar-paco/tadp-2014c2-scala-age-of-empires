package tadp

class Guerrero(unaEnergia: Int = 100) extends Defensor with Atacante {

  energia = unaEnergia

  override def potencialDefensivo = 60

}