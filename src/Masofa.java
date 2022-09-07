import java.util.ArrayList;
import java.util.List;

public class Masofa {

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




    public Integer Qaerdan(String qaerdan, String qaerga){

        return switch (qaerdan) {
            case "yunusobod" -> Yunusobod(qaerga);
            case "olmazor" -> Olmazor(qaerga);
            case "chilonzor" -> Chilonzor(qaerga);
            case "mirzoulugbek" -> MirzoUlugbek(qaerga);
            case "yashnabod" -> Yashnabod(qaerga);
            case "yakkasaroy" -> Yakkasaroy(qaerga);
            case "mirobod" -> Mirobod(qaerga);
            case "shayhontohur" -> Shayhontohur(qaerga);
            case "sergili" -> Sergili(qaerga);
            case "bektemir" -> Bektemir(qaerga);
            default -> null;
        };
    }



    public Integer Yunusobod(String qaerga){
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

    public Integer Chilonzor(String qaerga){
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

    public Integer Shayhontohur(String qaerga){
        return switch (qaerga){
            case "yunusobod" -> Location(new ArrayList<>(List.of(shayhontohur, yunusobod)));
            case "mirobod" -> Location(new ArrayList<>(List.of(shayhontohur, yakkasaroy, mirobod)));
            case "chilonzor" -> Location(new ArrayList<>(List.of(shayhontohur, chilonzor)));
            case "sergili"-> Location(new ArrayList<>(List.of(shayhontohur, yakkasaroy, sergili)));
            case "uchtepa" -> Location(new ArrayList<>(List.of(shayhontohur, uchtepa)));
            case "bektemir" -> Location(new ArrayList<>(List.of(shayhontohur, yakkasaroy, mirobod, bektemir)));
            case "yakkasaroy" -> Location(new ArrayList<>(List.of(shayhontohur, yakkasaroy)));
            case "olmazor"-> Location(new ArrayList<>(List.of(shayhontohur, olmazor)));
            case "mirzoulugbek"-> Location(new ArrayList<>(List.of(shayhontohur, mirobod, mirzoUlugbek)));
            case "yashnabod"-> Location(new ArrayList<>(List.of(shayhontohur, yakkasaroy, mirobod, yashnobod)));
            default -> null;
        };
    }

    public Integer Sergili(String qaerga){
        return switch (qaerga){
            case "yunusobod" -> Location(new ArrayList<>(List.of(sergili, yakkasaroy, shayhontohur, yunusobod)));
            case "mirobod" -> Location(new ArrayList<>(List.of(sergili, mirobod)));
            case "shayhontohur" -> Location(new ArrayList<>(List.of(sergili, yakkasaroy, shayhontohur)));
            case "chilonzor"-> Location(new ArrayList<>(List.of(sergili, chilonzor)));
            case "uchtepa" -> Location(new ArrayList<>(List.of(sergili, chilonzor, uchtepa)));
            case "bektemir" -> Location(new ArrayList<>(List.of(sergili, yakkasaroy, mirobod, bektemir)));
            case "yakkasaroy" -> Location(new ArrayList<>(List.of(sergili, yakkasaroy)));
            case "olmazor"-> Location(new ArrayList<>(List.of(sergili, yakkasaroy, shayhontohur, olmazor)));
            case "mirzoulugbek"-> Location(new ArrayList<>(List.of(sergili, yakkasaroy, mirobod, mirzoUlugbek)));
            case "yashnabod"-> Location(new ArrayList<>(List.of(sergili, mirobod, yashnobod)));
            default -> null;
        };
    }

    public Integer UchTepa(String qaerga){
        return switch (qaerga){
            case "yunusobod" -> Location(new ArrayList<>(List.of(uchtepa, shayhontohur, yunusobod)));
            case "mirobod" -> Location(new ArrayList<>(List.of(uchtepa, chilonzor, yakkasaroy, mirobod)));
            case "shayhontohur" -> Location(new ArrayList<>(List.of(uchtepa, shayhontohur)));
            case "chilonzor"-> Location(new ArrayList<>(List.of(uchtepa, chilonzor)));
            case "sergili" -> Location(new ArrayList<>(List.of(uchtepa, chilonzor, sergili)));
            case "bektemir" -> Location(new ArrayList<>(List.of(uchtepa, chilonzor, yakkasaroy, mirobod, bektemir)));
            case "yakkasaroy" -> Location(new ArrayList<>(List.of(uchtepa, chilonzor, yakkasaroy)));
            case "olmazor"-> Location(new ArrayList<>(List.of(uchtepa, shayhontohur, olmazor)));
            case "mirzoulugbek"-> Location(new ArrayList<>(List.of(uchtepa, shayhontohur, mirobod, mirzoUlugbek)));
            case "yashnabod"-> Location(new ArrayList<>(List.of(uchtepa, chilonzor, yakkasaroy, mirobod, yashnobod)));
            default -> null;
        };
    }

    public Integer Yashnabod(String qaerga){
        return switch (qaerga){
            case "yunusobod" -> Location(new ArrayList<>(List.of(yashnobod, mirzoUlugbek, yunusobod)));
            case "mirobod" -> Location(new ArrayList<>(List.of(yashnobod, mirobod)));
            case "shayhontohur" -> Location(new ArrayList<>(List.of(yashnobod, mirobod, shayhontohur)));
            case "chilonzor"-> Location(new ArrayList<>(List.of(yashnobod, mirobod, yakkasaroy, chilonzor)));
            case "sergili" -> Location(new ArrayList<>(List.of(yashnobod, mirobod, sergili)));
            case "bektemir" -> Location(new ArrayList<>(List.of(yashnobod, bektemir)));
            case "yakkasaroy" -> Location(new ArrayList<>(List.of(yashnobod, mirobod, yakkasaroy)));
            case "olmazor"-> Location(new ArrayList<>(List.of(yashnobod, mirobod, shayhontohur, olmazor)));
            case "mirzoulugbek"-> Location(new ArrayList<>(List.of(yashnobod, mirzoUlugbek)));
            case "uchtepa"-> Location(new ArrayList<>(List.of(yashnobod, mirobod, yakkasaroy, chilonzor, yashnobod)));
            default -> null;
        };
    }


    public Integer Olmazor(String qaerga){
        return switch (qaerga){
            case "yunusobod" -> Location(new ArrayList<>(List.of(olmazor, mirzoUlugbek, yunusobod)));
            case "mirobod" -> Location(new ArrayList<>(List.of(olmazor, shayhontohur, mirobod)));
            case "shayhontohur" -> Location(new ArrayList<>(List.of(olmazor, shayhontohur)));
            case "chilonzor"-> Location(new ArrayList<>(List.of(olmazor, shayhontohur, chilonzor)));
            case "sergili" -> Location(new ArrayList<>(List.of(olmazor, shayhontohur, chilonzor, sergili)));
            case "bektemir" -> Location(new ArrayList<>(List.of(olmazor, shayhontohur, mirobod, bektemir)));
            case "yakkasaroy" -> Location(new ArrayList<>(List.of(olmazor, shayhontohur, yakkasaroy)));
            case "yashnabod"-> Location(new ArrayList<>(List.of(olmazor, shayhontohur, mirobod, yashnobod)));
            case "mirzoulugbek"-> Location(new ArrayList<>(List.of(olmazor, shayhontohur, mirobod, mirzoUlugbek)));
            case "uchtepa"-> Location(new ArrayList<>(List.of(olmazor, uchtepa)));
            default -> null;
        };
    }

    public Integer Yakkasaroy(String qaerga){
        return switch (qaerga){
            case "yunusobod" -> Location(new ArrayList<>(List.of(yakkasaroy, mirobod, yunusobod)));
            case "mirobod" -> Location(new ArrayList<>(List.of(yakkasaroy, mirobod)));
            case "shayhontohur" -> Location(new ArrayList<>(List.of(yakkasaroy, shayhontohur)));
            case "chilonzor"-> Location(new ArrayList<>(List.of(yakkasaroy, chilonzor)));
            case "sergili" -> Location(new ArrayList<>(List.of(yakkasaroy, sergili)));
            case "bektemir" -> Location(new ArrayList<>(List.of(yakkasaroy, shayhontohur, mirobod, bektemir)));
            case "olmazor" -> Location(new ArrayList<>(List.of(yakkasaroy, shayhontohur, olmazor)));
            case "yashnabod"-> Location(new ArrayList<>(List.of(yakkasaroy, mirobod, yashnobod)));
            case "mirzoulugbek"-> Location(new ArrayList<>(List.of(yakkasaroy, mirobod, mirzoUlugbek)));
            case "uchtepa"-> Location(new ArrayList<>(List.of(yakkasaroy, chilonzor, uchtepa)));
            default -> null;
        };
    }

    public Integer Mirobod(String qaerga){
        return switch (qaerga){
            case "yunusobod" -> Location(new ArrayList<>(List.of(mirobod, yunusobod)));
            case "yakkasaroy" -> Location(new ArrayList<>(List.of(mirobod, yakkasaroy)));
            case "shayhontohur" -> Location(new ArrayList<>(List.of(mirobod, shayhontohur)));
            case "chilonzor"-> Location(new ArrayList<>(List.of(mirobod, yakkasaroy, chilonzor)));
            case "sergili" -> Location(new ArrayList<>(List.of(mirobod, sergili)));
            case "bektemir" -> Location(new ArrayList<>(List.of(mirobod, bektemir)));
            case "olmazor" -> Location(new ArrayList<>(List.of(mirobod, shayhontohur, olmazor)));
            case "yashnabod"-> Location(new ArrayList<>(List.of(mirobod, yashnobod)));
            case "mirzoulugbek"-> Location(new ArrayList<>(List.of(mirobod, mirzoUlugbek)));
            case "uchtepa"-> Location(new ArrayList<>(List.of(mirobod, yakkasaroy, chilonzor, uchtepa)));
            default -> null;
        };
    }

    public Integer MirzoUlugbek(String qaerga){
        return switch (qaerga){
            case "yunusobod" -> Location(new ArrayList<>(List.of(mirzoUlugbek, yunusobod)));
            case "yakkasaroy" -> Location(new ArrayList<>(List.of(mirzoUlugbek, mirobod, yakkasaroy)));
            case "shayhontohur" -> Location(new ArrayList<>(List.of(mirzoUlugbek, mirobod, shayhontohur)));
            case "chilonzor"-> Location(new ArrayList<>(List.of(mirzoUlugbek, mirobod, yakkasaroy, chilonzor)));
            case "sergili" -> Location(new ArrayList<>(List.of(mirzoUlugbek, mirobod, sergili)));
            case "bektemir" -> Location(new ArrayList<>(List.of(mirzoUlugbek, yashnobod, bektemir)));
            case "olmazor" -> Location(new ArrayList<>(List.of(mirzoUlugbek, yunusobod, olmazor)));
            case "yashnabod"-> Location(new ArrayList<>(List.of(mirzoUlugbek, yashnobod)));
            case "mirobod"-> Location(new ArrayList<>(List.of(mirzoUlugbek, mirobod)));
            case "uchtepa"-> Location(new ArrayList<>(List.of(mirzoUlugbek, mirobod, shayhontohur, uchtepa)));
            default -> null;
        };
    }

    public Integer Bektemir(String qaerga){
        return switch (qaerga){
            case "yunusobod" -> Location(new ArrayList<>(List.of(bektemir, yashnobod, mirzoUlugbek, yunusobod)));
            case "yakkasaroy" -> Location(new ArrayList<>(List.of(bektemir, mirobod, yakkasaroy)));
            case "shayhontohur" -> Location(new ArrayList<>(List.of(bektemir, mirobod, shayhontohur)));
            case "chilonzor"-> Location(new ArrayList<>(List.of(bektemir, mirobod, yakkasaroy, chilonzor)));
            case "sergili" -> Location(new ArrayList<>(List.of(bektemir, sergili)));
            case "mirzoulugbek" -> Location(new ArrayList<>(List.of(bektemir, yashnobod, mirzoUlugbek)));
            case "olmazor" -> Location(new ArrayList<>(List.of(bektemir, mirobod, shayhontohur, olmazor)));
            case "yashnabod"-> Location(new ArrayList<>(List.of(bektemir, yashnobod)));
            case "mirobod"-> Location(new ArrayList<>(List.of(bektemir, mirobod)));
            case "uchtepa"-> Location(new ArrayList<>(List.of(bektemir, sergili, chilonzor, uchtepa)));
            default -> null;
        };
    }




    public Integer Location(List<Tuman> tumanlar){
        String[] tumanlarNomi = new String[tumanlar.size()];
        Integer masofa = 0;
        for (int i = 0; i < tumanlar.size(); i++) masofa += tumanlar.get(i).masofa;
        return masofa;
    }








}