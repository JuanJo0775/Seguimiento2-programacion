package Medical;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class MedicalAppointment {
    private String appointmentCode;
    private String date;
    private String time;
    private String consultationRoom;
    private String doctorName;
    private String patientName;
    private String medicalCenter;

    public MedicalAppointment(String appointmentCode, String date, String time, String consultationRoom, String doctorName, String patientName, String medicalCenter) {
        this.appointmentCode = appointmentCode;
        this.date = date;
        this.time = time;
        this.consultationRoom = consultationRoom;
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.medicalCenter = medicalCenter;
    }

    public String getAppointmentCode() {
        return this.appointmentCode;
    }

    public void setAppointmentCode(String appointmentCode) {
        this.appointmentCode = appointmentCode;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getConsultationRoom() {
        return this.consultationRoom;
    }

    public void setConsultationRoom(String consultationRoom) {
        this.consultationRoom = consultationRoom;
    }

    public String getDoctorName() {
        return this.doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPatientName() {
        return this.patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getMedicalCenter() {
        return this.medicalCenter;
    }

    public void setMedicalCenter(String medicalCenter) {
        this.medicalCenter = medicalCenter;
    }

    public void createAppointment() {
        System.out.println("Appointment created with code: " + this.appointmentCode);
    }

    public void consultAppointmentDetails() {
        System.out.println("Appointment details:");
        System.out.println("Code: " + this.appointmentCode);
        System.out.println("Date: " + this.date);
        System.out.println("Time: " + this.time);
        System.out.println("Consultation Room: " + this.consultationRoom);
        System.out.println("Doctor's Name: " + this.doctorName);
        System.out.println("Patient's Name: " + this.patientName);
        System.out.println("Medical Center: " + this.medicalCenter);
    }

    public void changeTime(String newTime) {
        this.time = newTime;
        System.out.println("Appointment time changed to: " + newTime);
    }
}

