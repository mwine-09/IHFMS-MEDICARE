package debug;

public class DebugLogger {
    public static final String RESET_COLOR = "\u001B[0m";
    public static final String ERROR_COLOR = "\u001B[31m";
    public static final String SUCCESS_COLOR = "\u001B[32m";
    public static final String DEBUG_YELLOW = "\u001B[33m";
    
    // log warning message
    public static void printInfo(String message) {
        System.out.println(DEBUG_YELLOW + "INFO: " + message + RESET_COLOR + "\n\n");
    }
    
    // log success message
    public static void logSuccess(String message) {
        System.out.println(SUCCESS_COLOR + "✔ PASSED: " + message + RESET_COLOR + "\n\n");
    }
    
    // log error message
    public static void logError(String message) {
        System.out.println(ERROR_COLOR + "✱ AN ERROR OCCURED: " + message + RESET_COLOR + "\n\n");
    }
}
