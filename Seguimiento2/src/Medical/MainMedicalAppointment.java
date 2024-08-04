package Medical;

public class MainMedicalAppointment {
    public MainMedicalAppointment() {
    }

    public static void main(String[] args) {
        MedicalAppointment appointment = new MedicalAppointment("001", "2024-07-20", "10:00", "Consultation Room 1", "Dr. Pérez", "Juan Pérez", "ABC Medical Center");
        appointment.createAppointment();
        appointment.consultAppointmentDetails();
        appointment.changeTime("9:00");
        appointment.consultAppointmentDetails();
    }
}
