class Staff {
    void work() {
        System.out.println("Staff working");
    }
}

class Doctor extends Staff {
    void work() {
        System.out.println("Doctor treats patients");
    }
}

class Nurse extends Staff {
    void work() {
        System.out.println("Nurse assists doctor");
    }
}

class Receptionist extends Staff {
    void work() {
        System.out.println("Receptionist manages appointments");
    }
}

public class HospitalStaffDemo {
    public static void main(String[] args) {
        Staff s;

        s = new Doctor();
        s.work();

        s = new Nurse();
        s.work();

        s = new Receptionist();
        s.work();
    }
}
