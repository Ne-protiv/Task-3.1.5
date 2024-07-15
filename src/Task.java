public class Task {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        Thread thread =Thread.currentThread();
        StackTraceElement[] methodAndClasses = thread.getStackTrace();
        int numberOfCallingClass = methodAndClasses.length-2;
        if (numberOfCallingClass<2){
        return null;}
        else {
            StackTraceElement callingMethod = methodAndClasses[numberOfCallingClass];
            return callingMethod.getClassName() + " " + callingMethod.getMethodName();
        }
    }
}
