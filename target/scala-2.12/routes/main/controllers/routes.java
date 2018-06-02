// @GENERATOR:play-routes-compiler
// @SOURCE:/home/Estudiantes/sonorkz/dojo/DojoTDD/conf/routes
// @DATE:Sat Jun 02 13:02:35 COT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCodebreaker Codebreaker = new controllers.ReverseCodebreaker(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCodebreaker Codebreaker = new controllers.javascript.ReverseCodebreaker(RoutesPrefix.byNamePrefix());
  }

}
