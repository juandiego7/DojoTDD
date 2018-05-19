// @GENERATOR:play-routes-compiler
// @SOURCE:/home/estudiantes/diego.goez/Desktop/dojo/DojoTDD/conf/routes
// @DATE:Sat May 19 11:04:55 COT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:9
  class ReverseCodebreaker(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def trySecretService(num:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "answer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("num", num)))
    }
  
    // @LINE:10
    def setSecret(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "setsecret")
    }
  
  }


}
