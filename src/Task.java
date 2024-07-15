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
        StackTraceElement[] methods = thread.getStackTrace();
        if (methods.length<4){
        return null;}
        else return methods[methods.length-2].toString();
    }
}
