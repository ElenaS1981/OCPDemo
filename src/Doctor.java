public class Doctor extends Employee{
    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor in action...");
    }

    @Override
    public void performDuties() {
        prescribeMedication();
        diagnosePatients();
    }

    private void prescribeMedication(){
        System.out.println("Prescribe medicine");
    }

    private void diagnosePatients(){
        System.out.println("Diagnosing patients");
    }
}
