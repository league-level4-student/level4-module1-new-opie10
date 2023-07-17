package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	ArrayList<Patient>patientList = new ArrayList<Patient>();
	public void assignPatient(Patient patient) throws DoctorFullException {
		
		if(patientList.size()>2) {
			throw new DoctorFullException();
		}
		else {
		patientList.add(patient);
		}
	}
	public ArrayList<Patient> getPatients() {
		return patientList;
	}
	public void doMedicine() {
		for (int i = 0; i < patientList.size(); i++) {
			patientList.get(i).setFeelsCaredFor(true);
		}
	}
	public boolean makesHouseCalls() {
		return false;
	}
	public boolean performsSurgery() {
		return false;
	}
}
