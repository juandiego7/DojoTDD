// @GENERATOR:play-routes-compiler
// @SOURCE:/home/Estudiantes/sonorkz/dojo/DojoTDD/conf/routes
// @DATE:Sat Jun 02 13:02:35 COT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
