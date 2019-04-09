package com.gbuckland

class Nurse {
String nurseName
String qualifications
String nurseEmail
String nurseOffice
int nursePhone

String toString(){
return nurseName
}


static hasMany=[doctors:Doctors]
static belongs to =[Doctors,Patient]


    static constraints = {
nurseName nullable: false, blank: false
qualifications nullable: false, blank: false
nurseEmail nullable: false, blank: false
nurseOffice nullable: false, blank: false
nursePhone nullable: false, blank: false
    }
}
