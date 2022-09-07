

import java.util.ArrayList;
import java.util.List;
public class FromTo {
    Viloyat[] viloyats = (new Viloyat[] {
            new Viloyat("Toshkent"),
            new Viloyat("Sirdaryo"),
            new Viloyat("Jizzax"),
//            new Viloyat()
    });

    Tuman yunusobod = new Tuman("Yunusobod", 6);
    Tuman chilonzor = new Tuman("Olmazor", 8);
    Tuman mirobod = new Tuman("Mirobod", 9);
    Tuman bektemir = new Tuman("Bektemir", 5);
    Tuman shayhontohur = new Tuman("Shayhontohur", 7);
    Tuman sergili = new Tuman("Sergili", 10);
    Tuman uchtepa = new Tuman("Uchtepa", 7);
    Tuman yashnobod = new Tuman("Yashnabod", 10);
    Tuman yakkasaroy = new Tuman("Yakkasaroy", 6);
    Tuman mirzoUlugbek = new Tuman("Mirzoulugbek", 8);
    Tuman olmazor = new Tuman("Olmazor", 9);




    public String[] Qaerdan(String qaerdan, String qaerga){

        return switch (qaerdan) {
            case "yunusobod" -> Yunusobod(qaerga);
//            case "olmazor" -> Olmazor(qaerga);
//            case "chilonzor" -> Chilonzor(qaerga);
//            case "mirzoulugbek" -> MirzoUlugbek(qaerga);
//            case "yashnabod" -> Yashnabod(qaerga);
//            case "yakkasaroy" -> Yakkasaroy(qaerga);
//            case "mirobod" -> Mirobod(qaerga);
//            case "shayhontohur" -> Shayhontohur(qaerga);
//            case "sergili" -> Sergili(qaerga);
//            case "bektemir" -> Bektemir(qaerga);
            default -> null;
        };
    }



    public String[] Yunusobod(String qaerga){
        return switch (qaerga){
            case "chilonzor" -> Location(new ArrayList<>(List.of(yunusobod, shayhontohur, chilonzor)));
            case "mirobod" -> Location(new ArrayList<>(List.of(yunusobod, mirzoUlugbek, mirobod)));
            case "shayhontohur" -> Location(new ArrayList<>(List.of(yunusobod, olmazor, chilonzor)));
            case "sergili"-> Location(new ArrayList<>(List.of(yunusobod, shayhontohur, chilonzor, sergili)));
            case "uchtepa" -> Location(new ArrayList<>(List.of(yunusobod, olmazor, shayhontohur, uchtepa)));
            case "bektemir" -> Location(new ArrayList<>(List.of(yunusobod,mirzoUlugbek , yashnobod, bektemir)));
            case "yakkasaroy" -> Location(new ArrayList<>(List.of(yunusobod, mirobod, yakkasaroy)));
            case "olmazor"-> Location(new ArrayList<>(List.of(yunusobod, olmazor)));
            case "mirzoulugbek"-> Location(new ArrayList<>(List.of(yunusobod, mirzoUlugbek)));
            case "yashnabod"-> Location(new ArrayList<>(List.of(yunusobod, mirzoUlugbek, yashnobod)));
            default -> null;
        };
    }

    public String[] Chilonzor(String qaerga){
        return switch (qaerga){
            case "yunusobod" -> Location(new ArrayList<>(List.of(chilonzor, shayhontohur, yunusobod)));
            case "mirobod" -> Location(new ArrayList<>(List.of(chilonzor, yakkasaroy, mirobod)));
            case "shayhontohur" -> Location(new ArrayList<>(List.of(chilonzor, shayhontohur)));
            case "sergili"-> Location(new ArrayList<>(List.of(chilonzor, sergili)));
            case "uchtepa" -> Location(new ArrayList<>(List.of(chilonzor, uchtepa)));
            case "bektemir" -> Location(new ArrayList<>(List.of(chilonzor, yakkasaroy, mirobod, bektemir)));
            case "yakkasaroy" -> Location(new ArrayList<>(List.of(chilonzor, yakkasaroy)));
            case "olmazor"-> Location(new ArrayList<>(List.of(chilonzor, yakkasaroy, olmazor)));
            case "mirzoulugbek"-> Location(new ArrayList<>(List.of(chilonzor, yakkasaroy, mirobod, mirzoUlugbek)));
            case "yashnabod"-> Location(new ArrayList<>(List.of(chilonzor, sergili, mirobod, yashnobod)));
            default -> null;
        };
    }

    public String[] Shayhontohur(String qaerga){
        return switch (qaerga){
            case "yunusobod" -> {
                yield location;
            }
            case "mirobod" -> Location(new ArrayList<>(List.of(chilonzor, yakkasaroy, mirobod)));
            case "shayhontohur" -> Location(new ArrayList<>(List.of(chilonzor, shayhontohur)));
            case "sergili"-> Location(new ArrayList<>(List.of(chilonzor, sergili)));
            case "uchtepa" -> Location(new ArrayList<>(List.of(chilonzor, uchtepa)));
            case "bektemir" -> Location(new ArrayList<>(List.of(chilonzor, yakkasaroy, mirobod, bektemir)));
            case "yakkasaroy" -> Location(new ArrayList<>(List.of(chilonzor, yakkasaroy)));
            case "olmazor"-> Location(new ArrayList<>(List.of(chilonzor, yakkasaroy, olmazor)));
            case "mirzoulugbek"-> Location(new ArrayList<>(List.of(chilonzor, yakkasaroy, mirobod, mirzoUlugbek)));
            case "yashnabod"-> Location(new ArrayList<>(List.of(chilonzor, sergili, mirobod, yashnobod)));
            default -> null;
        };
    }

//    public String[] Sergili(String qaerga){
//
//    }
//
//    public String[] UchTepa(String qaerga){
//
//    }
//
//    public String[] Yashnabod(String qaerga){
//
//    }
//
//    public String[] Olmazor(String qaerga){
//
//    }
//
//    public String[] Yakkasaroy(String qaerga){
//
//    }
//
//    public String[] Mirobod(String qaerga){
//
//    }
//
//    public String[] MirzoUlugbek(String qaerga){
//
//    }
//
//    public String[] Bektemir(String qaerga){
//
//    }




    public String[] Location(List<Tuman> tumanlar){
        String[] tumanlarNomi = new String[tumanlar.size()];
        for (int i = 0; i < tumanlar.size(); i++) tumanlarNomi[i] = tumanlar.get(i).name;
        return tumanlarNomi;
    }








}