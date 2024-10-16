import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static volatile Logger instance;
    private static final Object mutex = new Object();
    private LogLevel logLevel;
    private final String logFilePath;

    // Приватный конструктор для предотвращения создания объекта извне
    private Logger(String filePath) {
        this.logFilePath = filePath;
        this.logLevel = LogLevel.INFO;
    }

    // Метод GetInstance с ленивой инициализацией и блокировкой
    public static Logger getInstance(String filePath) {
        if (instance == null) {
            synchronized (mutex) {
                if (instance == null) {
                    instance = new Logger(filePath);
                }
            }
        }
        return instance;
    }


    public void setLogLevel(LogLevel level) {
        this.logLevel = level;
    }

    // Метод для логирования сообщений
    public void log(String message, LogLevel level) {
        if (level.ordinal() >= this.logLevel.ordinal()) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(this.logFilePath, true))) {
                writer.println("[" + level + "] " + message);
            } catch (IOException e) {
                System.out.println("Ошибка при записи в лог-файл: " + e.getMessage());
            }
        }
    }
}

// Enum для уровней логирования
enum LogLevel {
    INFO, WARNING, ERROR
}
