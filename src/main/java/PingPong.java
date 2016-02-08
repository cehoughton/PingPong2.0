import java.util.ArrayList;
import java.util.Arrays;

public class PingPong {
  public static void main(String[] args) {}

   public ArrayList<String> pingPong(Integer number) {
     ArrayList<String> results = new ArrayList<String>();

    for (int i = 1; i<= number; i++) {
      if (i % 15 == 0) {
        results.add("PingPong");
      } else if (i % 5 == 0) {
        results.add("Pong");
      } else if (i % 3 == 0) {
        results.add("Ping");
      } else {
        results.add(Integer.toString(i));
      }
    }
    return results;
  }
}


//
//
// for (int i = 1; i <= number; i++) {
//       if (i % 15 == 0) {
//         results.add("PingPong");
//       } else if (i % 3 == 0) {
//         results.add("Ping");
//       } else if (i % 5 == 0) {
//         results.add("Pong");
//       } else {
//         results.add(Integer.toString(i));
//       }
//     }
//
//     return results;
//
//   }
// }











// import java.util.HashMap;
//
// import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;
//
// import static spark.Spark.*;
//
// public class App {
//   public static void main(String[] args) {
//     staticFileLocation("/public");
//     String layout = "templates/layout.vtl";
//
//     get("/", (request, response) -> {
//           HashMap model = new HashMap();
//           model.put("template", "templates/home.vtl" );
//
//           return new ModelAndView(model, layout);
//         }, new VelocityTemplateEngine());
//
//       get("/photos", (request, response) -> {
//           HashMap model = new HashMap();
//           model.put("template", "templates/photos.vtl" );
//
//           return new ModelAndView(model, layout);
//         }, new VelocityTemplateEngine());
//
//       get("/dates", (request, response) -> {
//           HashMap model = new HashMap();
//           model.put("template", "templates/dates.vtl" );
//
//           return new ModelAndView(model, layout);
//         }, new VelocityTemplateEngine());
//
//       get("/form", (request, response) -> {
//       HashMap model = new HashMap();
//
//       model.put("template", "templates/form.vtl");
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//
//     get("/greeting_card", (request, response) -> {
//     HashMap model = new HashMap();
//     String recipient = request.queryParams("recipient");
//     String sender = request.queryParams("sender");
//
//     model.put("recipient", recipient);
//     model.put("sender", sender);
//     model.put("template", "templates/greeting_card.vtl");
//     return new ModelAndView(model, layout);
//   }, new VelocityTemplateEngine());
//
//
//
//   }
// }

//
// get("/", (request, response) -> {
//       HashMap model = new HashMap();
//       model.put("template", "templates/home.vtl" );
//       return new ModelAndView(model, "templates/layout.vtl");
//     }, new VelocityTemplateEngine());
//
//   get("/photos", (request, response) -> {
//       HashMap model = new HashMap();
//       model.put("template", "templates/photos.vtl" );
//
//       return new ModelAndView(model, "templates/layout.vtl");
//     }, new VelocityTemplateEngine());
