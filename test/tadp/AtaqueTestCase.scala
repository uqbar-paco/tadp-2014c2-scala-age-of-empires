package tadp

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert._
class AtaqueTestCase {

  def assertAtacadoQuedaCon(atacante: Atacante,
    defensor: Defensor,
    energiaFinal: Int) = {

    atacante.atacarA(defensor)
    assertEquals(energiaFinal, defensor.energia)
  }

  @Test
  def `guerrero ataca a guerrero` = {
    val atila: Guerrero = new Guerrero
    val conan: Guerrero = new Guerrero

    assertAtacadoQuedaCon(atila, conan, 80)
    //    atila.atacarA(conan)
    //
    //    assertEquals(80, conan.energia)
  }

  @Test
  def `guerrero ataca a muralla` = {
    val atila: Guerrero = new Guerrero
    val muralla: Muralla = new Muralla

    assertAtacadoQuedaCon(atila, muralla, 495)

    //    atila.atacarA(muralla)
    //
    //    assertEquals(495, muralla.energia)
  }

  @Test
  def `tanque ataca a guerrero` = {
    val tanque = new Tanque
    val guerrero: Guerrero = new Guerrero

    //    assertAtacadoQuedaCon(tanque, guerrero, 80)

    tanque.atacarA(guerrero)

    assertEquals(80, guerrero.energia)
  }

  @Test
  def `tanque ataca a muralla` = {
    val tanque: Tanque = new Tanque
    val muralla: Muralla = new Muralla

    //    assertAtacadoQuedaCon(tanque, muralla, 0)

    tanque.atacarA(muralla)

    assertEquals(0, muralla.energia)
  }

  @Test
  def `tanque ataca a otro guerrero` = {
    val tanque: Tanque = new Tanque
    val muralla: Defensor = new Muralla

    tanque.atacarA(muralla)

    assertEquals(0, muralla.energia)
  }

  @Test
  def `tanque ataca a guerrero y muralla` = {
    val tanque: Tanque = new Tanque
    val conan: Guerrero = new Guerrero
    val muralla: Muralla = new Muralla

    tanque.atacarATodos(List(conan, muralla))

    assertEquals(0, muralla.energia)
    assertEquals(80, conan.energia)
  }

  @Test
  def `espadachin ataca a guerrero` = {
    val leono: Guerrero = new Espadachin(new Espada)
    val conan: Guerrero = new Guerrero

    leono.atacarA(conan)

    assertEquals(50, conan.energia)
  }

  @Test
  def `espadachin ataca a otro guerrero` = {
    val conan: Guerrero = new Guerrero
    val leono: Guerrero = new Espadachin(conan)

    leono.atacarA(defensor=conan)

    assertEquals(32, conan.energia)
  }
  //
  //  
  //  
  //  @Test
  //  def `misil ataca a muralla` = {
  //    val misil: Misil = new Misil
  //    val muralla: Muralla = new Muralla
  //
  //    misil.atacarA(muralla)
  //
  //    assertEquals(0, muralla.energia)
  //  }
}