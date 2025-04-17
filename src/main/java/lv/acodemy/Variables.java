package lv.acodemy;

public class Variables {
    public static void main(String[] args) {

        // ===== byte (очень маленькие целые числа от -128 до 127// 8 битов) =====
        byte ageInYears = 27;
        byte roomNumber = 42;
        byte temperatureDelta = -10;
        byte numberOfCores = 8;
        byte daysInWeek = 7;

        // ===== short (меньше int, но больше byte: от -32,768 до 32,767//16 битов) =====
        short year = 2025;
        short studentCount = 1500;
        short screenWidth = 1080;
        short bookPages = 320;
        short houseNumber = 1234;

        // ===== int (целые числа/32 бита) =====
        int age = 27;
        int birthYear = 1997;
        int temperature = -5;
        int population = 1900000;
        int score = 87;
        int speed = 120;
        int daysInYear = 365;
        int fileSizeMB = 512;
        int bankBalance = 10000;
        int heightCM = 186;

        // ===== long (очень большие целые числа//64 бита) =====
        long worldPopulation = 8000000000L;
        long distanceToSun = 149600000000L; // in meters
        long userId = 9876543210L;
        long fileSizeBytes = 1048576000L; // ~1 GB
        long bankAccountBalance = 20000000000L;

        // ===== float (дробные числа, с суффиксом f//32 бита) =====
        float averageScore = 8.5f;
        float fuelLevel = 25.3f;
        float discountPercent = 15.5f;
        float coffeeTemperature = 65.2f;
        float screenBrightness = 0.75f;


        // ===== double (дробные числа//64 бита) =====
        double pi = 3.14159;
        double price = 19.99;
        double weightKG = 99.8;
        double distanceKM = 384400.0;
        double taxRate = 0.21;
        double temperatureC = 16.6;
        double gForce = 9.81;
        double rating = 4.8;
        double latitude = 56.9496;
        double longitude = 24.1052;

        // ===== boolean (логические значения) =====
        boolean isRaining = false;
        boolean isLoggedIn = true;
        boolean hasDriverLicense = true;
        boolean isAdmin = false;
        boolean isMarried = false;


        // ===== char (одиночные символы//16 битов) =====
        char grade = 'A';
        char currency = '€';
        char gender = 'M';
        char initial = 'V';
        char quote = '"';
        char escape = '\\';
        char newline = '\n';
        char tab = '\t';
        char symbol = '#';
        char emoji = '\u263A'; // ☺

        // ===== String (строки, что тут еще сказать) =====
        String firstName = "Vladimirs";
        String lastName = "Lazarevs";
        String city = "Riga";
        String country = "Latvia";
        String email = "volodjaTop@example.com";
        String phone = "+37113371337";
        String occupation = "QA Engineer (i hope so)";
        String hobby = "Acodemy Courses";
        String favoriteGame = "KSP";
        String greeting = "Hello, Nikita!";
    }
}