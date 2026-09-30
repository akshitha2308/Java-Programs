class Phone {
    void call () {
        System.out.println("Calling...");
    }
}

class SmartPhone extends Phone {
    void browse() {
        System.out.println("Browsing internet...");
    }
}

public class Main7 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.browse();
    }
}