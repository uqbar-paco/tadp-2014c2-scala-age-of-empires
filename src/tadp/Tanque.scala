package tadp

class Tanque extends Atacante with Defensor {

  override def atacarA(defensor: Defensor) = {
	  defensor.recibirDanioFuerte(danioCreado(defensor), 1000)
  }

  def atacarATodos(defensores: List[Defensor]) = {
    defensores.foreach(
      defensor => this.atacarA(defensor))
  }
}