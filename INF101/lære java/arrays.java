public class arrays {
    public static void main(String[] args) {
        //når vi skriver int value = 5;, reserverer int 32bit med minne og putter value = 5 inn i minnet
        int value = 5;

        //en array kan referere til en hel liste med int, int[] values
        //values holder her ingen tall, den kan bare refferere til en liste med tall
        //int = reserverer plass, int[] legger en merkelapp
        //value har en verdi, mens values bare refererer
        int[] values;

        //for å så reservere plass lager vi en ny array ned new int[x]
        //x blir hvor mange int du skal ha plass til eller hvor mange 32bits du skal resrevere i minnet.

        values = new int[3];
        //for å nå peke på en spesifikk verdi kan du skrive eks value[0], da får du ut den første verdien

        //System.out.println(values[0]);
        //default verdien i listen vil alltid være null for alle plassene men du kan også lagre dine egne verdier
        values[0] = 10;
        //System.out.println(values[0]);

        //du kan bruke for loop for å gå gjennom alle verdiene, en hver array vet hvor lang den er, values.length.
        for(int i = 0;i < values.length;i++){
            //System.out.println(values[i]);
        }
        int[] nummer = {1,2,3,4};
        for (int i = 0; i < nummer.length; i++){
            //System.out.println(nummer[i]);
        }
        //tekst arrays er mye det samme men du skriver String[]
        //en annen måte du kan bruke for loop er slik:
        String[] frukter = {"banan", "epple","apelsin"};
        for(String frukt: frukter){
            //System.out.println(frukt);
        }
        //da lager du et string variabel frukt som java da setter som de forskjellige stringene i frukter 
        //dette fungerer også med ints
        int[] dager = {2,5,7};
        for (int dag:dager){
            //System.out.println(dag);
        }
        //forskjellen på String og int med tankte på type er at int er primitivt og reserverer minne uasnett mens String er en klasse
        //og holder bare nok minne for å referere til en string. du ser dette siden String er skrevet med stor bokstav og int er ikke
        //default verdien til en string er "null".

        //multidimensjonelle arrays:
        //en dimensjonale arrays er hvor det bare trengs en index for å finne verdien i arrayen, en dimensjon.
        int[] verdier = {1,4,67};
        int verdi = verdier[0]; // bare en dimensjon "0" for å finne verdien.
        //multidimensjonale arrays trenger mer enn en index.
        //en multidimensjoal array kan tenkes på som arrays inni arrays.
        //todimensjonal:
        int[][] grid = {
            {1,4,9},
            {5,3},
            {2,6,2,1,7}
        };
        //når du da skal finne verdien skriver du først rad og så kolonne
        int tall = grid[1][0]; //får verdien 5
        //du kan også lage de slik:
        String[][] hilsen = new String[2][5];//her spesifiserer du hvor mange rader og kollonner den skal ha på forhånd 
        hilsen[0][0] = "hei hvordan går det";
        hilsen[0][1] = "hei, hva skal du?";
        //du kan også her bruke en for loop til å gå gjennom arrayen, med at du først går gjennom rad og så kolonne, så du må bruke to for looper
        /*for(int row = 0; row < grid.length;row++){
            for(int kol = 0; kol < grid[row].length;kol++){
                System.out.print(grid[row][kol] + " ");//når du bruker print og ikke println kommer alt på samme linje
            }
            System.out.println();
        }
        */
      
    }
}
