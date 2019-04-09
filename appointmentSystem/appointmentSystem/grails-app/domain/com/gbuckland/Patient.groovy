package com.gbuckland

class Patient {
String patientName
String patientAddress
String patientResidence
Date patientDob
String patientID
Date dateRegistered
String patientPhone

Appointment theappointment


String toString(){
return patientName
}

static hasMany=[prescriptions:Prescription,surgerys:Surgery,doctors:Doctors]
static belongsTo=[Surgery,Doctors]

    static constraints = {
patientName nullable: false, blank: false
patientAddress nullable: false, blank: false
patientResidence nullable: false, blank: false
patientDob nullable: false, blank: false
patientID nullable: false, blank: false
dateRegistered nullable: false, blank: false
patientPhone nullable: false, blank: false
theappointment nullable: true, blank: true
    }
}
