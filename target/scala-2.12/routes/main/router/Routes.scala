// @GENERATOR:play-routes-compiler
// @SOURCE:/home/estudiantes/diego.goez/Desktop/dojo/DojoTDD/conf/routes
// @DATE:Sat May 19 11:04:55 COT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:9
  Codebreaker_1: controllers.Codebreaker,
  // @LINE:13
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:9
    Codebreaker_1: controllers.Codebreaker,
    // @LINE:13
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_0, Codebreaker_1, Assets_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Codebreaker_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """answer/""" + "$" + """num<[^/]+>""", """controllers.Codebreaker.trySecretService(num:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """setsecret""", """controllers.Codebreaker.setSecret"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Codebreaker_trySecretService1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("answer/"), DynamicPart("num", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Codebreaker_trySecretService1_invoker = createInvoker(
    Codebreaker_1.trySecretService(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Codebreaker",
      "trySecretService",
      Seq(classOf[String]),
      "GET",
      this.prefix + """answer/""" + "$" + """num<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Codebreaker_setSecret2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("setsecret")))
  )
  private[this] lazy val controllers_Codebreaker_setSecret2_invoker = createInvoker(
    Codebreaker_1.setSecret,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Codebreaker",
      "setSecret",
      Nil,
      "POST",
      this.prefix + """setsecret""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_Codebreaker_trySecretService1_route(params@_) =>
      call(params.fromPath[String]("num", None)) { (num) =>
        controllers_Codebreaker_trySecretService1_invoker.call(Codebreaker_1.trySecretService(num))
      }
  
    // @LINE:10
    case controllers_Codebreaker_setSecret2_route(params@_) =>
      call { 
        controllers_Codebreaker_setSecret2_invoker.call(Codebreaker_1.setSecret)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
