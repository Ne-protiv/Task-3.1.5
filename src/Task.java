public class Task {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        Thread thread = Thread.currentThread();
        StackTraceElement[] methodAndClasses = thread.getStackTrace();
        if (methodAndClasses.length < 4) {
            return null;
        } else {
            StackTraceElement callingMethod = methodAndClasses[2];
            return callingMethod.getClassName() + " " + callingMethod.getMethodName();
        }
    }
}
