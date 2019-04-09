package com.gbuckland

class Surgery {
String name
String address
String postcode
int telephone
int numberOfPatients
String description
int openingTime

String toString(){
return name
}

static hasMany=[receptionists:Receptionist,doctors:Doctors,nurses:Nurse,patients:Patient,appointments:Appointment]

    static constraints = {
name nullable: false, blank: false
address nullable: false, blank: false
postcode nullable: false, blank:false
telephone nullable: false, blank: false
numberOfPatients nullable: false, blank: false, min:1, max:50
description widget: 'textarea', nullable: false, blank: false
openingTime nullable: false, blank: false
    }
}
