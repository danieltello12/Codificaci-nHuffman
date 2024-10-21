abstract class ArbolHuffman {
  def peso:Int
  def caracteres:List[Char]
}
case class ramaHuffman(izquierda: ArbolHuffman, derecha: ArbolHuffman) extends ArbolHuffman{
  override def peso:Int= izquierda.peso+izquierda.peso
  override def caracteres: List[Char] = izquierda.caracteres++derecha.caracteres
}
case class hojaHuffman(frecuencia: Int, caracter: Char) extends ArbolHuffman{
  override def peso:Int= frecuencia
  override def caracteres: List[Char] = List(Char)
}

