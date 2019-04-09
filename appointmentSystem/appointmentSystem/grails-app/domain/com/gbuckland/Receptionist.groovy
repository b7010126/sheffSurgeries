package com.gbuckland

class Receptionist {
String recepName
String recepEmail
String recepUsername
String recepPassword
int recepPhone

static hasMany=[surgerys:Surgery]
static belongsTo=[Surgery]

String toString(){
return recepName
}

    static constraints = {
recepName nullable: false, blank: false
recepEmail nullable: false, blank: false
recepUsername nullable: false, blank: false
recepPassword nullable: false, blank: false, password: true
recepPhone nullable: false, blank: false
    }
}
