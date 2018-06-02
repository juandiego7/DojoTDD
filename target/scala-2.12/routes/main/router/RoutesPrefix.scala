// @GENERATOR:play-routes-compiler
// @SOURCE:/home/Estudiantes/sonorkz/DojoTDD/conf/routes
// @DATE:Sat Jun 02 09:00:25 COT 2018


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
