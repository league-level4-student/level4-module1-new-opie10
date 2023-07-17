package _06_Hospital;

import java.util.ArrayList;
import java.util.Stack;

public class Hospital {
	ArrayList<Patient>patientList = new ArrayList<Patient>();
	Stack<Patient>patientStack = new Stack<Patient>();
	ArrayList<Doctor>availableDoctors = new ArrayList<Doctor>();
	public void addDoctor(Doctor doc) {
		availableDoctors.add(doc);
	}
	public void addPatient(Patient pat) {
		patientList.add(pat);
		patientStack.add(pat);
	}
	public ArrayList<Doctor> getDoctors() {
		
		return availableDoctors;
	}
	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patientList;
	}
	public void assignPatientsToDoctors() throws DoctorFullException {
		
		for (int i = 0; i < availableDoctors.size(); i++) {
			
			if(patientStack.size()>3) {
			for (int j = 0; j < 3; j++) {
				availableDoctors.get(i).assignPatient(patientStack.pop());
			}
			}
			else {
				
				for (int j = 0; j < patientStack.size()+1; j++) {
					
					availableDoctors.get(i).assignPatient(patientStack.pop());
				}
			}
		}
		// TODO Auto-generated method stub
		
		
	}
	
	
}
