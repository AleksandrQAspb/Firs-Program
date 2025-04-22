public class Main {

    public static void main(String[] args) {
        // Объявляем переменные для входных данных
        int ticketPrice = 13676; // стоимость билета в рублях
        int rublesPerMile = 20;   // количество рублей для одной бонусной мили

        // Рассчитываем количество бонусных миль
        int bonusMiles = ticketPrice / rublesPerMile;

        // Выводим результат на экран
        System.out.println("Начисленные бонусные мили: " + bonusMiles);
    }
}

