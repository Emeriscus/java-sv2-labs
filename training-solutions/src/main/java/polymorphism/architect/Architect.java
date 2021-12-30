package polymorphism.architect;

public class Architect {

    public static void main(String[] args) {

        Plan sketchPlan = new SketchPlan(150, "New bridge");

        Plan permitPlan = new PermitPlan(100, "New building",
                "Mayor", "Bp, Váczi út 24.");

        Plan constructionPlan = new ConstructionPlan(200, "New house",
                "Prime minister", "Bp, Szentkirályi út 34.", 50);

        System.out.println(sketchPlan.getPagesOfDocumentation());
        System.out.println(permitPlan.getPagesOfDocumentation());
        System.out.println(constructionPlan.getPagesOfDocumentation());

        SketchPlan sketchPlan2 = new SketchPlan(250, "New concrete");

        SketchPlan permitPlan2 = new PermitPlan(300, "New theatre",
                "Mr. Brown", "Bp");

        SketchPlan constructionPlan2 = new ConstructionPlan(350, "new cinema",
                "Mr. Pink", "Szeged", 100);

        System.out.println(sketchPlan2.getTitle());
        System.out.println(sketchPlan2.getPagesOfDocumentation());
        System.out.println(permitPlan2.getTitle());
        System.out.println(permitPlan2.getPagesOfDocumentation());
        System.out.println(constructionPlan2.getTitle());
        System.out.println(constructionPlan2.getPagesOfDocumentation());

        Header permitPlan3 = new PermitPlan(350, "New mall",
                "Mr.Orange", "Szolnok");

        Header constructionPlan3 = new ConstructionPlan(400, "New shop",
                "Mr. White", "Debrecen", 150);

        System.out.println(permitPlan3.getNameOfClient());
        System.out.println(permitPlan3.getAddressOfBuilding());
        System.out.println(constructionPlan3.getNameOfClient());
        System.out.println(constructionPlan3.getAddressOfBuilding());

        PermitPlan permitPlan4 = new PermitPlan(450, "New grocery",
                "Mr. Black", "Pécs");

        PermitPlan constructionPlan4 = new ConstructionPlan(500, "New barber shop",
                "Mr. Brown", "Tata", 200);

        System.out.println(permitPlan4.getHeader());
        System.out.println(permitPlan4.getNameOfClient());
        System.out.println(permitPlan4.getAddressOfBuilding());
        System.out.println(permitPlan4.getTitle());
        System.out.println(permitPlan4.getPagesOfDocumentation());

        System.out.println(constructionPlan4.getHeader());
        System.out.println(constructionPlan4.getNameOfClient());
        System.out.println(constructionPlan4.getAddressOfBuilding());
        System.out.println(constructionPlan4.getTitle());
        System.out.println(constructionPlan4.getPagesOfDocumentation());

        ConstructionPlan constructionPlan5 = new ConstructionPlan(550, "New bus station",
                "Mr. Blue", "Gyula", 250);

        System.out.println(constructionPlan5.getSheetsOfConstructionDrawings());
        System.out.println(constructionPlan5.getHeader());
        System.out.println(constructionPlan5.getNameOfClient());
        System.out.println(constructionPlan5.getAddressOfBuilding());
        System.out.println(constructionPlan5.getTitle());
        System.out.println(constructionPlan5.getPagesOfDocumentation());
    }
}
