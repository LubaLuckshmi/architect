package seminar6Dz.facade;
class SubsystemA {
    public void methodA() {
        System.out.println("Subsystem A method");
    }
}

class SubsystemB {
    public void methodB() {
        System.out.println("Subsystem B method");
    }
}

class SubsystemC {
    public void methodC() {
        System.out.println("Subsystem C method");
    }
}

class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;
    private SubsystemC subsystemC;

    public Facade() {
        subsystemA = new SubsystemA();
        subsystemB = new SubsystemB();
        subsystemC = new SubsystemC();
    }

    public void operate() {
        subsystemA.methodA();
        subsystemB.methodB();
        subsystemC.methodC();
    }
}

