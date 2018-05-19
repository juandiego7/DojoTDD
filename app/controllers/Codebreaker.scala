package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class Codebreaker @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def setSecret() = Action {  implicit request =>
        val bodyAsJson = request.body.asJson.get
        secret = (bodyAsJson \ "secret").asOpt[String].get
        Ok("success")
    }
        
    def trySecretService(num: String) = Action { 
        val res = trySecret(num)
        val json = Json.toJson(res)
        result = ""
        xs = ""
        underScores = ""
        Ok(json)
    }
   
    
    var secret = "1234"
    var xs = ""
    var underScores = ""
    var result:String = ""

  def trySecret(num: String): String = {

    

    var i = 0
    var j = 0

    if(num.length()>4){
        return "No ingrese mas de 4 digitos"
    }

      for(i <- 0 to 3){
        for(j <- 0 to 3){
            if(i==j && secret.charAt(i).equals(num.charAt(j))){
                xs = xs + "x"
            }
            else if (secret.charAt(i).equals(num.charAt(j))){
                underScores = underScores + "_"
            }          
        }        
      }     
      result = xs + underScores
      return result
  }
}