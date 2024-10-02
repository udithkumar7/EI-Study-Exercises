// Singleton Class
class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        // Private constructor to prevent instantiation
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Database connected.");
    }
}

// Demo Class
public class SingletonPatternDemo {
    public static void main(String[] args) {
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();
    }
}
