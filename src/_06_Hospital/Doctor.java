package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	ArrayList<Patient>patientList = new ArrayList<Patient>();
	public void assignPatient(Patient patient) {
		patientList.add(patient);
	}
	public ArrayList<Patient> getPatients() {
		return patientList;
	}
	public void doMedicine() {
		for (int i = 0; i < patientList.size(); i++) {
			patientList.get(i).setFeelsCaredFor(true);
		}
	}
}
