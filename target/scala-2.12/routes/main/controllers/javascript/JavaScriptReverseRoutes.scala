// @GENERATOR:play-routes-compiler
// @SOURCE:/home/Estudiantes/sonorkz/dojo/DojoTDD/conf/routes
// @DATE:Sat Jun 02 13:02:35 COT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseCodebreaker(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def trySecretService: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Codebreaker.trySecretService",
      """
        function(num0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "answer/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("num", num0))})
        }
      """
    )
  
    // @LINE:10
    def setSecret: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Codebreaker.setSecret",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "setsecret"})
        }
      """
    )
  
  }


}
