public class stringBuilder_stringFormat {
    public static void main(String[] args) {
        //lite effektivt, tar opp mye minne i systemet da du lager nye stings og ikke endrer den første.
        String info = "";
        info += "hei jeg heter thomas.";
        info += " ";
        info += "jeg spiller badminton";

        System.out.println(info);

        //stringBuilder gjør at du ikke tar opp mye plass.
        StringBuilder teks = new StringBuilder("hei");//blir laget med det som er inni parantesen, eks hei, kan også være tom
        teks.append(" jeg heter thomas");
        System.out.println(teks.toString());

        //formatering
        //\n = ny linje
        //\t = tab
        
        System.out.println("jeg heter\nthomas \t og jeg spiller badminton");

    }
}
