// @GENERATOR:play-routes-compiler
// @SOURCE:/home/estudiantes/diego.goez/Desktop/dojo/DojoTDD/conf/routes
// @DATE:Sat May 19 11:04:55 COT 2018


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
