abstract class arbolHuff:
  def rama:Boolean

class ramaHuff(val izquierda:arbolHuff, val derecha: arbolHuff) extends arbolHuff
  def rama:Boolean= true

class hojaHuff (val peso:Int, val caracter: Char)   extends arbolHuff
  def rama:Boolean=false

def peso(arbol: arbolHuff): Int = arbol match
  case hojaHuff(p, c) => p
  case ramaHuff(izq, dch) => peso(izq) + peso(dch)

def caracteres(arbol: ArbolHuff): List[Char] = arbol match
  case hojaHuff(p, c) => c::this
  case ramaHuff(izq, dch) => caracteres(izq),caracteres(dch)

caracteres(new ramaHuff(new ramaHuff(
  new ramaHuff(new hojaHuff(5,e),new hojaHuff(1,w)),
new hojaHuff(2,t),Nil),Nil),new hojaHuff(6,p))

