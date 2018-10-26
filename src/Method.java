public class Method {
    public static int generateRandomIndex(int max){
        return (int)(Math.random()*max); //Vi laver en metode, der returner et tilfældigt nummer i index
    }
    public static String generateRacer(){
        String[] racer = {"Nokotahest", "Slesvigsk Koldblod", "Pampa Porse", //vi bruger et array med racer
                        "Mustang", "Islandsk hest"};

        return racer[generateRandomIndex(racer.length-1)]; //vores metoder giver os en tilfældig heste-race
        };

        public static String generateHorseColor() {
            String[] color = {"Sort", "Brun", "Hvid", "Plettet"};
            return color[generateRandomIndex(color.length-1)]; //Vi bruger samme struktur, men til at finde en farve
        }

    public static void main(String[] args) {
        System.out.println(generateRacer() + " " + generateHorseColor()); //Vi kalder nu på de to tidligere metoder til at give os en hest
    }
}

