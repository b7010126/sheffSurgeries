package com.gbuckland

class Appointment {
Date appDate
String appTime
int appDuration
String roomNumber

String toString(){
return roomNumber
}

Patient thepatient

static hasMany=[surgerys:Surgery]
static hasMany=[surgerys:Surgery]
static belongsTo=[Surgery]

    static constraints = {
appDate nullable: false, blank: false
appTime nullable: false, blank: false
appDuration nullable: false, blank: false
roomNumber nullable: false, blank: false
    }
}
