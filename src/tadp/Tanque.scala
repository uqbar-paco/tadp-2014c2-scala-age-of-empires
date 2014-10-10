package tadp

class Tanque extends Atacante with Defensor {

  override def atacarA(defensor: Defensor) = {
	  defensor.teAtacoUnTanque(this)
  }

  def atacarATodos(defensores: List[Defensor]) = {
    defensores.foreach(
      defensor => this.atacarA(defensor))
  }
}